package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.FLY_SEACH_OPTION;

public class ValidationFlySearchOption implements Question<String> {

    public ValidationFlySearchOption() {
    }

    public static ValidationFlySearchOption isPresent() {
        return new ValidationFlySearchOption();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FLY_SEACH_OPTION).getText();
        return msg;
    }

}