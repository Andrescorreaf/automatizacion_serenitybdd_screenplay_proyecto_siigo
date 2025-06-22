package com.co.starter.userinterface.formularioderegistro;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioDeRegsitroPage {

    public static final Target TITULO_CREAR_TERCER =  Target.the("Seleccionar titulo crear tercero").located(By.xpath("//*[@id=\"sticky\"]/div[1]/h2"));

    public static final Target SELECT_TIPO_CLIENTE =  Target.the("Selector tipo de cliente").located(By.xpath("//siigo-dropdownlist-web//i[contains(@class, 'mdc-select__dropdown-icon')]"));
    public static final Target OPCION_TIPO_CLIENTE = Target.the("Modal opciones de cliente:").located(By.xpath("//*[@class='siigo-components']/div/div/div[1]/div[1]/div[1]/siigo-dropdownlist-web//div/div/div[2]/ul/li[1]"));

    public static final Target SELECT_TIPO_IDENTIDAD =  Target.the("Selector tipo de identidad").located(By.xpath("xpath=//div[@class='siigo-components']/div/div/div/div/div[3]/siigo-identification-input-web"));
    public static final Target OPCION_TIPO_IDENTIDAD= Target.the("Modal opciones de indentificación: ").located(By.xpath("//siigo-textfield-web[@value='0']"));
    public static final Target INPUT_NUM_IDENTIDAD = Target.the("Input para ingresar número de documento").located(By.xpath("//*[@id=identification]/input"));

    public static final Target INPUT_CODE_SUCURSAL = Target.the("Input para ingresar codigo de la sucursal").located(By.xpath("//div[@id='s2d7bdaf-8e95-4d83-9318-600b7c7512e2']/div/div/div[2]/div/siigo-phone-web"));

    public static final Target INPUT_NOMBRE_CLIENTE = Target.the("Input para ingresar el nombre del cliente").located(By.xpath("//siigo-textfield-web//label/span[contains(text(), 'Nombre')]")); //label/span[contains(text(), 'Nombres')]/ancestor::siigo-textfield-web//input
    public static final Target INPUT_APELLIDO_CLIENTE = Target.the("Input para ingresar el apellido del lciente").located(By.xpath("//siigo-textfield-web//label/span[contains(text(), 'Apellidos')]"));
    public static final Target INPUT_NOMBRE_COMERCIAL_CLIENTE = Target.the("Input para ingresar el nombre comercial del lciente").located(By.xpath("//label[contains(text(), 'Nombre comercial')]/ancestor::div[contains(@class, 'mdc-text-field')]//input"));
    public static final Target INPUT_CIUDAD_CLIENTE = Target.the("Input para ingresar la ciudada del lciente").located(By.id("inputAutocompletecity"));
    public static final Target INPUT_DIRECCION_CLIENTE = Target.the("Input para ingresar la dirección del lciente").located(By.xpath("//label[contains(text(), 'Dirección')]/ancestor::div[contains(@class, 'mdc-text-field')]//input"));
    public static final Target INPUT_INDICATIVO_NUM_TELE_CLIENTE = Target.the("Input para ingresar la num indicativo telefono del cliente").located(By.xpath("//input[@name='Indicativo' and contains(@class, 'siigo-phone')]"));
    public static final Target INPUT_NUM_TELE_CLIENTE = Target.the("Input para ingresar la numero de telefono del cliente").located(By.xpath("//input[@name='# de Teléfono' and contains(@class, 'siigo-phone')]"));






}
