package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanainiciosesion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanainiciosesion.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnLogin implements Task {

    public static ClickOnLogin button() {
        return Tasks.instrumented(ClickOnLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.loginPageButton());
    }
}