package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.EditProfilePage.EDIT_PROFILE_OPTION;

public class ValidationEditProfile implements Question<String> {

    public ValidationEditProfile() {
    }

    public static ValidationEditProfile isPresent() {
        return new ValidationEditProfile();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(EDIT_PROFILE_OPTION).getText();
        return msg;
    }

}