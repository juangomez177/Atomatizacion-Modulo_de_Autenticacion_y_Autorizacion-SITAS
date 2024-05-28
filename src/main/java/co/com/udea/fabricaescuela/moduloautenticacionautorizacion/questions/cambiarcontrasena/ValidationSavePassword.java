package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.cambiarcontrasena;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.EDIT_PASSWORD_SUCCESS_MESSAGE;

public class ValidationSavePassword implements Question<String> {

    public ValidationSavePassword() {
    }


    public static ValidationSavePassword isCorrect() {

        return new ValidationSavePassword();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(EDIT_PASSWORD_SUCCESS_MESSAGE).getText();
        return msg;
    }
}