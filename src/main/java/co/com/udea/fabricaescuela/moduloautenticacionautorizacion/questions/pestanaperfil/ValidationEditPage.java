package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.TITTLE_EDIT_PROFILE;

public class ValidationEditPage implements Question<String> {

    public ValidationEditPage() {
    }

    public static ValidationEditPage isPresent() {

        return new ValidationEditPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_EDIT_PROFILE).getText();
        return msg;
    }

}