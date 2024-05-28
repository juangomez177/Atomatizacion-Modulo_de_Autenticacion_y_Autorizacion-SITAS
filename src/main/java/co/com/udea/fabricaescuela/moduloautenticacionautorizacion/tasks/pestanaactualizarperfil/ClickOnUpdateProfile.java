package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.EDIT_DATA_BUTTON;

public class ClickOnUpdateProfile implements Task {

    public static ClickOnUpdateProfile button() {

        return Tasks.instrumented(ClickOnUpdateProfile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(EDIT_DATA_BUTTON));
    }


}