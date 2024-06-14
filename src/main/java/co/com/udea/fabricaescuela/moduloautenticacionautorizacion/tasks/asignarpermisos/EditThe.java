package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.asignarpermisos;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.asignarpermisos.ChangeThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EditThe implements Task {

    private final String rol;

    public EditThe(String rol) {
        this.rol = rol;
    }

    public static EditThe role(String rol) {
        return Tasks.instrumented(EditThe.class, rol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ChangeThe.role(rol));
    }

}


