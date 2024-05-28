package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.FACEBOOK_LOGIN_BUTTON;

public class ClickOnFacebookLogin implements Task {

    public static ClickOnFacebookLogin button() {

        return Tasks.instrumented(ClickOnFacebookLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(FACEBOOK_LOGIN_BUTTON));
    }


}