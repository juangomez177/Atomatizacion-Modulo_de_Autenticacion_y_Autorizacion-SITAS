package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.botoniniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.LOGIN_PAGE_BUTTON;

public class ValidationLoginPage implements Question<String> {

    public ValidationLoginPage() {
    }

    public static ValidationLoginPage theSite() {

        return new ValidationLoginPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(LOGIN_PAGE_BUTTON).getText();
        return msg;
    }

}