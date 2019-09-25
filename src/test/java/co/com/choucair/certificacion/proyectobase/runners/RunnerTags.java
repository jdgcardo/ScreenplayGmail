package co.com.choucair.certificacion.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/traductorGoogle.feature",
        //features = "src/test/resources/features/enviarCorreo.feature",
        //features = "src/test/resources/features/registerDemoSite.feature",
        //features = "src/test/resources/features/crearEmpleadoOrange.feature",
        //tags = "@tag1",
        glue = "co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
