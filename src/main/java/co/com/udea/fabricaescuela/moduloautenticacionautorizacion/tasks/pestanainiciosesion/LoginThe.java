package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanainiciosesion;


import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanainiciosesion.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginThe implements Task {

    private final String correo;
    private final String contrasena;


    public LoginThe(String correo, String contrasena) {

        this.correo = correo;
        this.contrasena = contrasena;

    }

    public static LoginThe credentials(String correo, String contrasena) {
        return Tasks.instrumented(LoginThe.class, correo, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterThe.credentialsToLogin(correo, contrasena));
    }


}


