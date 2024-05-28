package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.FLY_SEACH_OPTION;

public class ClickOnFlySearch implements Task {

    public static ClickOnFlySearch button() {

        return Tasks.instrumented(ClickOnFlySearch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(FLY_SEACH_OPTION));
    }
}
