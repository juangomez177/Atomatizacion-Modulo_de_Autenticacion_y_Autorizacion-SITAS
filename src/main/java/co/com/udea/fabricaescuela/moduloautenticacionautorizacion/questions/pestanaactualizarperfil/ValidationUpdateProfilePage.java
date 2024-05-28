package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaactualizarperfil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.TITTLE_EDIT_PROFILE;

public class ValidationUpdateProfilePage implements Question<String> {

    public ValidationUpdateProfilePage() {
    }

    public static ValidationUpdateProfilePage isEnable() {

        return new ValidationUpdateProfilePage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_EDIT_PROFILE).getText();
        return msg;
    }

}