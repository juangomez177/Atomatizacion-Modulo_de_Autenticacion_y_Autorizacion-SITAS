package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.botonregistro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.RegisterPage.REGISTER_BUTTON;

public class ClickThe implements Interaction {

    public static ClickThe registerButton() {

        return Tasks.instrumented(ClickThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(REGISTER_BUTTON));
    }
}