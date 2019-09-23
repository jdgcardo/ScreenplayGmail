package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.GoogleHomePage;
import co.com.choucair.certificacion.proyectobase.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {

    private String theword;


    public Translate(String theword) {
        this.theword = theword;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_APLICACIONES));
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(GoogleHomePage.IFRAME.resolveFor(actor));
        actor.attemptsTo(

                Click.on(GoogleHomePage.BOTON_GOOGLE_TRANSLATE),
                Click.on(GoogleTraductorPage.BOTON_LENGUAJE_ORIGEN),
                Click.on(GoogleTraductorPage.OPCION_INGLES),
                Click.on(GoogleTraductorPage.BOTON_LENGUAJE_DESTINO),
                Click.on(GoogleTraductorPage.OPCION_ESPANOL),
                Enter.theValue(theword).into(GoogleTraductorPage.AREA_DE_TRADUCCION)
                );
    }

    public static Translate FromEnglishToSpanish(String theword) {
        return Tasks.instrumented(Translate.class, theword);
    }
}
