package co.com.choucair.certificacion.proyectobase.questions;

import co.com.choucair.certificacion.proyectobase.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswer implements Question <Boolean> {

    public TheAnswer(String question) {
        this.question = question;
    }

    private String question;

    public static TheAnswer es(String question) {
        return new TheAnswer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String translated = Text.of(GoogleTraductorPage.AREA_TRADUCIDA).viewedBy(actor).asString();

        if(question.equals(translated)){
            result=true;
        }else {
            result=false;
        }
        return result;

    }
}
