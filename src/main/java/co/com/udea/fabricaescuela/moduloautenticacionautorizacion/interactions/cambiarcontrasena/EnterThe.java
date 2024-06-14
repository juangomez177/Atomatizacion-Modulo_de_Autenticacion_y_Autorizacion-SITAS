package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.cambiarcontrasena;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.*;

public class EnterThe implements Interaction {
    private final String contrasena;
    private final String nuevaContrasena;
    private final String confirmContrasena;

    public EnterThe(String contrasena, String nuevaContrasena, String confirmContrasena) {

        this.contrasena = contrasena;
        this.nuevaContrasena = nuevaContrasena;
        this.confirmContrasena = confirmContrasena;
    }

    public static EnterThe passwordToChange(String contrasena, String nuevaContrasena, String confirmContrasena) {
        return Tasks.instrumented(EnterThe.class, contrasena, nuevaContrasena, confirmContrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(contrasena).into(INFO_TEXT_PASSWORD),
                Enter.theValue(nuevaContrasena).into(NEW_TEXT_PASSWORD),
                Enter.theValue(confirmContrasena).into(CONFIRM_NEW_TEXT_PASSWORD)
        );
    }
}

