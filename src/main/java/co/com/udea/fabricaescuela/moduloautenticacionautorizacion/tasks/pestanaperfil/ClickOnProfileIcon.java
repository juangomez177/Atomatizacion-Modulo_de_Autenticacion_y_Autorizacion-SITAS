package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaperfil;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaperfil.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnProfileIcon implements Task {

    public static ClickOnProfileIcon button() {

        return Tasks.instrumented(ClickOnProfileIcon.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.profileIcon());
    }


}