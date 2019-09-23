package co.com.choucair.certificacion.proyectobase.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://www.gmail.com")
public class GmailHomePage extends PageObject {
    public static final Target USER_FIELD = Target.the("Campo usuario")
            .located(By.id("identifierId"));
    public static final Target NEXT_BUTTON = Target.the("Boton siguiente_usuario")
            .located(By.id("identifierNext"));
    public static final Target PASSWORD_FIELD = Target.the("Campo contraseña")
            .located(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
    public static final Target PASS_NEXT_BUTTON = Target.the("Boton siguiente_contraseña")
            .located(By.id("passwordNext"));
}
