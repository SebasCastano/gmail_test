package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.test.userinterface.StartPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MessageEmail implements Question<String> {
    Target messageValidate;


    private MessageEmail(Target messageValidate) {
        this.messageValidate = messageValidate;

    }

    public static MessageEmail sendSuccessful() {
        return new MessageEmail(INFO_MESSAGE);
    }

    public static MessageEmail withoutReceiver() {
        return new MessageEmail(INFO_MESSAGE_ERROR);
    }

    public static MessageEmail deletedMessage() {
        return new MessageEmail(INFO_MESSAGE_DELETED);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(messageValidate, isVisible()));
        return messageValidate.resolveFor(actor).getText();
    }
}
