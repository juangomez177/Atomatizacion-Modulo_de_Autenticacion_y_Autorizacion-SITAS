package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.FLY_MANAGEMENT_OPTION;

public class ClickOnFlyManagement implements Task {

    public static ClickOnFlyManagement button() {
        return Tasks.instrumented(ClickOnFlyManagement.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(FLY_MANAGEMENT_OPTION));

    }
}
