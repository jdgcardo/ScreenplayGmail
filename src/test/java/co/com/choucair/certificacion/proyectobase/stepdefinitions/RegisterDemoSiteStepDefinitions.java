package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.RegistroAutomationDemo;
import co.com.choucair.certificacion.proyectobase.questions.LaPalabra;
import co.com.choucair.certificacion.proyectobase.tasks.OpenThe;
import co.com.choucair.certificacion.proyectobase.tasks.RegistrarNuevoUsuario;
import co.com.choucair.certificacion.proyectobase.tasks.Visit;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

public class RegisterDemoSiteStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
    public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(Visit.AutomationDemoSite());
    }


    @Cuando("^el realiza el registro en la página$")
    public void elRealizaElRegistroEnLaPágina(List<RegistroAutomationDemo> registroAutomationDemo) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarNuevoUsuario.EnAutomationdemoSite(registroAutomationDemo));
    }

    @Entonces("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to (.*) the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String pregunta) throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(LaPalabra.es(pregunta)));

    }


}
