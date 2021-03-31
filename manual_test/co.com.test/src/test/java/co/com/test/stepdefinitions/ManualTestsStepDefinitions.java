package co.com.test.stepdefinitions;

import co.com.test.util.ManualTest;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class ManualTestsStepDefinitions {
    private Scenario scenario;


    @Before
    public void getScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public  void verifyScenario(String step){
        ManualTest.validate(step, scenario.getName());
    }


}
