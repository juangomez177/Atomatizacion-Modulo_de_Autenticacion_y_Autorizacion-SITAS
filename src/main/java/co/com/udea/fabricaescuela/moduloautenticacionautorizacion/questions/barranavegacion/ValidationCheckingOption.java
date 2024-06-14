package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.CHECKING_OPTION;

public class ValidationCheckingOption implements Question<String> {

    public ValidationCheckingOption() {
    }

    public static ValidationCheckingOption isPresent() {
        return new ValidationCheckingOption();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(CHECKING_OPTION).getText();
        return msg;
    }

}