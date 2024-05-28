package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.CHECKING_OPTION;

public class ClickOnChecking implements Task {

    public static ClickOnChecking button() {

        return Tasks.instrumented(ClickOnChecking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CHECKING_OPTION));
    }
}
