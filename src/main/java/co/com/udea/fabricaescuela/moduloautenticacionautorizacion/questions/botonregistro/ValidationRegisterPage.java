package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.questions.botonregistro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.SitasPage.REGISTER_PAGE_BUTTON;

public class ValidationRegisterPage implements Question<String> {

    public ValidationRegisterPage() {
    }


    public static ValidationRegisterPage theSite() {

        return new ValidationRegisterPage();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(REGISTER_PAGE_BUTTON).getText();
        return msg;
    }
}