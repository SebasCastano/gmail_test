package co.com.test.tasks;

import co.com.test.model.Email;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.NewMessagePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class WriteEmail implements Task {
    private final Email email;

    public WriteEmail(Email email) {
        this.email = email;
    }

    public static WriteEmail withData(Email email) {
        return instrumented(WriteEmail.class, email);
    }
    public static WriteEmail withoutReceiver(Email email) {
        return instrumented(WriteEmail.class, email);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(WaitUntil.the(INPUT_TO, isVisible()),
                Enter.theValue(email.getReceiver()).into(INPUT_TO),
                Enter.theValue(email.getSubject()).into(INPUT_SUBJECT),
                Enter.theValue(email.getMessage()).into(INPUT_MESSAGE),
                Click.on(BTN_SEND));
    }

}
