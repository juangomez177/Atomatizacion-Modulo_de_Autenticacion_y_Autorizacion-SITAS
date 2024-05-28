package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.pestanainiciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.CONFIRMATION_LOGIN;

public class ValidationLoginAccount implements Question<String> {

    public ValidationLoginAccount() {
    }

    public static ValidationLoginAccount loadCredentials() {

        return new ValidationLoginAccount();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(CONFIRMATION_LOGIN).getText();
        return msg;
    }

}