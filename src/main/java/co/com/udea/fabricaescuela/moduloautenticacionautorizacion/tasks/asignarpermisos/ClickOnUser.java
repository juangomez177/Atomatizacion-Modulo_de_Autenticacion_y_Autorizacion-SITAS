package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.USER_SELECTED;

public class ClickOnUser implements Task {

    public static ClickOnUser button() {

        return Tasks.instrumented(ClickOnUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(USER_SELECTED));
    }
}
