package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.botoniniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.LOGIN_BUTTON;

public class ClickThe implements Interaction {

    public static ClickThe loginButton() {
        return Tasks.instrumented(ClickThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }
}
