package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdminPage extends PageObject {

    //Asignacion de roles
    public static final Target USER_SELECTED = Target.the("Usuario Seleccionado").located(By.xpath("//button[@name='userSelected']"));
    public static final Target CHANGE_ROLE_SELECTOR = Target.the("Selector del rol de usuario").located(By.xpath("//button[@name='changeRole']"));
    public static final Target SAVE_ROLE_BUTTON = Target.the("Guardar el rol seleccionado").located(By.xpath("//button[@name='saveRole']"));
    public static final Target SAVE_ROLE_SUCCESS_MESSAGE = Target.the("Exito cambiando el rol seleccionado").located(By.xpath("//button[@name='SaveRoleSuccess']"));
}
