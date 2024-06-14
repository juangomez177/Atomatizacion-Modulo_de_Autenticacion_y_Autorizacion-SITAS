package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.opcionesiniciosesion.ValidationFacebookLogin;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.opcionesiniciosesion.ValidationGoogleLogin;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion.ClickOnFacebookLogin;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion.ClickOnGoogleLogin;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion.LoginFacebook;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion.LoginGoogle;
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

public class OpcionesInicioSesionStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(OpcionesInicioSesionStepDefinition.class);

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

    @Given("que estoy en la pagina de inicio de sesion para opciones")
    public void queEstoyEnLaPaginaDeInicioDeSesionParaOpciones() {

        //Se garantiza que para llegar  a la pagina de inicio de sesion se hace mediante los pasos de la url principal y el boton de login
        botonInicioSesionStepDefinition.setup();
        botonInicioSesionStepDefinition.queEstoyEnCualquierPaginaDeLaAplicacionParaInicioSesion();
        botonInicioSesionStepDefinition.hagoClicEnElBotonDeLogin();
        botonInicioSesionStepDefinition.deberiaSerRedirigidoALaPaginaDeInicioDeSesion();
    }

    @When("hago clic en el boton de inicio de sesión con Google")
    public void hagoClicEnElBotonDeInicioDeSesionConGoogle() {
        user.attemptsTo(ClickOnGoogleLogin.button());
    }

    @Then("deberia ser redirigido automaticamente al flujo de autenticacion de Google para ingresar el {string} y contrasena {string} de Google")
    public void deberiaSerRedirigidoAutomaticamenteAlFlujoDeAutenticacionDeGoogleParaIngresarElYContrasenaDeGoogle(String correo, String contrasena) {
        user.attemptsTo(LoginGoogle.withCredentials(correo, contrasena));
    }

    @And("deberia de mostrar un mensaje inicio de sesion con Google es correcto")
    public void deberiaMostrarMensajeInicioDeSesionConGoogleEsCorrecto() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationGoogleLogin.isTrue(), Matchers.containsString("Inicio de sesión con Google es correcto")));
    }

    @When("hago clic en el boton de inicio de sesión con Facebook")
    public void hagoClicEnElBotonDeInicioDeSesionConFacebook() {
        user.attemptsTo(ClickOnFacebookLogin.button());
    }

    @Then("deberia ser redirigido automaticamente al flujo de autenticacion de Facebook para ingresar el {string} y contrasena {string} de Facebook")
    public void deberiaSerRedirigidoAutomaticamenteAlFlujoDeAutenticacionDeFacebookParaIngresarElYContrasenaDeFacebook(String correo, String contrasena) {
        user.attemptsTo(LoginFacebook.withCredentials(correo, contrasena));
    }

    @And("deberia de mostrar un mensaje inicio de sesion con Facebook es correcto")
    public void deberiaMostrarMensajeInicioDeSesionConFacebookEsCorrecto() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationFacebookLogin.isTrue(), Matchers.containsString("Inicio de sesión con Facebook es correcto")));
    }
}
