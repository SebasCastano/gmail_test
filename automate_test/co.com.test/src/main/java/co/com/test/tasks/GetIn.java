package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.StartPage.BTN_COMPOSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class GetIn implements Task {

    public GetIn() {

    }

    public static GetIn composeMail() {
        return instrumented(GetIn.class);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_COMPOSE, isVisible()),
                Click.on(BTN_COMPOSE));
    }

}
