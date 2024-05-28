package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.SAVE_DATA_BUTTON;

public class ClickOnSaveChanges implements Task {

    public static ClickOnSaveChanges button() {

        return Tasks.instrumented(ClickOnSaveChanges.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SAVE_DATA_BUTTON));
    }


}