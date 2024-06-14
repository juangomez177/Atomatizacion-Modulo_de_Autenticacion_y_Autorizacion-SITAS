package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.*;

public class ClickThe implements Interaction {

    private final Target target;

    // Constructor privado para recibir el Target (Para incluir varios métodos)
    private ClickThe(Target target) {
        this.target = target;
    }

    public static ClickThe flySearchButton() {
        return Tasks.instrumented(ClickThe.class, FLY_SEACH_OPTION);
    }

    public static ClickThe checkingButton() {
        return Tasks.instrumented(ClickThe.class, CHECKING_OPTION);
    }

    public static ClickThe bookingButton() {
        return Tasks.instrumented(ClickThe.class, BOOKING_OPTION);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(target));
    }
}
