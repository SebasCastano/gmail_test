package co.com.test.stepdefinitions;

import co.com.test.questions.MessageEmail;
import co.com.test.tasks.CheckFirst;
import co.com.test.tasks.DeleteEmail;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.test.util.Constantes.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ManageEmailStepDefinitions {

    @Given("^that user select an email$")
    public void userWantSendEmail() {
        theActorInTheSpotlight().wasAbleTo(CheckFirst.email());
    }

    @When("^delete the email$")
    public void sendEmail() {
        theActorInTheSpotlight().attemptsTo(DeleteEmail.selected());
    }

    @Then("^see a succesful delete message$")
    public void seeSendMessage() {
        theActorInTheSpotlight().should(seeThat(MessageEmail.deletedMessage(), equalTo(SUCCESS_DELETED_MESSAGE)));
    }

}
