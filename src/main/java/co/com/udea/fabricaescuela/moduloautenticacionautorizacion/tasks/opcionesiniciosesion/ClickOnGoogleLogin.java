package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.GOOGLE_LOGIN_BUTTON;

public class ClickOnGoogleLogin implements Task {

    public static ClickOnGoogleLogin button() {

        return Tasks.instrumented(ClickOnGoogleLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(GOOGLE_LOGIN_BUTTON));
    }


}