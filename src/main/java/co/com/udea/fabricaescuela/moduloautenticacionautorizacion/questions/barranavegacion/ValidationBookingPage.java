package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.NavigationBarPage.TITTLE_PAGE_BOOKING;

public class ValidationBookingPage implements Question<String> {

    public ValidationBookingPage() {
    }

    public static ValidationBookingPage isPresent() {
        return new ValidationBookingPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITTLE_PAGE_BOOKING).getText();
        return msg;
    }

}