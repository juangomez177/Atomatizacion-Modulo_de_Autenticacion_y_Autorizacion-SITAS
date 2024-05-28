package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.stepdefinitions;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.cambiarcontrasena.ValidationSavePassword;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena.ChangeThe;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena.ClickOnChangePassword;
import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena.ClickOnSavePassword;
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

public class CambiarContrasenaStepDefinition {
    public final Actor user = Actor.named("usuario");
    private static final Logger logger = LoggerFactory.getLogger(CambiarContrasenaStepDefinition.class);

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

    @Given("soy un usuario registrado y logeado con correo {string}  y contrasena {string}")
    public void soyUnUsuarioRegistradoYLogeadoConCorreoYContrasena(String correo, String contrasena) {

        // Se garantiza de autenticarse mediante PestanaPerfilStepDefinition.class
        pestanaPerfilStepDefinition.setup();
        pestanaPerfilStepDefinition.queYaEstoyAutenticadoEnLaPlataforma(correo, contrasena);

    }

    @When("intento cambiar mi contrasena accediento a la pestana de edicion de perfil")
    public void intentoCambiarMiContrasenaAccedientoALaPestanaDeEdicionDePerfil() {

        // Se garantiza acceder a la eidion de perfil mediante PestanaPerfilStepDefinition.class
        pestanaPerfilStepDefinition.hagoClicEnElIconoDePerfilEnLaBarraDeNavegacion();
        pestanaPerfilStepDefinition.seDespliegaElMenuConVariasOpcionesIncluidaLaOpcionDeEditarPerfil();
        pestanaPerfilStepDefinition.alHacerClicEnEditarPerfil();
        pestanaPerfilStepDefinition.seDirigeALaPestanaDePerfilCargarandoLosDatosActualesDelUsuarioConNombreApellidoCorreoElectronicoPaisTelefonoYContrasena("arg0", "arg0", "arg0", "arg0", "arg0", "arg0");
    }

    @Then("doy click en el boton cambiar contrasena")
    public void doyClickEnElBotonCambiarContrasena() {
        user.attemptsTo(ClickOnChangePassword.button());
    }

    @Then("se me solicita ingresar mi contrasena actual {string}, contrasena nueva {string} y confirmar la contrasena {string}")
    public void seMeSolicitaIngresarMiContrasenaActualContrasenaNuevaYConfirmarLaContrasena(String contrasena, String nuevaContrasena, String confirmContrasena) {
        user.attemptsTo(ChangeThe.password(contrasena, nuevaContrasena, confirmContrasena));
    }

    @And("guardo los cambios con el boton guardar contrasena")
    public void guardoLosCambiosConElBotonGuardarContrasena() {
        user.attemptsTo(ClickOnSavePassword.button());
    }

    @Then("debería de mostrar un mensaje de contrasena cambiada correctamente")
    public void deberíaDeMostrarUnMensajeDeContrasenaCambiadaCorrectamente() {
        GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ValidationSavePassword.isCorrect(), Matchers.containsString("Contrasena Actualizada correctamente")));

    }


}
