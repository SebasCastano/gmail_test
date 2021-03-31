package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static co.com.test.userinterface.StartPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FilterEmail implements Task {
    private final String message;

    public FilterEmail(String message) {
        this.message = message;
    }

    public static FilterEmail withText(String message) {
        return instrumented(FilterEmail.class, message);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(WaitUntil.the(INPUT_SEARCH, isVisible()),
                Enter.theValue(message).into(INPUT_SEARCH).thenHit(Keys.ENTER));
    }

}
