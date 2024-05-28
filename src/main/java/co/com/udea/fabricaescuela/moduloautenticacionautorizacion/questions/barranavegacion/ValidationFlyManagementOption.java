package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.FLY_MANAGEMENT_OPTION;

public class ValidationFlyManagementOption implements Question<String> {

    public ValidationFlyManagementOption() {
    }

    public static ValidationFlyManagementOption isPresent() {

        return new ValidationFlyManagementOption();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FLY_MANAGEMENT_OPTION).getText();
        return msg;
    }

}