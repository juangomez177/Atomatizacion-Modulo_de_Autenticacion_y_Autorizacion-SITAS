package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.contrasenasegura;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.contrasenasegura.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TypingThe implements Task {

    private final String contrasena;

    public TypingThe(String contrasena) {
        this.contrasena = contrasena;
    }

    public static TypingThe password(String contrasena) {
        return Tasks.instrumented(TypingThe.class, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterThe.password(contrasena));
    }
}


