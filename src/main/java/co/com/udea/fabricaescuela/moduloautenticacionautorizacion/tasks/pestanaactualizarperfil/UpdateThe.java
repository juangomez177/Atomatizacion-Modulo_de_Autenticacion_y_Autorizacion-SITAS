package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaactualizarperfil;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaactualizarperfil.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UpdateThe implements Task {
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String pais;
    private final String telefono;

    public UpdateThe(String nombre, String apellido, String correo, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pais = pais;
        this.telefono = telefono;
    }

    public static UpdateThe credentials(String nombre, String apellido, String correo, String pais, String telefono) {
        return Tasks.instrumented(UpdateThe.class, nombre, apellido, correo, pais, telefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterThe.credentialsToUpdate(nombre, apellido, correo, pais, telefono));
    }
}


