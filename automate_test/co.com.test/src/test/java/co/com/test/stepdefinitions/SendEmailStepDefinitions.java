package co.com.test.stepdefinitions;

import co.com.test.model.Email;
import co.com.test.questions.MessageEmail;
import co.com.test.tasks.GetIn;
import co.com.test.tasks.WriteEmail;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.test.util.Constantes.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SendEmailStepDefinitions {

    @Given("^that user want send an email$")
    public  void userWantSendEmail(){
        theActorInTheSpotlight().wasAbleTo(GetIn.composeMail());
    }

    @When("^send an email with required fields$")
    public  void sendEmail(List<Email> emailData){
        theActorInTheSpotlight().attemptsTo(WriteEmail.withData(emailData.get(0)));
    }

    @Then("^see a successful send message$")
    public  void seeSendMessage(){
        theActorInTheSpotlight().should(seeThat(MessageEmail.sendSuccessful(), equalTo(SUCCESS_SENT_MESSAGE)));
    }

    @When("^send an email without receiver$")
    public  void sendEmailWithoutReceiver(List<Email> emailData){
        theActorInTheSpotlight().attemptsTo(WriteEmail.withoutReceiver(emailData.get(0)));
    }

    @Then("^see a warning for missing receiver$")
    public  void seeWithoutReceiverMessage(){
        theActorInTheSpotlight().should(seeThat(MessageEmail.withoutReceiver(), equalTo(WITHOUT_RECEIVER_MESSAGE)));
    }

}
