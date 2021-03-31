package co.com.test.stepdefinitions;

import co.com.test.questions.MessageEmail;
import co.com.test.questions.NumberDraftMessage;
import co.com.test.tasks.GetIn;
import co.com.test.tasks.SeeDraftNumber;
import co.com.test.tasks.WriteDraftEmail;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.test.util.Constantes.SUCCESS_DELETED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CreateDraftEmailStepDefinitions {

    @Given("^that user want write an draft email$")
    public void userWantWriteDraftEmail() {

        theActorInTheSpotlight().wasAbleTo(SeeDraftNumber.actual());
        theActorInTheSpotlight().wasAbleTo(GetIn.composeMail());
    }

    @When("^write a draft message with the text (.*)$")
    public void writeDraftEmail(String text) {
        theActorInTheSpotlight().attemptsTo(WriteDraftEmail.withText(text));
    }


    @Then("^see the number draft message increment$")
    public void seeSendMessage() {
        theActorInTheSpotlight().should(seeThat(NumberDraftMessage.increment()));
    }

}
