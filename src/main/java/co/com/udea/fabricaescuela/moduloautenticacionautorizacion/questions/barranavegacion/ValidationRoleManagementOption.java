package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.ROLE_MANAGEMENT_OPTION;

public class ValidationRoleManagementOption implements Question<String> {

    public ValidationRoleManagementOption() {
    }

    public static ValidationRoleManagementOption isPresent() {
        return new ValidationRoleManagementOption();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(ROLE_MANAGEMENT_OPTION).getText();
        return msg;
    }

}