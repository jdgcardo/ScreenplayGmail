package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.model.RegistroOrange;
import co.com.choucair.certificacion.proyectobase.userinterface.OrangeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import java.util.List;

public class CrearNuevoEmpleado implements Task {

    private List<RegistroOrange> registroOrange;

    public CrearNuevoEmpleado(List<RegistroOrange> registroOrange) {
        this.registroOrange = registroOrange;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OrangeHomePage.BOTON_LOGIN),
                Click.on(OrangeHomePage.MODULO_PIM),
                Click.on(OrangeHomePage.ADICIONAR_EMPLEADO),
                Enter.theValue(registroOrange.get(0).getFirstname()).into(OrangeHomePage.NOMBRE_EMPLEADO),
                Enter.theValue(registroOrange.get(0).getLastname()).into(OrangeHomePage.APELLIDO_EMPLEADO),
                Click.on(OrangeHomePage.LOCATION_DROPDOWN),
                Check.whether(registroOrange.get(0).getLocation().trim().equals("German Regional HQ")).andIfSo(Click.on(OrangeHomePage.LOCATION_GERMAN_REGIONAL)),
                Check.whether(registroOrange.get(0).getLocation().trim().equals("London Office")).andIfSo(Click.on(OrangeHomePage.LOCATION_LONDON_OFFICE)),
                Click.on(OrangeHomePage.BOTON_SALVAR_DATOS_BASICOS),
                new ScrollToTarget(OrangeHomePage.SELECT_BLOOD_GROUP),
                Click.on(OrangeHomePage.SELECT_BLOOD_GROUP),
                Check.whether(registroOrange.get(0).getBlood().trim().equals("A")).andIfSo(Click.on(OrangeHomePage.SELECT_BLOOD_A)),
                Check.whether(registroOrange.get(0).getBlood().trim().equals("B")).andIfSo(Click.on(OrangeHomePage.SELECT_BLOOD_B)),
                Check.whether(registroOrange.get(0).getBlood().trim().equals("AB")).andIfSo(Click.on(OrangeHomePage.SELECT_BLOOD_AB)),
                Check.whether(registroOrange.get(0).getBlood().trim().equals("O")).andIfSo(Click.on(OrangeHomePage.SELECT_BLOOD_O)),
                Enter.theValue(registroOrange.get(0).getHobbies()).into(OrangeHomePage.HOBBIES),
                Click.on(OrangeHomePage.BOTON_NEXT),

                new ScrollToTarget(OrangeHomePage.REGION_SELECT),
                Click.on(OrangeHomePage.REGION_SELECT),
                Check.whether(registroOrange.get(0).getRegion().trim().equals("Region-1")).andIfSo(Click.on(OrangeHomePage.REGION_1)),
                Check.whether(registroOrange.get(0).getRegion().trim().equals("Region-2")).andIfSo(Click.on(OrangeHomePage.REGION_2)),
                Check.whether(registroOrange.get(0).getRegion().trim().equals("Region-3")).andIfSo(Click.on(OrangeHomePage.REGION_3)),
                Click.on(OrangeHomePage.FTE_SELECT),
                Check.whether(registroOrange.get(0).getFte().trim().equals("0.5")).andIfSo(Click.on(OrangeHomePage.FTE_05)),
                Check.whether(registroOrange.get(0).getFte().trim().equals("0.75")).andIfSo(Click.on(OrangeHomePage.FTE_075)),
                Check.whether(registroOrange.get(0).getFte().trim().equals("1")).andIfSo(Click.on(OrangeHomePage.FTE_1)),
                Click.on(OrangeHomePage.SELECT_TEMPORARY),
                Check.whether(registroOrange.get(0).getTemporary().trim().equals("Sub unit-1")).andIfSo(Click.on(OrangeHomePage.SELECT_TEMPORARY_1)),
                Check.whether(registroOrange.get(0).getTemporary().trim().equals("Sub unit-2")).andIfSo(Click.on(OrangeHomePage.SELECT_TEMPORARY_2)),
                Check.whether(registroOrange.get(0).getTemporary().trim().equals("Sub unit-3")).andIfSo(Click.on(OrangeHomePage.SELECT_TEMPORARY_3)),
                Check.whether(registroOrange.get(0).getTemporary().trim().equals("Sub unit-4")).andIfSo(Click.on(OrangeHomePage.SELECT_TEMPORARY_4))

        );
        try {
            actor.wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static CrearNuevoEmpleado enOrange(List<RegistroOrange> registroOrange) {
        return Tasks.instrumented(CrearNuevoEmpleado.class,registroOrange);
    }


}
