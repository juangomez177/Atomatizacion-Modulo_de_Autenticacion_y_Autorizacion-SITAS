package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaactualizarperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.EDIT_DATA_BUTTON;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.SAVE_DATA_BUTTON;

public class ClickThe implements Interaction {

    private final Target target;

    // Constructor privado para recibir el Target (Para incluir varios métodos)
    private ClickThe(Target target) {
        this.target = target;
    }

    public static ClickThe editDataButton() {
        return Tasks.instrumented(ClickThe.class, EDIT_DATA_BUTTON);
    }

    public static ClickThe saveDataButton() {
        return Tasks.instrumented(ClickThe.class, SAVE_DATA_BUTTON);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(target));
    }
}
