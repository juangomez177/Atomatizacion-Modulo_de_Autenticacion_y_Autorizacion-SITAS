package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion.ValidationNavBar;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.abrirSitio.OpenAnyPage;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion.ClickOnBooking;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion.ClickOnChecking;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion.ClickOnFlySearch;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
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

public class BarraNavegacionStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(BarraNavegacionStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }

    @Given("que estoy en una pagina de la aplicacion web")
    public void queEstoyEnUnaPaginaDeLaAplicacionWeb() {
        user.attemptsTo(OpenAnyPage.browser(new NavigationBarPage()));
    }

    @When("observo la barra de navegacion junto con las distintas opciones")
    public void observoLaBarraDeNavegacionJuntoConLasDistintasOpciones() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationNavBar.isPresent(), Matchers.containsString("Singapur Airline")));
    }

    @And("doy clik al boton del moludo {string} que redirige a Busqueda de vuelos")
    public void doyClikAlBotonDelMoludoQueRedirigeABusquedaDeVuelos(String arg0) {
        user.attemptsTo(ClickOnFlySearch.button());
    }

    @Then("deberia de ser redirigido a la pagina de Busqueda de vuelos")
    public void deberiaDeSerRedirigidoALaPaginaDeBusquedaDeVuelos() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationNavBar.isPresent(), Matchers.containsString("Busqueda de vuelos")));
    }

    @And("doy clik al boton del moludo {string} que redirige a Checking")
    public void doyClikAlBotonDelMoludoQueRedirigeAChecking(String arg0) {
        user.attemptsTo(ClickOnChecking.button());
    }

    @Then("deberia de ser redirigido a la pagina de Checking")
    public void deberiaDeSerRedirigidoALaPaginaDeChecking() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationNavBar.isPresent(), Matchers.containsString("Checking")));
    }

    @And("doy clik al boton del moludo {string} que redirige a Reserva")
    public void doyClikAlBotonDelMoludoQueRedirigeAReserva(String arg0) {
        user.attemptsTo(ClickOnBooking.button());
    }

    @Then("deberia de ser redirigido a la pagina de Reserva")
    public void deberiaDeSerRedirigidoALaPaginaDeReserva() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationNavBar.isPresent(), Matchers.containsString("Reserva")));
    }
}
