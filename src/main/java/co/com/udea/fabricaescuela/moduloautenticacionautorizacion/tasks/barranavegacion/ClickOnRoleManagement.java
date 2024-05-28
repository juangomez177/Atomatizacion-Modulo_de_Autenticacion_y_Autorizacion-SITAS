package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.ROLE_MANAGEMENT_OPTION;

public class ClickOnRoleManagement implements Task {

    public static ClickOnRoleManagement button() {

        return Tasks.instrumented(ClickOnRoleManagement.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ROLE_MANAGEMENT_OPTION));

    }
}
