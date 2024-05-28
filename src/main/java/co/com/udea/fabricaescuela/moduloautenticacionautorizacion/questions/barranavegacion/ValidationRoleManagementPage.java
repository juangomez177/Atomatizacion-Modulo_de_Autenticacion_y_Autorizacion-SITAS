package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.TITTLE_PAGE_ROLE_MANAGEMENT;

public class ValidationRoleManagementPage implements Question<String> {

    public ValidationRoleManagementPage() {
    }

    public static ValidationRoleManagementPage isPresent() {

        return new ValidationRoleManagementPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_PAGE_ROLE_MANAGEMENT).getText();
        return msg;
    }

}