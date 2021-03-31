package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.test.userinterface.StartPage.BTN_COMPOSE;
import static co.com.test.userinterface.StartPage.LABEL_NUMBER_DRAFTS;
import static co.com.test.util.Constantes.NUMBER_DRAFT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeeDraftNumber implements Task {

    public static SeeDraftNumber actual(){return new SeeDraftNumber();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_COMPOSE, isVisible()));
        String numberDraft = LABEL_NUMBER_DRAFTS.resolveFor(actor).getText();
        actor.remember(NUMBER_DRAFT,numberDraft);
    }
}
