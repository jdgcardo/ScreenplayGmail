package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.AutomationDemoSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;


public class Visit implements Task {

    private AutomationDemoSite automationDemoSite;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationDemoSite));

    }

    public static Visit AutomationDemoSite() {
        return Tasks.instrumented(Visit.class);
    }
}
