package co.com.test.tasks;

import co.com.test.model.Email;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.StartPage.BTN_DELETE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class DeleteEmail implements Task {

    public DeleteEmail() {

    }

    public static DeleteEmail selected() {
        return instrumented(DeleteEmail.class);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_DELETE, isVisible()),
                Click.on(BTN_DELETE));
    }

}
