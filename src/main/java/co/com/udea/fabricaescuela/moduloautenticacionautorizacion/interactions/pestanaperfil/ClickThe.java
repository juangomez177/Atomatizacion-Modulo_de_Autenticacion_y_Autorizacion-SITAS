package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.EDIT_PROFILE_OPTION;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.PROFILE_ICON;

public class ClickThe implements Interaction {

    private final Target target;

    // Constructor privado para recibir el Target (Para incluir varios métodos)
    private ClickThe(Target target) {
        this.target = target;
    }

    public static ClickThe profileIcon() {
        return Tasks.instrumented(ClickThe.class, PROFILE_ICON);
    }

    public static ClickThe editProfileOption() {
        return Tasks.instrumented(ClickThe.class, EDIT_PROFILE_OPTION);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(target));
    }
}
