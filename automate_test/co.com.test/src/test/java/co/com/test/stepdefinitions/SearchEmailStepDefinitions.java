package co.com.test.stepdefinitions;

import co.com.test.questions.NumberResultIncrement;
import co.com.test.tasks.FilterEmail;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchEmailStepDefinitions {

    @When("^filter a email by keyword (.*)$")
    public void writeDraftEmail(String subject) {
        theActorInTheSpotlight().attemptsTo(FilterEmail.withText(subject));
    }


    @Then("^see a expected message$")
    public void seeSendMessage() {
        theActorInTheSpotlight().should(seeThat(NumberResultIncrement.thanZero()));
    }

}
