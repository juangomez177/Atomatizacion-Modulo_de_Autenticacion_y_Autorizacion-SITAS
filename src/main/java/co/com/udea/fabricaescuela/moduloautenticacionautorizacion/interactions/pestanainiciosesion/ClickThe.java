package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanainiciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.LOGIN_PAGE_BUTTON;

public class ClickThe implements Interaction {

    public static ClickThe loginPageButton() {
        return Tasks.instrumented(ClickThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LOGIN_PAGE_BUTTON));
    }
}
