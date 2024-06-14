package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.contrasenasegura;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.RegisterPage.INPUT_TEXT_PASSWORD;

public class EnterThe implements Interaction {

    private final String contrasena;

    public EnterThe(String contrasena) {
        this.contrasena = contrasena;

    }

    public static EnterThe password(String contrasena) {
        return Tasks.instrumented(EnterThe.class, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(contrasena).into(INPUT_TEXT_PASSWORD)

        );
    }
}

