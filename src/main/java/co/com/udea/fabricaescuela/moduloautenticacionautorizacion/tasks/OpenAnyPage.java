package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class OpenAnyPage implements Task {
    private String url;
    private PageObject page;

    public OpenAnyPage(PageObject page) {
        this.page = page;
    }

    public OpenAnyPage(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} abre la pagina en #url")
    public <T extends Actor> void performAs(T actor) {
        if (page != null) {
            actor.attemptsTo(Open.browserOn(page));
        } else if (url != null) {
            ThucydidesWebDriverSupport.getDriver().get(url);
        }
    }

    public static OpenAnyPage browser(PageObject page) {
        return Tasks.instrumented(OpenAnyPage.class, page);
    }

    public static OpenAnyPage browser(String url) {
        return Tasks.instrumented(OpenAnyPage.class, url);
    }
}
