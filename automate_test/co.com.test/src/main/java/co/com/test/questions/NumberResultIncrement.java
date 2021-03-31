package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.test.userinterface.StartPage.RESULT_SEARCH;


public class NumberResultIncrement implements Question<Boolean> {


    private NumberResultIncrement() {

    }

    public static NumberResultIncrement thanZero() {
        return new NumberResultIncrement();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int resultSearch = Integer.parseInt(RESULT_SEARCH.resolveFor(actor).getText());
        return resultSearch > 0;
    }
}
