package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanaregistro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.RegisterPage.CONFIRMATION_REGISTER;

public class ValidationRegisterAccount implements Question<String> {

    public ValidationRegisterAccount() {
    }

    public static ValidationRegisterAccount saveCredentials() {
        return new ValidationRegisterAccount();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(CONFIRMATION_REGISTER).getText();
        return msg;
    }

}