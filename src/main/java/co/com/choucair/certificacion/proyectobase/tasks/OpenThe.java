package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private GoogleHomePage googleHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleHomePage));
    }

    public static OpenThe GoogleHomePage() {
        return Tasks.instrumented(OpenThe.class);
    }
}
