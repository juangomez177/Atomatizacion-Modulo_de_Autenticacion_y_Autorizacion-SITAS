package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.barranavegacion.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnFlySearch implements Task {

    public static ClickOnFlySearch button() {
        return Tasks.instrumented(ClickOnFlySearch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.flySearchButton());
    }
}
