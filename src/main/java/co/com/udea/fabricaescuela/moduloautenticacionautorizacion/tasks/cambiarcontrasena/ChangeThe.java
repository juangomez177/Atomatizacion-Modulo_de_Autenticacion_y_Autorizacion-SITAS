package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.cambiarcontrasena;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.cambiarcontrasena.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ChangeThe implements Task {

    private final String contrasena;
    private final String nuevaContrasena;
    private final String confirmContrasena;


    public ChangeThe(String contrasena, String nuevaContrasena, String confirmContrasena) {
        this.contrasena = contrasena;
        this.nuevaContrasena = nuevaContrasena;
        this.confirmContrasena = confirmContrasena;

    }

    public static ChangeThe password(String contrasena, String nuevaContrasena, String confirmContrasena) {
        return Tasks.instrumented(ChangeThe.class, contrasena, nuevaContrasena, confirmContrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterThe.passwordToChange(contrasena, nuevaContrasena, confirmContrasena));
    }
}


