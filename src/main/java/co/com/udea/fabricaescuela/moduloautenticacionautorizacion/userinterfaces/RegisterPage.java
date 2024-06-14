package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {

    //Botones de registro
    public static final Target REGISTER_BUTTON = Target.the("Boton de registro").locatedBy("//a[@href='/auth/new-account']");
    public static final Target REGISTER_PAGE_BUTTON = Target.the("Mensaje de pagina de registro").located(By.xpath("//button[text()='Crear cuenta']"));

    //Formulario de registro
    public static final Target INPUT_TEXT_NAME = Target.the("Nombre").located(By.xpath("//input[@name='name']"));
    public static final Target INPUT_TEXT_SURNAME = Target.the("Apellido").located(By.xpath("//input[@name='lastName']"));
    public static final Target SELECTOR_TYPE_ID = Target.the("Tipo de documento").located(By.xpath("//div[@role='combobox' and @id=':r2:']"));
    public static final Target INPUT_TEXT_ID = Target.the("Documento").located(By.xpath("//input[@name='identificationNumber']"));
    public static final Target INPUT_TEXT_EMAIL = Target.the("Correo").located(By.xpath("//input[@name='email']"));
    public static final Target INPUT_TEXT_PASSWORD = Target.the("Contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target SELECTOR_ID_COUNTRY = Target.the("Identificador de Pais").located(By.xpath("//div[@role='combobox' and @id=':r7:']"));
    public static final Target INPUT_TEXT_CELLPHONE = Target.the("Telefono").located(By.xpath("//input[@name='telephoneNumber']"));
    public static final Target SELECTOR_TERMS_CONDITIONS = Target.the("Terminos y Condiciones").located(By.xpath("//div[contains(p/text(), 'Condiciones')]//input[@type='checkbox']"));
    public static final Target SELECTOR_PRIVACY_POLICY = Target.the("Politicas de privacidad").located(By.xpath("//div[contains(p/text(), 'Privacidad')]//input[@type='checkbox']"));
    public static final Target CONFIRMATION_REGISTER = Target.the("Mensaje de confirmacion del registro exitoso").located(By.xpath("//text[@name='confirmationRegister']"));

    //Contrasena Segura
    public static final Target CONFIRMATION_PASSWORD_SAFE = Target.the("Mensaje de confirmacion de politicas de contrasena").located(By.xpath("//text[@name='Confirmationassword']"));
}
