package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.BOOKING_OPTION;

public class ClickOnBooking implements Task {

    public static ClickOnBooking button() {

        return Tasks.instrumented(ClickOnBooking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BOOKING_OPTION));
    }
}
