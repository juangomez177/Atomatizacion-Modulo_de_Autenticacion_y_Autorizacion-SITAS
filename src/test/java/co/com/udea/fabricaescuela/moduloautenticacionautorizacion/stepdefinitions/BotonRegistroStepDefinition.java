package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.botonregistro.ValidationRegisterPage;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.OpenAnyPage;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.botonregistro.ClickOnRegister;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class BotonRegistroStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(BotonRegistroStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }

    @Given("que estoy en cualquier pagina de la aplicacion para registrarme")
    public void queEstoyEnCualquierPaginaDeLaAplicacionParaRegistro() {
        user.attemptsTo(OpenAnyPage.browser(new SitasPage()));
    }

    @When("hago clic en el boton de registro")
    public void hagoClicEnElBotonDeRegistro() {

        user.attemptsTo(ClickOnRegister.button());
    }

    @Then("deberia ser redirigido a la pagina de registro")
    public void deberiaSerRedirigidoALaPaginaDeRegistro() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationRegisterPage.theSite(), Matchers.containsString("Crear cuenta")));

    }
}
