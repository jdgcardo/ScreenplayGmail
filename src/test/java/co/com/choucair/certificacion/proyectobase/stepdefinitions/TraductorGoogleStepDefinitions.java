package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.questions.TheAnswer;
import co.com.choucair.certificacion.proyectobase.tasks.OpenThe;
import co.com.choucair.certificacion.proyectobase.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TraductorGoogleStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Juan want to use Google Translate$")
    public void thatJuanWantToUseGoogleTranslate() throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenThe.GoogleHomePage());
    }


    @When("^he translate the word (.*) from english to spanish$")
    public void heTranslateTheWordTableFromEnglishToSpanish(String theword) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(Translate.FromEnglishToSpanish(theword));
    }

    @Then("^he should see the word (.*) on the screen$")
    public void heShouldSeeTheWordMesaOnTheScreen(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(TheAnswer.es(question)));

    }


}
