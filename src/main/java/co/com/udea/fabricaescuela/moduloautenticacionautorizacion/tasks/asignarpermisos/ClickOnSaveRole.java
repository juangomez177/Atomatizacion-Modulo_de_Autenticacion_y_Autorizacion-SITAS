package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.asignarpermisos.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnSaveRole implements Task {

    public static ClickOnSaveRole button() {
        return Tasks.instrumented(ClickOnSaveRole.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.saveRoleButton());
    }
}
