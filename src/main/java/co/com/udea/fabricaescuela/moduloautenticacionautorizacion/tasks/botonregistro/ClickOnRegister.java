package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.botonregistro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.REGISTER_BUTTON;

public class ClickOnRegister implements Task {

    public static ClickOnRegister button() {

        return Tasks.instrumented(ClickOnRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(REGISTER_BUTTON));
    }
}