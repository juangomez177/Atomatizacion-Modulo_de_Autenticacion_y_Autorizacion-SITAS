package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaactualizarperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.TITTLE_EDIT_PROFILE_2;

public class ValidationUpdateProfileAction implements Question<String> {

    public ValidationUpdateProfileAction() {
    }

    public static ValidationUpdateProfileAction updateCredentials() {
        return new ValidationUpdateProfileAction();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_EDIT_PROFILE_2).getText();
        return msg;
    }

}