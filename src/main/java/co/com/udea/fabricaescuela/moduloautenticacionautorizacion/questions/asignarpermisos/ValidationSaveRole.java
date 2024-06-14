package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.asignarpermisos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.AdminPage.SAVE_ROLE_SUCCESS_MESSAGE;

public class ValidationSaveRole implements Question<String> {

    public ValidationSaveRole() {
    }

    public static ValidationSaveRole isCorrect() {

        return new ValidationSaveRole();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(SAVE_ROLE_SUCCESS_MESSAGE).getText();
        return msg;
    }

}