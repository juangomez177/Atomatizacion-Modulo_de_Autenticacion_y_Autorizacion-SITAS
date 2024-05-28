package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.contrasenasegura;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.CONFIRMATION_PASSWORD_SAFE;

public class ValidationPasswordSafe implements Question<String> {

    public ValidationPasswordSafe() {
    }

    public static ValidationPasswordSafe message() {

        return new ValidationPasswordSafe();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(CONFIRMATION_PASSWORD_SAFE).getText();
        return msg;
    }

}