package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.barranavegacion.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnBooking implements Task {

    public static ClickOnBooking button() {
        return Tasks.instrumented(ClickOnBooking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.bookingButton());
    }
}
