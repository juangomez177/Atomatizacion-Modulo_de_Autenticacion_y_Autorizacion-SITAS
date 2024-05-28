package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.PROFILE_ICON;

public class ClickOnProfileIcon implements Task {

    public static ClickOnProfileIcon button() {

        return Tasks.instrumented(ClickOnProfileIcon.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PROFILE_ICON));
    }


}