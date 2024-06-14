package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.asignarpermisos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.AdminPage.SAVE_ROLE_BUTTON;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.AdminPage.USER_SELECTED;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.ROLE_MANAGEMENT_OPTION;

public class ClickThe implements Interaction {

    private final Target target;

    // Constructor privado para recibir el Target (Para incluir varios métodos)
    private ClickThe(Target target) {
        this.target = target;
    }

    public static ClickThe roleManagementButton() {
        return Tasks.instrumented(ClickThe.class, ROLE_MANAGEMENT_OPTION);
    }

    public static ClickThe userSelectedButton() {
        return Tasks.instrumented(ClickThe.class, USER_SELECTED);
    }

    public static ClickThe saveRoleButton() {
        return Tasks.instrumented(ClickThe.class, SAVE_ROLE_BUTTON);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }
}
