package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.OrangeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class VisitThe implements Task {

    private OrangeHomePage orangeHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(orangeHomePage));
    }

    public static VisitThe OrangePage() {
        return Tasks.instrumented(VisitThe.class);

    }
}
