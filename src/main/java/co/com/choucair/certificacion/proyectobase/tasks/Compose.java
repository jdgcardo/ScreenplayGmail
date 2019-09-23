package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.GmailUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class Compose implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new WaitUntilTargetIsReady(GmailUserPage.WRITE_BUTTON,isEnabled()),
                Click.on(GmailUserPage.WRITE_BUTTON),
                Enter.theValue("juangarzo@gmail.com").into(GmailUserPage.TO_AREA),
                Enter.theValue("Correo de prueba").into(GmailUserPage.SUBJECT_AREA),
                Enter.theValue("Cuerpo del mensaje").into(GmailUserPage.TEXT_AREA),
                Click.on(GmailUserPage.SEND_BUTTON),
                new WaitUntilTargetIsReady(GmailUserPage.SENT_BUTTON,isEnabled()),
                Click.on(GmailUserPage.SENT_BUTTON)
        );
    }

    public static Compose AnEmail() {
        return Tasks.instrumented(Compose.class);
    }


}
