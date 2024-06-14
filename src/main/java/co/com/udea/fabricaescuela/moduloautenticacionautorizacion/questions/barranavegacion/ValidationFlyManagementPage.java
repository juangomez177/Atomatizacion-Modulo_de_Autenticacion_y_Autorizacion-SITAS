package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.TITTLE_PAGE_FLY_MANAGEMENT;

public class ValidationFlyManagementPage implements Question<String> {

    public ValidationFlyManagementPage() {
    }

    public static ValidationFlyManagementPage isPresent() {
        return new ValidationFlyManagementPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_PAGE_FLY_MANAGEMENT).getText();
        return msg;
    }

}