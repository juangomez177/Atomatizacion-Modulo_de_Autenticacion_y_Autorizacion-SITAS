package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.ultimoingresofallido.ValidationAccount;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.ultimoingresofallido.LoginThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class UltimoIngresoFallidoStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(UltimoIngresoFallidoStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Steps
    private BotonInicioSesionStepDefinition botonInicioSesionStepDefinition;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }

    @Given("que estoy en la pagina de Inicio de Sesion")
    public void queEstoyEnLaPaginaDeInicioDeSesion() {
//Se garantiza que para llegar  a la pagina de inicio de sesion se hace mediante los pasos de la url principal y el boton de login
        botonInicioSesionStepDefinition.setup();
        botonInicioSesionStepDefinition.queEstoyEnCualquierPaginaDeLaAplicacionParaInicioSesion();
        botonInicioSesionStepDefinition.hagoClicEnElBotonDeLogin();
        botonInicioSesionStepDefinition.deberiaSerRedirigidoALaPaginaDeInicioDeSesion();
    }

    @When("ingreso un correo electronico {string} y contrasena {string} incorrectos por {int} <veces>")
    public void ingresoUnCorreoElectronicoYContrasenaIncorrectosPorVeces(String correo, String contrasena, int veces) {
        for (int i = 0; i < veces; i++) {
            user.attemptsTo(LoginThe.credentials(correo, contrasena));
        }
    }

    @Then("la cuenta del usuario se bloquea automaticamente, mostrando un mensaje de cuenta boqueada")
    public void laCuentaDelUsuarioSeBloqueaAutomaticamenteMostrandoUnMensajeDeCuentaBoqueada() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationAccount.isBlocked(), Matchers.containsString("Cuenta Bloqueada por 3 ingresoso fallidos")));

    }
}



