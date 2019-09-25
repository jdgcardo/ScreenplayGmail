package co.com.choucair.certificacion.proyectobase.questions;

import co.com.choucair.certificacion.proyectobase.userinterface.AutomationDemoSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaPalabra implements Question <Boolean>  {

    private String pregunta;

    public LaPalabra(String pregunta) {
        this.pregunta = pregunta;
    }

    public static LaPalabra es(String pregunta) {
        return new LaPalabra(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String palabraValidar = Text.of(AutomationDemoSite.PALABRA_VALIDAR).viewedBy(actor).asString();
        if(pregunta.equals(palabraValidar))
        {
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;

    }
}
