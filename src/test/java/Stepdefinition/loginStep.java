package Stepdefinition;

import Task.loginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStep {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario ingresa a la aplicacion$")
    public void el_usuario_ingresa_a_la_aplicacion() {
        theActorCalled("admin").attemptsTo(Open.url("https://serenity.is/demo/"));
    }

    @When("^El usuario ingresa (.+) y (.+)$")
    public void el_usuario_ingresa_y(String user, String password) {
        theActorCalled("admin").attemptsTo(loginTask.Login(user, password));
    }
}
