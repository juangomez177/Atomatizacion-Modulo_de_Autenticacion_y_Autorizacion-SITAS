package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaactualizarperfil.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnUpdateProfile implements Task {

    public static ClickOnUpdateProfile button() {
        return Tasks.instrumented(ClickOnUpdateProfile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.editDataButton());
    }
}