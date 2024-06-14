package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.interactions.opcionesiniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.FACEBOOK_LOGIN_BUTTON;
import static co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces.LoginPage.GOOGLE_LOGIN_BUTTON;

public class ClickThe implements Interaction {

    private final Target target;

    // Constructor privado para recibir el Target (Para incluir varios métodos)
    private ClickThe(Target target) {
        this.target = target;
    }

    public static ClickThe googleLoginButton() {
        return Tasks.instrumented(ClickThe.class, GOOGLE_LOGIN_BUTTON);
    }

    public static ClickThe facebookLoginButton() {
        return Tasks.instrumented(ClickThe.class, FACEBOOK_LOGIN_BUTTON);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(target));
    }
}
