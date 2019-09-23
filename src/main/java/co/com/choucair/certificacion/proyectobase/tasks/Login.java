package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.GmailHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Enter.theValue("autotestinguser123").into(GmailHomePage.USER_FIELD),
            Click.on(GmailHomePage.NEXT_BUTTON),
            Enter.theValue("Usuario123").into(GmailHomePage.PASSWORD_FIELD),
            Click.on(GmailHomePage.PASS_NEXT_BUTTON)
        );

    }

    public static Login intoGmail() {
        return Tasks.instrumented(Login.class);
    }
}
