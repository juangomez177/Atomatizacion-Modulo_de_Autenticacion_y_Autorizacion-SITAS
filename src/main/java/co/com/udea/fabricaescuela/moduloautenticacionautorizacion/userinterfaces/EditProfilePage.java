package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EditProfilePage extends PageObject {

    //Formulario de edicion
    //Vista
    public static final Target PROFILE_ICON = Target.the("Icono del perfil").located(By.xpath("//button[@name='profileIcon']"));
    public static final Target EDIT_PROFILE_OPTION = Target.the("Opcion de editar perfil").located(By.xpath("//button[@name='editProfileOption']"));
    public static final Target TITTLE_EDIT_PROFILE = Target.the("Titulo de la pagina de edicio  de perfil").located(By.xpath("//text[@name='editProfile']"));
    public static final Target TITTLE_EDIT_PROFILE_2 = Target.the("Titulo de la pagina de edicio  de perfil una vez oprimido el boton de editar perfil").located(By.xpath("//text[@name='EditProfile2']"));
    public static final Target INFO_TEXT_NAME = Target.the("Nombre de la cuenta").located(By.xpath("//input[@name='name']"));
    public static final Target INFO_TEXT_SURNAME = Target.the("Apellido de la cuenta").located(By.xpath("//input[@name='lastName']"));
    public static final Target INFO_TEXT_EMAIL = Target.the("Correo de la cuenta").located(By.xpath("//input[@name='email']"));
    public static final Target INFO_SELECTOR_ID_COUNTRY = Target.the("Identificador de Pais de la cuenta").located(By.xpath("//input[@name='idCountry']"));
    public static final Target INFO_TEXT_CELLPHONE = Target.the("Celular de la cuenta").located(By.xpath("//input[@name='cellphone']"));
    public static final Target INFO_TEXT_PASSWORD = Target.the("Contrasena de la cuenta").located(By.xpath("//input[@name='password']"));

    //Edicion
    public static final Target EDIT_DATA_BUTTON = Target.the("Boton de editar datos de perfil").located(By.xpath("//button[@name='editData']"));
    public static final Target SAVE_DATA_BUTTON = Target.the("Boton para guardar los datos editados").located(By.xpath("//button[@name='saveData']"));
    public static final Target EDIT_PASSWORD_BUTTON = Target.the("Boton de cambiar contrasena").located(By.xpath("//button[@name='editPassword']"));
    public static final Target SAVE_PASSWORD_BUTTON = Target.the("Boton de guardar la nueva contrasena").located(By.xpath("//button[@name='savePassword']"));
    public static final Target NEW_TEXT_PASSWORD = Target.the("Nueva contrasena").located(By.xpath("//input[@name='newPassword']"));
    public static final Target CONFIRM_NEW_TEXT_PASSWORD = Target.the("Confirmar nueva contrasena").located(By.xpath("//input[@name='confirmNewPassword']"));
    public static final Target EDIT_PASSWORD_SUCCESS_MESSAGE = Target.the("Exito cambiando la contrasena").located(By.xpath("//text[@name='passwordSuccess']"));
}
