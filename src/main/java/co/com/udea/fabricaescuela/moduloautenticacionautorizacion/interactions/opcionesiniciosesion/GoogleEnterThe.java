package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.opcionesiniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.*;

public class GoogleEnterThe implements Interaction {
    private final String correo;
    private final String contrasena;

    public GoogleEnterThe(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;

    }

    public static GoogleEnterThe credentialsToLogin(String correo, String contrasena) {
        return Tasks.instrumented(GoogleEnterThe.class, correo, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(GOOGLE_EMAIL_INPUT),
                Enter.theValue(contrasena).into(GOOGLE_PASSWORD_INPUT),
                Click.on(GOOGLE_NEXT_BUTTON)
        );
    }
}

