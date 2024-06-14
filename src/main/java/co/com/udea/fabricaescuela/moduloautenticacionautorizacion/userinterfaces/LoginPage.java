package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    //Botones de login
    public static final Target LOGIN_BUTTON = Target.the("Boton de registro").locatedBy("//a[@href='/auth/login']");
    public static final Target LOGIN_PAGE_BUTTON = Target.the("Mensaje de pagina de registro").located(By.xpath("//button[text()='Log In']"));

    //Formulario de inicio de sesion
    public static final Target INPUT_TEXT_EMAIL_LOGIN = Target.the("Correo Login").located(By.xpath("//input[@name='email']"));
    public static final Target INPUT_TEXT_PASSWORD_LOGIN = Target.the("Contraseña Login").located(By.xpath("//input[@name='password']"));
    public static final Target CONFIRMATION_LOGIN = Target.the("Mensaje de confirmacion del inicio de sesion exitoso").located(By.xpath("//text[@name='confirmationLogin']"));

    //Opciones Inicio de Sesion con Google o Faceboook
    public static final Target GOOGLE_LOGIN_BUTTON = Target.the("boton de inicio de sesión con Google").located(By.id("google-login-button-id"));
    public static final Target GOOGLE_EMAIL_INPUT = Target.the("Email Google").located(By.id("identifierId"));
    public static final Target GOOGLE_PASSWORD_INPUT = Target.the("Contrasena Google").located(By.name("password"));
    public static final Target GOOGLE_NEXT_BUTTON = Target.the("Next boton Google").located(By.id("identifierNextGoogle"));
    public static final Target GOOGLE_SUCCESS_MESSAGE = Target.the("mensaje de exito de Google").located(By.id("google-success-message-id"));
    public static final Target FACEBOOK_LOGIN_BUTTON = Target.the("boton de inicio de sesión con Facebook").located(By.id("facebook-login-button-id"));
    public static final Target FACEBOOK_EMAIL_INPUT = Target.the("Email Facebook").located(By.id("email"));
    public static final Target FACEBOOK_PASSWORD_INPUT = Target.the("Password Facebook").located(By.id("pass"));
    public static final Target FACEBOOK_NEXT_BUTTON = Target.the("Next boton Facebook").located(By.id("identifierNextFacebook"));
    public static final Target FACEBOOK_SUCCESS_MESSAGE = Target.the("mensaje de exito de Facebook").located(By.id("facebook-success-message-id"));

    //Ultimo Ingreso fallido
    public static final Target CONSECUTIVE_FAILED_LOGIN_MESSAGE = Target.the("Mensaje de bloqueo de cuenta por 3 ingresos consecutivos fallidos").located(By.xpath("//button[@name='failedLoginMessage']"));
}
