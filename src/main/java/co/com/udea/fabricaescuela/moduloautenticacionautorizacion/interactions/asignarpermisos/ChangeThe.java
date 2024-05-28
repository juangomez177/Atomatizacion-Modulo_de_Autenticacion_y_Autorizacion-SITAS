package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.asignarpermisos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.CHANGE_ROLE_SELECTOR;


public class ChangeThe implements Interaction {

    private final String rol;

    public ChangeThe(String rol) {
        this.rol = rol;
    }

    public static ChangeThe role(String rol) {
        return Tasks.instrumented(ChangeThe.class, rol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CHANGE_ROLE_SELECTOR),
                SelectFromOptions.byVisibleText(rol).from(CHANGE_ROLE_SELECTOR)


        );
    }
}

