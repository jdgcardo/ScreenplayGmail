package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailUserPage extends PageObject {
    public static final Target WRITE_BUTTON = Target.the("Boton Redactar")
            .located(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div"));
    public static final Target TO_AREA = Target.the("Destinatarios")
            .located(By.xpath("//textarea[@class='vO'][@name='to']"));
    public static final Target SUBJECT_AREA = Target.the("Asunto")
            .located(By.xpath("//input[@class='aoT'][@name='subjectbox']"));
    public static final Target TEXT_AREA = Target.the("Cuerpo del correo")
            .located(By.xpath("//div[@class='Am Al editable LW-avf tS-tW'][@role='textbox']"));
    public static final Target SEND_BUTTON = Target.the("Boton Enviar")
            .located(By.xpath("// div [contains (@ data-tooltip, 'Enviar') and contains (@ aria-label, 'Enviar') ]"));
    public static final Target SENT_BUTTON = Target.the("Enviados")
            .located(By.xpath("//a[contains(text(),'Enviados')]"));




}
