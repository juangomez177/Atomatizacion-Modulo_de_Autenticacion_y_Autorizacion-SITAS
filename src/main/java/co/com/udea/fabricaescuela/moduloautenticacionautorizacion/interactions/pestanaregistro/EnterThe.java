package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaregistro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.RegisterPage.*;

public class EnterThe implements Interaction {

    private final String nombre;
    private final String apellido;
    private final String tipoDocumento;
    private final String documento;
    private final String correo;
    private final String contrasena;
    private final String pais;
    private final String telefono;

    public EnterThe(String nombre, String apellido, String tipoDocumento, String documento, String correo, String contrasena, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.correo = correo;
        this.contrasena = contrasena;
        this.pais = pais;
        this.telefono = telefono;
    }

    public static EnterThe credentialsToSave(String nombre, String apellido, String tipoDocumento, String documento, String correo, String contrasena, String pais, String telefono) {
        return Tasks.instrumented(EnterThe.class, nombre, apellido, tipoDocumento, documento, correo, contrasena, pais, telefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_TEXT_NAME),
                Enter.theValue(apellido).into(INPUT_TEXT_SURNAME),
                Click.on(SELECTOR_TYPE_ID),
                SelectFromOptions.byVisibleText(tipoDocumento).from(SELECTOR_TYPE_ID),
                Enter.theValue(documento).into(INPUT_TEXT_ID),
                Enter.theValue(correo).into(INPUT_TEXT_EMAIL),
                Enter.theValue(contrasena).into(INPUT_TEXT_PASSWORD),
                Click.on(SELECTOR_ID_COUNTRY),
                SelectFromOptions.byVisibleText(pais).from(SELECTOR_ID_COUNTRY),
                Enter.theValue(telefono).into(INPUT_TEXT_CELLPHONE),
                Click.on(SELECTOR_TERMS_CONDITIONS),
                Click.on(SELECTOR_PRIVACY_POLICY)
        );
    }
}

