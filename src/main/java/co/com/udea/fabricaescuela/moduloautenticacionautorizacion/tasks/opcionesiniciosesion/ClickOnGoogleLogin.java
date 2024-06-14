package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.opcionesiniciosesion.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnGoogleLogin implements Task {

    public static ClickOnGoogleLogin button() {
        return Tasks.instrumented(ClickOnGoogleLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.googleLoginButton());
    }
}