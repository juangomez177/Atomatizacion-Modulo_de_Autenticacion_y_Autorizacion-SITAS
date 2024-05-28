package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanainiciosesion.ValidationLoginAccount;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanainiciosesion.ClickOnLogin;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanainiciosesion.LoginThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
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

public class PestanaInicioSesionStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(PestanaInicioSesionStepDefinition.class);

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

    @Given("que estoy en la pagina de inicio de sesion")
    public void queEstoyEnLaPaginaDeInicioSesion() {

        //Se garantiza que para llegar  a la pagina de inicio de sesion se hace mediante los pasos de la url principal y el boton de login
        botonInicioSesionStepDefinition.setup();
        botonInicioSesionStepDefinition.queEstoyEnCualquierPaginaDeLaAplicacionParaInicioSesion();
        botonInicioSesionStepDefinition.hagoClicEnElBotonDeLogin();
        botonInicioSesionStepDefinition.deberiaSerRedirigidoALaPaginaDeInicioDeSesion();

        //OnStage.theActorCalled("usuario").attemptsTo(OpenAnyPage.browser("https://frontend-virtual-72qyi8vl3-lauratobons-projects.vercel.app/auth/login"));

    }

    @When("ingreso mi correo electronico {string} y contrasena {string}")
    public void ingresoCorreoElectronicoYContrasena(String correo, String contrasena) {
        user.attemptsTo(LoginThe.credentials(correo, contrasena));
    }

    @And("hago clic en el boton Iniciar Sesion")
    public void hagoClicEnElBotonIniciarSesion() {
        user.attemptsTo(ClickOnLogin.button());
    }

    @Then("deberia ser mostrar un mensaje de confirmacion para ser redirigido a la pagina principal")
    public void deberiaSerMostrarUnMensajeDeConfirmacionParaSerRedirigidoALaPaginaPrincipal() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationLoginAccount.loadCredentials(), Matchers.containsString("Cuenta Logueada Correctamente")));

    }


    @When("ingreso un correo electronico {string} y contrasena {string} incorrectos por {int} <veces>")
    public void ingresoUnCorreoElectronicoYContrasenaIncorrectosPorVeces(String arg0, String arg1, int arg2) {
    }

    @Then("la cuenta del usuario se bloquea automáticamente, mostrando un mensaje de cuenta boqueada")
    public void laCuentaDelUsuarioSeBloqueaAutomáticamenteMostrandoUnMensajeDeCuentaBoqueada() {
    }

    @Given("que el usuario intenta iniciar sesion con credenciales incorrectas dos veces")
    public void queElUsuarioIntentaIniciarSesionConCredencialesIncorrectasDosVeces() {
    }

    @When("el usuario intenta iniciar sesion con credenciales incorrectas por tercera vez")
    public void elUsuarioIntentaIniciarSesionConCredencialesIncorrectasPorTerceraVez() {
    }

    @Then("nuevamente se pide el inicio de sesion, sin saltar el bloqueo de la cuenta ni el mensaje de bloqueo")
    public void nuevamenteSePideElInicioDeSesionSinSaltarElBloqueoDeLaCuentaNiElMensajeDeBloqueo() {
    }

    @And("se permite ingresar indefinidamente las credenciales sin restricción de bloqueo")
    public void sePermiteIngresarIndefinidamenteLasCredencialesSinRestricciónDeBloqueo() {
    }
}
