package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.test.userinterface.StartPage.CHECK_FIRST_EMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CheckFirst implements Task {

    public CheckFirst() {

    }

    public static CheckFirst email() {
        return instrumented(CheckFirst.class);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(WaitUntil.the(CHECK_FIRST_EMAIL, isVisible()),
                Click.on(CHECK_FIRST_EMAIL));
    }

}
