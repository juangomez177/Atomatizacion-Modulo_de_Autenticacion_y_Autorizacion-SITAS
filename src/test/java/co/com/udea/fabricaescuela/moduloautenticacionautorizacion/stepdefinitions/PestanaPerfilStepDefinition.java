package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaperfil.ValidationEditPage;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaperfil.ValidationEditProfile;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaperfil.ClickOnEditProfile;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaperfil.ClickOnProfileIcon;
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

public class PestanaPerfilStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(PestanaPerfilStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Steps
    private PestanaInicioSesionStepDefinition pestanaInicioSesionStepDefinition;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }

    @Given("que ya estoy autenticado en la plataforma con correo {string} y contrasena {string}")
    public void queYaEstoyAutenticadoEnLaPlataforma(String correo, String contrasena) {

        // Se garantiza de autenticarse mediante PestanaInicioSesionStepDefinition.class
        pestanaInicioSesionStepDefinition.setup();
        pestanaInicioSesionStepDefinition.ingresoCorreoElectronicoYContrasena(correo, contrasena);
        pestanaInicioSesionStepDefinition.hagoClicEnElBotonIniciarSesion();
        pestanaInicioSesionStepDefinition.deberiaSerMostrarUnMensajeDeConfirmacionParaSerRedirigidoALaPaginaPrincipal();
    }

    @When("hago clic en el icono de perfil en la barra de navegacion")
    public void hagoClicEnElIconoDePerfilEnLaBarraDeNavegacion() {
        user.attemptsTo(ClickOnProfileIcon.button());
    }

    @Then("se despliega el menu con varias opciones, incluida la opcion de Editar Perfil")
    public void seDespliegaElMenuConVariasOpcionesIncluidaLaOpcionDeEditarPerfil() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationEditProfile.isPresent(), Matchers.containsString("Editar Perfil")));
    }

    @And("al hacer clic en Editar Perfil")
    public void alHacerClicEnEditarPerfil() {
        user.attemptsTo(ClickOnEditProfile.button());
    }

    @Then("se dirige a la pestana de perfil cargando los datos actuales del usuario con Nombre {string}, Apellido {string}, Correo Electronico {string}, Pais {string}, Telefono {string} y Contrasena {string}")
    public void seDirigeALaPestanaDePerfilCargarandoLosDatosActualesDelUsuarioConNombreApellidoCorreoElectronicoPaisTelefonoYContrasena(String nombre, String apellido, String correo, String pais, String telefono, String contrasena) {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationEditPage.isPresent(), Matchers.containsString("Actualizar Datos")));
    }

}
