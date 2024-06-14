package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.opcionesiniciosesion.FacebookEnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginFacebook implements Task {

    private final String correo;
    private final String contrasena;

    public LoginFacebook(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static LoginFacebook withCredentials(String correo, String contrasena) {
        return Tasks.instrumented(LoginFacebook.class, correo, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FacebookEnterThe.credentialsToLogin(correo, contrasena));
    }
}


