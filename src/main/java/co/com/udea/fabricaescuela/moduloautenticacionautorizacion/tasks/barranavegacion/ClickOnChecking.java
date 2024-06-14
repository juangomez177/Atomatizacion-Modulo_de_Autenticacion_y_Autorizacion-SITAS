package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.barranavegacion.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnChecking implements Task {

    public static ClickOnChecking button() {
        return Tasks.instrumented(ClickOnChecking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.checkingButton());
    }
}
