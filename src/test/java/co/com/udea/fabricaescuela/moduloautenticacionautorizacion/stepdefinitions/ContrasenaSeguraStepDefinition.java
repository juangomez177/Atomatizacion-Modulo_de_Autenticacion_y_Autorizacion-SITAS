package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.contrasenasegura.ValidationPasswordSafe;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.contrasenasegura.TypingThe;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaregistro.ClickOnRegister;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

public class ContrasenaSeguraStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(ContrasenaSeguraStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Steps
    private PestanaRegistroStepDefinition pestanaRegistroStepDefinition;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }

    @Given("que estoy en la pagina pricipal de la aplicacion de la pestana de resitro")
    public void queEstoyEnLaPaginaPricipalDeLaAplicacionDeLaPestanaDeResitro() {

        //Se garantiza para llegar al formualrio de registro se hace mediante PestanaRegistroStepDefinition
        pestanaRegistroStepDefinition.setup();
        pestanaRegistroStepDefinition.queEstoyEnLaPaginaDeRegistro();
    }

    @When("ingreso una cotrasena generica {string} que no cumple los estandares")
    public void ingresoUnaCotrasenaGenericaQueNoCumpleLosEstandares(String contrasena) {
        user.attemptsTo(TypingThe.password(contrasena));
    }

    @When("doy click al boton de registrar cuenta")
    public void doyClickAlBotonDeRegistrarCuenta() {
        user.attemptsTo(ClickOnRegister.button());
    }
    
    @And("deberia ver un mensaje de advertencia indicando que la contrasena no es segura")
    public void deberiaVerUnMensajeDeAdvertenciaIndicandoQueLaContrasenaNoEsSegura() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationPasswordSafe.message(), Matchers.containsString("Contrasena Insegura")));

    }
}
