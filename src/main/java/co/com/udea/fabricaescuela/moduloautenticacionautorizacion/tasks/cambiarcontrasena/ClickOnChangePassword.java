package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.EDIT_PASSWORD_BUTTON;

public class ClickOnChangePassword implements Task {

    public static ClickOnChangePassword button() {

        return Tasks.instrumented(ClickOnChangePassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(EDIT_PASSWORD_BUTTON));
    }


}