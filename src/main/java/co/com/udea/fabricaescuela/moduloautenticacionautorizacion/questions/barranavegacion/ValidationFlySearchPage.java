package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.TITTLE_PAGE_FLY_SEACH;

public class ValidationFlySearchPage implements Question<String> {

    public ValidationFlySearchPage() {
    }

    public static ValidationFlySearchPage isPresent() {

        return new ValidationFlySearchPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_PAGE_FLY_SEACH).getText();
        return msg;
    }

}