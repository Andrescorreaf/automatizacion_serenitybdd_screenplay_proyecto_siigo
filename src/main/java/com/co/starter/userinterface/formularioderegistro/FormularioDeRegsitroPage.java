package com.co.starter.userinterface.formularioderegistro;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class FormularioDeRegsitroPage {

    public static final Target TITULO_CREAR_TERCER =  Target.the("Seleccionar titulo crear tercero").located(By.xpath("//*[@id=\"sticky\"]/div[1]/h2"));

    // Select tipo client Es persona
    public static final Target SELECT_TIPO_CLIENTE = Target.the("dropdown de tipo de cliente")
            .located(ByShadow.cssSelector(
                    ".card > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(1) > siigo-dropdownlist-web",
                    "div > div > div.mdc-select__anchor.mdc-ripple-upgraded"
            ));

    public static final Target OPCION_TIPO_CLIENTE_PERSON =  Target.the("dropdown de tipo de cliente")
            .located(ByShadow.cssSelector(
                    ".card > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(1) > siigo-dropdownlist-web",
                    "div > div > div.mdc-select__menu.mdc-menu.mdc-menu-surface.mdc-menu-surface--open.mdc-menu-surface--is-open-below > ul > li.mdc-list-item.mdc-list-item--selected > span"
            ));


    // Select tipo de documento "Cedual"

    public static final Target SELECT_TIPO_IDENTIDAD =  Target.the("Selector tipo de identidad")
            .located(ByShadow.cssSelector(
                    ".card > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(2) > siigo-dropdownlist-web",
                    "div > div > div.mdc-select__anchor.mdc-ripple-upgraded"));
    public static final Target OPCION_TIPO_IDENTIDAD_CEDULA= Target.the("Modal opciones de indentificación: ").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(2) > siigo-dropdownlist-web",
            "div > div > div.mdc-select__menu.mdc-menu.mdc-menu-surface.mdc-menu-surface--open.mdc-menu-surface--is-open-below > ul > li.mdc-list-item.mdc-list-item--selected"));

    public static final Target INPUT_NUM_IDENTIDAD = Target.the("Input para ingresar número de documento").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(3) > siigo-identification-input-web",
            "#identification > input"));


    public static final Target INPUT_CODE_SUCURSAL = Target.the("Input para ingresar codigo de la sucursal").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(5) > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_NOMBRE_CLIENTE = Target.the("Input para ingresar el nombre del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(1) > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_APELLIDO_CLIENTE = Target.the("Input para ingresar el apellido del lciente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(2) > siigo-textfield-web",
            ".mdc-text-field__input"));
    public static final Target INPUT_NOMBRE_COMERCIAL_CLIENTE = Target.the("Input para ingresar el nombre comercial del lciente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(4) > siigo-textfield-web",
            ".mdc-text-field__input"));
    public static final Target INPUT_CIUDAD_CLIENTE = Target.the("Input para ingresar la ciudada del lciente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(5) > siigo-autocomplete-web",
            "#inputAutocompletecity"));

    public static final Target INPUT_DIRECCION_CLIENTE = Target.the("Input para ingresar la dirección del lciente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(1) > div.column.is-7 > div.field.ng-star-inserted > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_INDICATIVO_NUM_TELE_CLIENTE = Target.the("Input para ingresar la num indicativo telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(3) > div > siigo-phone-web",
            "spanIndicative0"));

    public static final Target INPUT_NUM_TELE_CLIENTE = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div:nth-child(3) > div > siigo-phone-web",
            "#spanNumber0"));

    public static final Target INPUT_FACT_NOMBRE_CONTACTO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div:nth-child(1) > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_FACT_APELLIDO_CONTACTO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div:nth-child(2) > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_FACT_CORREO_CONTACTO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div:nth-child(3) > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target SELEC_FACT_FACT_TIPO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card> div > div > div > div.column.is-5 > div:nth-child(4) > siigo-dropdownlist-web",
            "div > div > div.mdc-select__anchor.mdc-ripple-upgraded"));
    public static final Target OPTION_FACT_FACT_TIPO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div:nth-child(4) > siigo-dropdownlist-web",
            "div > div > div.mdc-select__menu.mdc-menu.mdc-menu-surface.mdc-menu-surface--open.mdc-menu-surface--is-open-below > ul > li:nth-child(2) > span"));

    public static final Target INPUT_FACT_INDICA_CONTACTO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div.columns.phone > div.column.is-5 > div > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_FACT_NUME_CONTACTO = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div.columns.phone > div.column.is-7 > div > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target INPUT_FACT_CODIGO_POSTAL = Target.the("Input para ingresar la numero de telefono del cliente").located(ByShadow.cssSelector(
            ".card > div > div > div > div.column.is-5 > div:nth-child(6) > siigo-textfield-web",
            ".mdc-text-field__input"));

    public static final Target BOTON_GUARDAR = Target.the("Boton guardar tercer").located(By.xpath("//*[@id=\"sticky\"]/div[2]/button[2]"));











}
