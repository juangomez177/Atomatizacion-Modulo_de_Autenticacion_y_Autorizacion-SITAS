package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.pestanaactualizarperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.*;


public class EnterThe implements Interaction {

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String pais;
    private final String telefono;

    public EnterThe(String nombre, String apellido, String correo, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pais = pais;
        this.telefono = telefono;
    }

    public static EnterThe credentialsToUpdate(String nombre, String apellido, String correo, String pais, String telefono) {
        return Tasks.instrumented(EnterThe.class, nombre, apellido, correo, pais, telefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(INFO_TEXT_NAME),
                Enter.theValue(apellido).into(INFO_TEXT_SURNAME),
                Enter.theValue(correo).into(INFO_TEXT_EMAIL),
                Click.on(INFO_SELECTOR_ID_COUNTRY),
                SelectFromOptions.byVisibleText(pais).from(SELECTOR_ID_COUNTRY),
                Enter.theValue(telefono).into(INFO_TEXT_CELLPHONE)

        );
    }
}

