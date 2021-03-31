package co.com.test.tasks;

import co.com.test.model.Email;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import static co.com.test.userinterface.NewMessagePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class WriteDraftEmail implements Task {
    private final String message;

    public WriteDraftEmail(String message) {
        this.message = message;
    }

    public static WriteDraftEmail withText(String message) {
        return instrumented(WriteDraftEmail.class, message);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(WaitUntil.the(INPUT_TO, isVisible()),
                Enter.theValue(message).into(INPUT_MESSAGE),
                Click.on(BTN_CLOSE_SEND));
    }

}
