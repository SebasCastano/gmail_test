package co.com.test.tasks;

import co.com.test.model.Credencials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogIn implements Task {

    private final Credencials credencials;

    public LogIn(final Credencials credencials) {
        this.credencials = credencials;
    }

    public static LogIn withCredencials(final Credencials credencials) {
        return Tasks.instrumented(LogIn.class, credencials);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {

        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isVisible())
                , Enter.theValue(credencials.getStrUsuario()).into(INPUT_USERNAME.called("Type Username"))
                , Click.on(BTN_USER_NEXT)
                , WaitUntil.the(BTN_PASSWORD_NEXT, isVisible())
                , Enter.theValue(credencials.getStrPassword()).into(INPUT_PASSWORD.called("Type Password"))
                , Click.on(BTN_PASSWORD_NEXT)
        );
    }
}
