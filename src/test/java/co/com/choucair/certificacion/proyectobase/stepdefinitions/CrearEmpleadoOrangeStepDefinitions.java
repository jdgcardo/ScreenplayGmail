package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.RegistroOrange;
import co.com.choucair.certificacion.proyectobase.tasks.CrearNuevoEmpleado;
import co.com.choucair.certificacion.proyectobase.tasks.VisitThe;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CrearEmpleadoOrangeStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Juan necesita crear un empleado en el OrangeHRM$")
    public void queJuanNecesitaCrearUnEmpleadoEnElOrangeHRM() throws Exception {

        OnStage.theActorCalled("Juan").wasAbleTo(VisitThe.OrangePage());

    }


    @Cuando("^el realiza el ingreso del registro en la aplicación$")
    public void elRealizaElIngresoDelRegistroEnLaAplicación(List<RegistroOrange> registroOrange) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(CrearNuevoEmpleado.enOrange(registroOrange));

    }

    @Entonces("^el visualiza el nuevo empleado en el aplicativo$")
    public void elVisualizaElNuevoEmpleadoEnElAplicativo() throws Exception {

    }
}
