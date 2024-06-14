package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaactualizarperfil.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnSaveChanges implements Task {

    public static ClickOnSaveChanges button() {
        return Tasks.instrumented(ClickOnSaveChanges.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.saveDataButton());
    }
}