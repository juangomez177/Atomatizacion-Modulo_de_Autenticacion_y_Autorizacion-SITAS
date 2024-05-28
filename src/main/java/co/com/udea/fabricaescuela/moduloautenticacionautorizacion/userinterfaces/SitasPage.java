package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SitasPage extends PageObject {

    //Botones de login
    public static final Target LOGIN_BUTTON = Target.the("Boton de registro").locatedBy("//a[@href='/auth/login']");
    public static final Target LOGIN_PAGE_BUTTON = Target.the("Mensaje de pagina de registro").located(By.xpath("//button[text()='Log In']"));

    //Botones de registro
    public static final Target REGISTER_BUTTON = Target.the("Boton de registro").locatedBy("//a[@href='/auth/new-account']");
    public static final Target REGISTER_PAGE_BUTTON = Target.the("Mensaje de pagina de registro").located(By.xpath("//button[text()='Crear cuenta']"));

    //Formulario de inicio de sesion
    public static final Target INPUT_TEXT_EMAIL_LOGIN = Target.the("Correo Login").located(By.xpath("//input[@name='email']"));
    public static final Target INPUT_TEXT_PASSWORD_LOGIN = Target.the("Contraseña Login").located(By.xpath("//input[@name='password']"));
    public static final Target CONFIRMATION_LOGIN = Target.the("Mensaje de confirmacion del inicio de sesion exitoso").located(By.xpath("//"));

    //Formulario de registro
    public static final Target INPUT_TEXT_NAME = Target.the("Nombre").located(By.xpath("//input[@name='name']"));
    public static final Target INPUT_TEXT_SURNAME = Target.the("Apellido").located(By.xpath("//input[@name='lastName']"));
    public static final Target SELECTOR_TYPE_ID = Target.the("Tipo de documento").located(By.xpath("//div[@role='combobox' and @id=':r2:']"));
    public static final Target INPUT_TEXT_ID = Target.the("Documento").located(By.xpath("//input[@name='identificationNumber']"));

    //   //input[@name='identificationType']

    public static final Target INPUT_TEXT_EMAIL = Target.the("Correo").located(By.xpath("//input[@name='email']"));
    public static final Target INPUT_TEXT_PASSWORD = Target.the("Contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target SELECTOR_ID_COUNTRY = Target.the("Identificador de Pais").located(By.xpath("//div[@role='combobox' and @id=':r7:']"));
    public static final Target INPUT_TEXT_CELLPHONE = Target.the("Telefono").located(By.xpath("//input[@name='telephoneNumber']"));
    public static final Target SELECTOR_TERMS_CONDITIONS = Target.the("Terminos y Condiciones").located(By.xpath("//div[contains(p/text(), 'Condiciones')]//input[@type='checkbox']"));
    public static final Target SELECTOR_PRIVACY_POLICY = Target.the("Politicas de privacidad").located(By.xpath("//div[contains(p/text(), 'Privacidad')]//input[@type='checkbox']"));
    public static final Target CONFIRMATION_REGISTER = Target.the("Mensaje de confirmacion del registro exitoso").located(By.xpath("//"));

    //Contrasena Segura
    public static final Target CONFIRMATION_PASSWORD_SAFE = Target.the("Mensaje de confirmacion de politicas de contrasena").located(By.xpath("//input[@name='password']"));


    //Barra navegacion
    public static final Target TITTLE_NAVIGATION_BAR = Target.the("Titulo barra de navegacion").located(By.xpath("//"));
    public static final Target FLY_SEACH_OPTION = Target.the("Opcion de busqueda de vuelos").located(By.xpath("//"));
    public static final Target CHECKING_OPTION = Target.the("Opcion de checking").located(By.xpath("//"));
    public static final Target BOOKING_OPTION = Target.the("Opcion de reserva").located(By.xpath("//"));
    public static final Target ROLE_MANAGEMENT_OPTION = Target.the("Opcion de gestion de roles").located(By.xpath("//"));
    public static final Target FLY_MANAGEMENT_OPTION = Target.the("Opcion de gestion de vuelos").located(By.xpath("//"));
    public static final Target TITTLE_PAGE_FLY_SEACH = Target.the("Titulo de pagina busqueda de vuelos").located(By.xpath("//"));
    public static final Target TITTLE_PAGE_CHECKING = Target.the("Titulo de pagina checking").located(By.xpath("//"));
    public static final Target TITTLE_PAGE_BOOKING = Target.the("Titulo de pagina reserva").located(By.xpath("//"));
    public static final Target TITTLE_PAGE_ROLE_MANAGEMENT = Target.the("Titulo de pagina gestion de roles").located(By.xpath("//"));
    public static final Target TITTLE_PAGE_FLY_MANAGEMENT = Target.the("Titulo de pagina gestion de vuelos").located(By.xpath("//"));

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

    //Formulario de edicion
    //Vista
    public static final Target PROFILE_ICON = Target.the("Icono del perfil").located(By.xpath("//"));
    public static final Target EDIT_PROFILE_OPTION = Target.the("Opcion de editar perfil").located(By.xpath("//"));
    public static final Target TITTLE_EDIT_PROFILE = Target.the("Titulo de la pagina de edicio  de perfil").located(By.xpath("//"));
    public static final Target TITTLE_EDIT_PROFILE_2 = Target.the("Titulo de la pagina de edicio  de perfil una vez oprimido el boton de editar perfil").located(By.xpath("//"));
    public static final Target INFO_TEXT_NAME = Target.the("Nombre de la cuenta").located(By.xpath("//"));
    public static final Target INFO_TEXT_SURNAME = Target.the("Apellido de la cuenta").located(By.xpath("//"));
    public static final Target INFO_TEXT_EMAIL = Target.the("Correo de la cuenta").located(By.xpath("//"));
    public static final Target INFO_SELECTOR_ID_COUNTRY = Target.the("Identificador de Pais de la cuenta").located(By.xpath("//"));
    public static final Target INFO_TEXT_CELLPHONE = Target.the("Celular de la cuenta").located(By.xpath("//"));
    public static final Target INFO_TEXT_PASSWORD = Target.the("Contrasena de la cuenta").located(By.xpath("//"));

    //Edicion
    public static final Target EDIT_DATA_BUTTON = Target.the("Boton de editar datos de perfil").located(By.xpath("//"));
    public static final Target SAVE_DATA_BUTTON = Target.the("Boton para guardar los datos editados").located(By.xpath("//"));
    public static final Target EDIT_PASSWORD_BUTTON = Target.the("Boton de cambiar contrasena").located(By.xpath("//"));
    public static final Target SAVE_PASSWORD_BUTTON = Target.the("Boton de guardar la nueva contrasena").located(By.xpath("//"));
    public static final Target NEW_TEXT_PASSWORD = Target.the("Nueva contrasena").located(By.xpath("//"));
    public static final Target CONFIRM_NEW_TEXT_PASSWORD = Target.the("Confirmar nueva contrasena").located(By.xpath("//"));

    public static final Target EDIT_PASSWORD_SUCCESS_MESSAGE = Target.the("Exito cambiando la contrasena").located(By.xpath("//"));

    //Asignacion de roles
    public static final Target USER_SELECTED = Target.the("Usuario Seleccionado").located(By.xpath("//"));
    public static final Target CHANGE_ROLE_SELECTOR = Target.the("Selector del rol de usuario").located(By.xpath("//"));
    public static final Target SAVE_ROLE_BUTTON = Target.the("Guardar el rol seleccionado").located(By.xpath("//"));
    public static final Target SAVE_ROLE_SUCCESS_MESSAGE = Target.the("Exito cambiando el rol seleccionado").located(By.xpath("//"));

    //Ultimo Ingreso fallido
    public static final Target CONSECUTIVE_FAILED_LOGIN_MESSAGE = Target.the("Mensaje de bloqueo de cuenta por 3 ingresos consecutivos fallidos").located(By.xpath("//"));

}
