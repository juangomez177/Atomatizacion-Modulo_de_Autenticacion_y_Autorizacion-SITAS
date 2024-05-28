package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanainiciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.INPUT_TEXT_EMAIL_LOGIN;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.INPUT_TEXT_PASSWORD_LOGIN;


public class EnterThe implements Interaction {
    private final String correo;
    private final String contrasena;

    public EnterThe(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;

    }

    public static EnterThe credentialsToLogin(String correo, String contrasena) {
        return Tasks.instrumented(EnterThe.class, correo, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(INPUT_TEXT_EMAIL_LOGIN),
                Enter.theValue(contrasena).into(INPUT_TEXT_PASSWORD_LOGIN)

        );
    }
}

