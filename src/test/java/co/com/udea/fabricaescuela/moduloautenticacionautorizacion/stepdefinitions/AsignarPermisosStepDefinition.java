package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.asignarpermisos.ValidationSaveRole;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos.ClickOnSaveRole;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos.ClickOnUser;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos.EditThe;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion.ClickOnRoleManagement;
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

public class AsignarPermisosStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(AsignarPermisosStepDefinition.class);

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

    @Given("que el administrador ha iniciado sesion en la aplicación web con correo {string} y contrasena {string}")
    public void queElAdministradorHaIniciadoSesionEnLaAplicacionWebConCorreoYContrasena(String correo, String contrasena) {

        // Se garantiza iniciar sesion mediante los steps de PestanaPerfilStepDefinition
        pestanaInicioSesionStepDefinition.setup();
        pestanaInicioSesionStepDefinition.queEstoyEnLaPaginaDeInicioSesion();
        pestanaInicioSesionStepDefinition.ingresoCorreoElectronicoYContrasena(correo, contrasena);
        pestanaInicioSesionStepDefinition.hagoClicEnElBotonIniciarSesion();
        pestanaInicioSesionStepDefinition.deberiaSerMostrarUnMensajeDeConfirmacionParaSerRedirigidoALaPaginaPrincipal();
    }

    @When("el administrador accede a la seccion de administracion de usuarios")
    public void elAdministradorAccedeALaSeccionDeAdministracionDeUsuarios() {
        user.attemptsTo(ClickOnRoleManagement.button());
    }

    @And("selecciona al usuario al que desea asignar permisos de administrador")
    public void seleccionaAlUsuarioAlQueDeseaAsignarPermisosDeAdministrador() {
        user.attemptsTo(ClickOnUser.button());

    }

    @And("selecciona la opcion para asignar permisos de administrador asignando un rol {string} al usuario seleccionado")
    public void seleccionaLaOpcionParaAsignarPermisosDeAdministradorAsignandoUnRolAlUsuarioSeleccionado(String rol) {
        user.attemptsTo(EditThe.role(rol));
    }

    @And("da click al boton de guardar cambios")
    public void daClickAlBotonDeGuardarCambios() {
        user.attemptsTo(ClickOnSaveRole.button());
    }

    @Then("deberia de aparecer un mensaje de confirmacion que el rol ha sido cambiado correctamente")
    public void deberiaDeAparecerUnMensajeDeConfirmacionQueElRolHaSidoCambiadoCorrectamente() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationSaveRole.isCorrect(), Matchers.containsString("Rol Cambiado Correctamente")));
    }
}
