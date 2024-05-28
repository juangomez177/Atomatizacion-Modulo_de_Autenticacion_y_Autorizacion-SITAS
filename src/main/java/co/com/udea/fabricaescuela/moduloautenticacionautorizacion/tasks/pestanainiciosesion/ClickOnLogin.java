package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanainiciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.LOGIN_PAGE_BUTTON;

public class ClickOnLogin implements Task {

    public static ClickOnLogin button() {

        return Tasks.instrumented(ClickOnLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LOGIN_PAGE_BUTTON));
    }


}