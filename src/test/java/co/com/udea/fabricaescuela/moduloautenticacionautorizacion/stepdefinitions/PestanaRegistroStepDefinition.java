package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaregistro.ValidationRegisterAccount;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.OpenAnyPage;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaregistro.ClickOnRegister;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaregistro.RegisterThe;
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
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PestanaRegistroStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(PestanaRegistroStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Steps
    private BotonRegistroStepDefinition botonRegistroStepDefinition;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }

    @Given("que estoy en la pagina de registro")
    public void queEstoyEnLaPaginaDeRegistro() {

        //Se garantiza que para llegar  a la pagina de registro se hace mediante los pasos de la url principal y el boton de registro
        /*botonRegistroStepDefinition.setup();
        botonRegistroStepDefinition.queEstoyEnCualquierPaginaDeLaAplicacionParaRegistro();
        botonRegistroStepDefinition.hagoClicEnElBotonDeRegistro();
        botonRegistroStepDefinition.deberiaSerRedirigidoALaPaginaDeRegistro();*/

        OnStage.theActorCalled("usuario").attemptsTo(OpenAnyPage.browser("https://frontend-virtual-72qyi8vl3-lauratobons-projects.vercel.app/auth/new-account"));

    }

    @When("ingreso todos los campos obligatorios con nombre {string}, apellido {string}, tipo documento {string}, documento {string}, correo {string}, contrasena {string}, pais {string}, telefono {string}")
    public void ingresoTodosLosCamposObligatorios(String nombre, String apellido, String tipoDocumento, String documento, String correo, String contrasena, String pais, String telefono) {
        user.attemptsTo(RegisterThe.credentials(nombre, apellido, tipoDocumento, documento, correo, contrasena, pais, telefono));
    }

    @And("doy click en el boton Crear cuenta")
    public void doyClickEnElBotonCrearCuenta() {
        user.attemptsTo(ClickOnRegister.button());
    }

    @Then("deberia ver un mensaje de exito indicando que la cuenta ha sido creada")
    public void deberiaVerUnMensajeDeExitoIndicandoQueLaCuentaHaSidoCreada() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationRegisterAccount.saveCredentials(), Matchers.containsString("Cuenta Creada Correctamente")));

    }

}
