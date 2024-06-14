package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.ultimoingresofallido;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.CONSECUTIVE_FAILED_LOGIN_MESSAGE;

public class ValidationAccount implements Question<String> {

    public ValidationAccount() {
    }

    public static ValidationAccount isBlocked() {
        return new ValidationAccount();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(CONSECUTIVE_FAILED_LOGIN_MESSAGE).getText();
        return msg;
    }

}