package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.SAVE_ROLE_BUTTON;

public class ClickOnSaveRole implements Task {

    public static ClickOnSaveRole button() {

        return Tasks.instrumented(ClickOnSaveRole.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SAVE_ROLE_BUTTON));
    }
}
