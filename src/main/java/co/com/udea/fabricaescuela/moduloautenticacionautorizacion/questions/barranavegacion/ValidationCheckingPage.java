package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.TITTLE_PAGE_CHECKING;

public class ValidationCheckingPage implements Question<String> {

    public ValidationCheckingPage() {
    }

    public static ValidationCheckingPage isPresent() {

        return new ValidationCheckingPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_PAGE_CHECKING).getText();
        return msg;
    }

}