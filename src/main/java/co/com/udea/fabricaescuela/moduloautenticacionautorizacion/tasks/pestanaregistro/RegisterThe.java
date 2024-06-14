package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks.pestanaregistro;

import co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaregistro.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegisterThe implements Task {
    private final String nombre;
    private final String apellido;
    private final String tipoDocumento;
    private final String documento;
    private final String correo;
    private final String contrasena;
    private final String pais;
    private final String telefono;

    public RegisterThe(String nombre, String apellido, String tipoDocumento, String documento, String correo, String contrasena, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.correo = correo;
        this.contrasena = contrasena;
        this.pais = pais;
        this.telefono = telefono;
    }

    public static RegisterThe credentials(String nombre, String apellido, String tipoDocumento, String documento, String correo, String contrasena, String pais, String telefono) {
        return Tasks.instrumented(RegisterThe.class, nombre, apellido, tipoDocumento, documento, correo, contrasena, pais, telefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterThe.credentialsToSave(nombre, apellido, tipoDocumento, documento, correo, contrasena, pais, telefono));
    }
}


