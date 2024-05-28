package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.barranavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.BOOKING_OPTION;

public class ValidationBookingOption implements Question<String> {

    public ValidationBookingOption() {
    }

    public static ValidationBookingOption isPresent() {

        return new ValidationBookingOption();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(BOOKING_OPTION).getText();
        return msg;
    }

}