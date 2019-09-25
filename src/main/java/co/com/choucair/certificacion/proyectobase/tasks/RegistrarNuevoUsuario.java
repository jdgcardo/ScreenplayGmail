package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.model.RegistroAutomationDemo;
import co.com.choucair.certificacion.proyectobase.userinterface.AutomationDemoSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

public class RegistrarNuevoUsuario implements Task {

    private List<RegistroAutomationDemo> registroAutomationDemo;

    public RegistrarNuevoUsuario(List<RegistroAutomationDemo> registroAutomationDemo) {
        this.registroAutomationDemo = registroAutomationDemo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(registroAutomationDemo.get(0).getFirstname()).into(AutomationDemoSite.CAMPO_NOMBRE),
                Enter.theValue(registroAutomationDemo.get(0).getLastname()).into(AutomationDemoSite.CAMPO_APELLIDO),
                Enter.theValue(registroAutomationDemo.get(0).getAddress()).into(AutomationDemoSite.CAMPO_DIRECCION),
                Enter.theValue(registroAutomationDemo.get(0).getEmail()).into(AutomationDemoSite.CAMPO_EMAIL),
                Enter.theValue(registroAutomationDemo.get(0).getPhone()).into(AutomationDemoSite.CAMPO_TELEFONO),
                Check.whether(registroAutomationDemo.get(0).getGender().trim().equals("Male")).
                        andIfSo(Click.on(AutomationDemoSite.RADIOBUTTON_GENERO_MASCULINO)).
                        otherwise(Click.on(AutomationDemoSite.RADIOBUTTON_GENERO_FEMENINO)),
                Check.whether(registroAutomationDemo.get(0).getHobbies().trim().equals("Cricket")).andIfSo(Click.on(AutomationDemoSite.CHECKBOX_CRICKET)),
                Check.whether(registroAutomationDemo.get(0).getHobbies().trim().equals("Movies")).andIfSo(Click.on(AutomationDemoSite.CHECKBOX_MOVIES)),
                Check.whether(registroAutomationDemo.get(0).getHobbies().trim().equals("Hockey")).andIfSo(Click.on(AutomationDemoSite.CHECKBOX_HOCKEY)),

                Click.on(AutomationDemoSite.MULTISELECT_LENGUAJES),
                Check.whether(registroAutomationDemo.get(0).getLanguages().trim().equals("English")).andIfSo(Click.on(AutomationDemoSite.IDIOMA_INGLES)),
                Check.whether(registroAutomationDemo.get(0).getLanguages().trim().equals("Italian")).andIfSo(Click.on(AutomationDemoSite.IDIOMA_ITALIANO)),

                new SelectByValueFromTarget(AutomationDemoSite.SKILLS,registroAutomationDemo.get(0).getSkills()),
                new SelectByValueFromTarget(AutomationDemoSite.PAISES,registroAutomationDemo.get(0).getCountry()),

                Click.on(AutomationDemoSite.SELECCIONAR_PAIS),
                Enter.theValue(registroAutomationDemo.get(0).getSelectcountry()).into(AutomationDemoSite.ESCRIBIR_PAIS),
                Click.on(AutomationDemoSite.SELECCION_PAIS),

                new SelectByValueFromTarget(AutomationDemoSite.ANIO,registroAutomationDemo.get(0).getYearofbirth()),
                new SelectByValueFromTarget(AutomationDemoSite.MES,registroAutomationDemo.get(0).getMonthofbirth()),
                new SelectByValueFromTarget(AutomationDemoSite.DIA,registroAutomationDemo.get(0).getDayofbirth()),

                Enter.theValue(registroAutomationDemo.get(0).getPassword()).into(AutomationDemoSite.PASSWORD),
                Enter.theValue(registroAutomationDemo.get(0).getPassword()).into(AutomationDemoSite.CONFIRM_PASSWORD),

                Click.on(AutomationDemoSite.BOTON_SUBMIT)
        );

    }


    public static RegistrarNuevoUsuario EnAutomationdemoSite(List<RegistroAutomationDemo> registroAutomationDemo) {

        return Tasks.instrumented(RegistrarNuevoUsuario.class,registroAutomationDemo);

    }


}
