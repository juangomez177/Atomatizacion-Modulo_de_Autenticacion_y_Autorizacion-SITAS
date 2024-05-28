package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.EDIT_PROFILE_OPTION;

public class ClickOnEditProfile implements Task {

    public static ClickOnEditProfile button() {

        return Tasks.instrumented(ClickOnEditProfile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(EDIT_PROFILE_OPTION));
    }


}