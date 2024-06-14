package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaperfil;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaperfil.ClickThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class ClickOnEditProfile implements Task {

    public static ClickOnEditProfile button() {

        return Tasks.instrumented(ClickOnEditProfile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickThe.editProfileOption());
    }


}