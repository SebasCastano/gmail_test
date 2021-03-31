package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.test.userinterface.StartPage.*;
import static co.com.test.util.Constantes.NUMBER_DRAFT;


public class NumberDraftMessage implements Question<Boolean> {


    private NumberDraftMessage() {

    }

    public static NumberDraftMessage increment() {
        return new NumberDraftMessage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int numberDraft = Integer.parseInt(actor.recall(NUMBER_DRAFT).toString());
        int numberDraftActual = Integer.parseInt(LABEL_NUMBER_DRAFTS.resolveFor(actor).getText());
        return numberDraft < numberDraftActual;
    }
}
