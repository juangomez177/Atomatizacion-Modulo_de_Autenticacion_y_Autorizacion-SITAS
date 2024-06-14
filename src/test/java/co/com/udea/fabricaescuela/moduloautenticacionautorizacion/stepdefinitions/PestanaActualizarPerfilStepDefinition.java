package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaactualizarperfil.ValidationUpdateProfileAction;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaactualizarperfil.ValidationUpdateProfilePage;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil.ClickOnSaveChanges;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil.ClickOnUpdateProfile;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil.UpdateThe;
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

public class PestanaActualizarPerfilStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(PestanaActualizarPerfilStepDefinition.class);

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Steps
    private PestanaPerfilStepDefinition pestanaPerfilStepDefinition;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
        logger.info("Accediendo a la pagina");
    }


    @Given("soy un usuario logueado con correo {string} y contrasena {string}")
    public void soyUnUsuarioLogueadoConCorreoYContrasena(String correo, String contrasena) {

        // Se garantiza iniciar sesion mediante los steps de PestanaPerfilStepDefinition
        pestanaPerfilStepDefinition.setup();
        pestanaPerfilStepDefinition.queYaEstoyAutenticadoEnLaPlataforma(correo, contrasena);
    }

    @When("accedo a la Edicion de Perfil en la aplicacion web")
    public void accedoALaEdicionDePerfilEnLaAplicacionWeb() {
        // Se garantiza de acceder a informacion de perfil mediante los steps de PestanaPerfilStepDefinition
        pestanaPerfilStepDefinition.hagoClicEnElIconoDePerfilEnLaBarraDeNavegacion();
        pestanaPerfilStepDefinition.seDespliegaElMenuConVariasOpcionesIncluidaLaOpcionDeEditarPerfil();
        pestanaPerfilStepDefinition.alHacerClicEnEditarPerfil();
        pestanaPerfilStepDefinition.seDirigeALaPestanaDePerfilCargarandoLosDatosActualesDelUsuarioConNombreApellidoCorreoElectronicoPaisTelefonoYContrasena(null, null, null, null, null, null);
    }

    @Then("deberia de ver un boton para editar mi perfil")
    public void deberiaDeVerUnBotonParaEditarMiPerfil() {
        user.attemptsTo(ClickOnUpdateProfile.button());
    }

    @And("al dar click al boton de edicion")
    public void alDarClickAlBotonDeEdicion() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationUpdateProfilePage.isEnable(), Matchers.containsString("Ingreso De Nuevos Datos")));
    }

    @When("podria modifico mis datos personales como Nombre {string}, Apellido {string}, Correo Electronico {string}, Pais {string} y Telefono {string}")
    public void podriaModificoMisDatosPersonalesComoNombreApellidoCorreoElectronicoPaisYTelefono(String nombre, String apellido, String correo, String pais, String telefono) {
        user.attemptsTo(UpdateThe.credentials(nombre, apellido, correo, pais, telefono));
    }

    @And("al dar click en el boton guardar cambios")
    public void alDarClickEnElBotonGuardarCambios() {
        user.attemptsTo(ClickOnSaveChanges.button());
    }

    @Then("deberia de actualizarse mis datos personales en el sistema, mostrando un mensaje de exito")
    public void deberiaDeActualizarseMisDatosPersonalesEnElSistemaMostrandoUnMensajeDeExito() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationUpdateProfileAction.updateCredentials(), Matchers.containsString("Datos Cambiados Correctamente")));
    }
}
