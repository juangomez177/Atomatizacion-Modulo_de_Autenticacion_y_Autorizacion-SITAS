package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.TITTLE_NAVIGATION_BAR;

public class ValidationNavBar implements Question<String> {

    public ValidationNavBar() {
    }

    public static ValidationNavBar isPresent() {
        return new ValidationNavBar();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_NAVIGATION_BAR).getText();
        return msg;
    }
}