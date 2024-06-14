package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.cambiarcontrasena.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnChangePassword implements Task {

    public static ClickOnChangePassword button() {
        return Tasks.instrumented(ClickOnChangePassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.editPasswordButton());
    }
}