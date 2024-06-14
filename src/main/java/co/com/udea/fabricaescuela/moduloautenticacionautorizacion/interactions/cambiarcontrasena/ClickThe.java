package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.cambiarcontrasena;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.EDIT_PASSWORD_BUTTON;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.SAVE_PASSWORD_BUTTON;

public class ClickThe implements Interaction {

    private final Target target;

    // Constructor privado para recibir el Target (Para incluir varios métodos)
    private ClickThe(Target target) {
        this.target = target;
    }

    public static ClickThe editPasswordButton() {
        return Tasks.instrumented(ClickThe.class, EDIT_PASSWORD_BUTTON);
    }

    public static ClickThe savePasswordButton() {
        return Tasks.instrumented(ClickThe.class, SAVE_PASSWORD_BUTTON);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(target));
    }
}
