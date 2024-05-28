package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.opcionesiniciosesion;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.opcionesiniciosesion.GoogleEnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginGoogle implements Task {

    private final String correo;
    private final String contrasena;


    public LoginGoogle(String correo, String contrasena) {

        this.correo = correo;
        this.contrasena = contrasena;

    }

    public static LoginGoogle withCredentials(String correo, String contrasena) {
        return Tasks.instrumented(LoginGoogle.class, correo, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GoogleEnterThe.credentialsToLogin(correo, contrasena));
    }


}


