package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.SAVE_PASSWORD_BUTTON;

public class ClickOnSavePassword implements Task {

    public static ClickOnSavePassword button() {

        return Tasks.instrumented(ClickOnSavePassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SAVE_PASSWORD_BUTTON));
    }


}