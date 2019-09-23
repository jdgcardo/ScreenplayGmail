package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.tasks.AccessTo;
import co.com.choucair.certificacion.proyectobase.tasks.Compose;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EnviarCorreoStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that user want to use Gmail$")
    public void thatUserWantToUseGmail() throws Exception {
        OnStage.theActorCalled("user").wasAbleTo(AccessTo.GmailHomePage(),
                Login.intoGmail());
    }

    @When("^he send the email$")
    public void heSendTheEmail() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Compose.AnEmail());

    }

    @Then("^he sees the email on sent directory$")
    public void heSeesTheEmailOnSentDirectory() throws Exception {

    }
}
