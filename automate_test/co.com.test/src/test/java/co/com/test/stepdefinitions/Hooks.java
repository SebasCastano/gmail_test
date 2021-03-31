package co.com.test.stepdefinitions;

import co.com.test.model.Credencials;
import co.com.test.tasks.LogIn;
import co.com.test.tasks.OpenUp;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hooks {

    @Before()
    public void inicializeActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage(),
                LogIn.withCredencials(Credencials.parameterized()));
    }
}
