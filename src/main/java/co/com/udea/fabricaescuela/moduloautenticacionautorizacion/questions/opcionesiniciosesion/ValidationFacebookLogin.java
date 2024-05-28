package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.opcionesiniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.FACEBOOK_SUCCESS_MESSAGE;

public class ValidationFacebookLogin implements Question<String> {

    public ValidationFacebookLogin() {
    }


    public static ValidationFacebookLogin isTrue() {

        return new ValidationFacebookLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FACEBOOK_SUCCESS_MESSAGE).getText();
        return msg;
    }
}