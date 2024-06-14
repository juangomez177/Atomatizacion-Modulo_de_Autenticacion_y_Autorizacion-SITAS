package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.opcionesiniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.GOOGLE_SUCCESS_MESSAGE;

public class ValidationGoogleLogin implements Question<String> {

    public ValidationGoogleLogin() {
    }

    public static ValidationGoogleLogin isTrue() {
        return new ValidationGoogleLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(GOOGLE_SUCCESS_MESSAGE).getText();
        return msg;
    }
}