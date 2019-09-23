package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTraductorPage extends PageObject {

    public static final Target BOTON_LENGUAJE_ORIGEN = Target.the("Lenguaje Origen").located(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
    public static final Target BOTON_LENGUAJE_DESTINO = Target.the("Lenguaje Destino").located(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]"));
    public static final Target OPCION_ESPANOL = Target.the("Opción Español").located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/div[30]/div[2]"));
    public static final Target OPCION_INGLES = Target.the("Opción Inglés").located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/div[2]/div/div[3]/div[50]/div[2]"));
    public static final Target AREA_TRADUCIDA = Target.the("Área Traducida").located(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div/span[1]/span"));
    public static final Target AREA_DE_TRADUCCION = Target.the("Área de traduccioon").located(By.id("source"));


}
