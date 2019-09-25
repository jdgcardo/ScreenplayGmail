package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoSite extends PageObject {

    public static final Target CAMPO_NOMBRE = Target.the("Campo Nombre").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo Apellido").located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target CAMPO_DIRECCION = Target.the("Campo Dirección").located(By.xpath("//textarea[@ng-model='Adress']"));
    public static final Target CAMPO_EMAIL = Target.the("Campo email").located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target CAMPO_TELEFONO = Target.the("Campo teléfono").located(By.xpath("//input[@ng-model='Phone']"));
    public static final Target RADIOBUTTON_GENERO_MASCULINO = Target.the("Genero Masculino").located(By.xpath("//label[1]//input[1]"));
    public static final Target RADIOBUTTON_GENERO_FEMENINO = Target.the("Genero Femenino").located(By.xpath("//label[2]//input[1]"));
    public static final Target CHECKBOX_CRICKET = Target.the("Hobbie Cricket").located(By.id("checkbox1"));
    public static final Target CHECKBOX_MOVIES = Target.the("Hobbie Movies").located(By.id("checkbox2"));
    public static final Target CHECKBOX_HOCKEY = Target.the("Hobbie Hockey").located(By.id("checkbox3"));
    public static final Target MULTISELECT_LENGUAJES = Target.the("seleccionar lenguajes").located(By.id("msdd"));
    public static final Target IDIOMA_ITALIANO = Target.the("Italiano").located(By.xpath("//a[contains(text(),'Italian')]"));
    public static final Target IDIOMA_INGLES = Target.the("Ingles").located(By.xpath("//a[contains(text(),'English')]"));

    public static final Target SKILLS = Target.the("seleccionar skills").located(By.id("Skills"));
    public static final Target PAISES = Target.the("seleccionar pais").located(By.id("countries"));
    public static final Target SELECCIONAR_PAIS = Target.the("seleccionar paises").located(By.xpath("//span[@class='select2-selection select2-selection--single']"));
    public static final Target ESCRIBIR_PAIS = Target.the("escribir pais").located(By.xpath("//input[@class='select2-search__field']"));
    public static final Target SELECCION_PAIS = Target.the("seleccionar pais").located(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]"));
    public static final Target ANIO = Target.the("Año de nacimiento").located(By.id("yearbox"));
    public static final Target MES = Target.the("Mes de nacimiento").located(By.xpath("//select[@placeholder='Month']"));
    public static final Target DIA = Target.the("Día de nacimiento").located(By.id("daybox"));
    public static final Target PASSWORD = Target.the("Día de nacimiento").located(By.id("firstpassword"));
    public static final Target CONFIRM_PASSWORD = Target.the("Día de nacimiento").located(By.id("secondpassword"));
    public static final Target BOTON_SUBMIT = Target.the("botón submit").located(By.id("submitbtn"));
    public static final Target PALABRA_VALIDAR = Target.the("palabra validar").located(By.xpath("//b[contains(text(),'EDIT')]"));


}
