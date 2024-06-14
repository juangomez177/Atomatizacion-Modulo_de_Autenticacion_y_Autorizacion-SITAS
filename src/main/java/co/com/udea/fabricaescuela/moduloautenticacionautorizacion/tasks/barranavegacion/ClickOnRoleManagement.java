package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.asignarpermisos.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnRoleManagement implements Task {

    public static ClickOnRoleManagement button() {
        return Tasks.instrumented(ClickOnRoleManagement.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.roleManagementButton());

    }
}
