package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaregistro;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaregistro.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class ClickOnRegister implements Task {

    public static ClickOnRegister button() {

        return Tasks.instrumented(ClickOnRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.registerPageButton());
    }


}