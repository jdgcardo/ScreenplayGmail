package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHomePage extends PageObject {

    public static final Target BOTON_LOGIN = Target.the("Botón Login").located(By.id("btnLogin"));
    public static final Target MODULO_PIM = Target.the("Modulo PIM").located(By.id("menu_pim_viewPimModule"));
    public static final Target ADICIONAR_EMPLEADO = Target.the("Adicionar Empleado").located(By.id("menu_pim_addEmployee"));
    public static final Target NOMBRE_EMPLEADO = Target.the("Nombre Empleado").located(By.id("firstName"));
    public static final Target APELLIDO_EMPLEADO = Target.the("Apellido Empleado").located(By.id("lastName"));
    public static final Target LOCATION_DROPDOWN = Target.the("Location Dropdwon").located(By.xpath("//div[@class='select-wrapper initialized']//input[@class='select-dropdown']"));
    public static final Target LOCATION_GERMAN_REGIONAL = Target.the("Location German").located(By.xpath("//span[contains(text(),'German Regional HQ')]"));
    public static final Target LOCATION_LONDON_OFFICE = Target.the("Location London").located(By.xpath("//span[contains(text(),'London Office')]"));
    public static final Target BOTON_SALVAR_DATOS_BASICOS = Target.the("Boton Salvar").located(By.xpath("//a[@id='systemUserSaveBtn']"));
    public static final Target SELECT_BLOOD_GROUP = Target.the("Seleccionar grupo Sanguineo").located(By.xpath("//div[@id='1_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target SELECT_BLOOD_A = Target.the("Seleccionar grupo Sanguineo A").located(By.xpath("//custom-fields-panel//li[2]//span[1]"));
    public static final Target SELECT_BLOOD_B = Target.the("Seleccionar grupo Sanguineo B").located(By.xpath("//custom-fields-panel//li[4]//span[1]"));
    public static final Target SELECT_BLOOD_AB = Target.the("Seleccionar grupo Sanguineo AB").located(By.xpath("//span[contains(text(),'AB')]"));
    public static final Target SELECT_BLOOD_O = Target.the("Seleccionar grupo Sanguineo O").located(By.xpath("//ul[@id='select-options-8ee31642-80e3-58b9-1d22-3fcfcd24519c']//span[contains(text(),'O')]"));
    public static final Target HOBBIES = Target.the("Escribir Hobbies").located(By.xpath("//input[@id='5']"));
    public static final Target BOTON_NEXT = Target.the("Boton Next").located(By.xpath("//button[@class='btn waves-effect waves-light right']"));
    public static final Target REGION_SELECT = Target.the("Seleccionar Región").located(By.xpath("//div[@id='9_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target REGION_1 = Target.the("Seleccionar Región 1").located(By.xpath("//span[contains(text(),'Region-1')]"));
    public static final Target REGION_2 = Target.the("Seleccionar Región 2").located(By.xpath("//span[contains(text(),'Region-2')]"));
    public static final Target REGION_3 = Target.the("Seleccionar Región 3").located(By.xpath("//span[contains(text(),'Region-3')]"));
    public static final Target FTE_SELECT = Target.the("Seleccionar FTE").located(By.xpath("//div[@id='10_inputfileddiv']//input[@class='select-dropdown']')]"));
    public static final Target FTE_05 = Target.the("Seleccionar FTE 0.5").located(By.xpath("//span[contains(text(),'0.5')]"));
    public static final Target FTE_075 = Target.the("Seleccionar FTE 0.75").located(By.xpath("//span[contains(text(),'0.75')]"));
    public static final Target FTE_1 = Target.the("Seleccionar FTE 0.1").located(By.xpath("//ul[@id='select-options-ad52fc13-9ae7-e1a9-b4cc-f8bacb60aaa5']//span[contains(text(),'1')]"));
    public static final Target SELECT_TEMPORARY = Target.the("Seleccionar Temporary Department").located(By.xpath("//div[@id='11_inputfileddiv']"));
    public static final Target SELECT_TEMPORARY_1 = Target.the("Seleccionar Temporary Department 1").located(By.xpath("//span[contains(text(),'Sub unit-1')]"));
    public static final Target SELECT_TEMPORARY_2 = Target.the("Seleccionar Temporary Department 2").located(By.xpath("//span[contains(text(),'Sub unit-2')]"));
    public static final Target SELECT_TEMPORARY_3 = Target.the("Seleccionar Temporary Department 3").located(By.xpath("//span[contains(text(),'Sub unit-3')]"));
    public static final Target SELECT_TEMPORARY_4 = Target.the("Seleccionar Temporary Department 4").located(By.xpath("//span[contains(text(),'Sub unit-4')]"));
    public static final Target SAVE_BUTTON  = Target.the("Save button").located(By.xpath("//button[@class='btn waves-effect waves-light right']"));












}
