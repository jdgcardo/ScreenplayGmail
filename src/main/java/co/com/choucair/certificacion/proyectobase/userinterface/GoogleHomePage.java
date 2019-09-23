package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {
    public static final Target BOTON_APLICACIONES = Target.the("Boton aplicaciones").located(By.id("gbwa"));
    public static final Target IFRAME = Target.the("Frame Menu").located(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/iframe"));
    public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("Boton traductor")
            .located(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[11]/a/span[2]"));

}

