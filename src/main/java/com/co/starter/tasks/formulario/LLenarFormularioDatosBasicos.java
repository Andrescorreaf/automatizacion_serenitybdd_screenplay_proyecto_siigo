package com.co.starter.tasks.formulario;


import com.co.starter.interaction.SelectFromSiigoDropdown;
import com.co.starter.userinterface.SitioDeLoginSiigoPage.SitioDeLoginSiigo;
import com.co.starter.userinterface.formularioderegistro.FormularioDeRegsitroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LLenarFormularioDatosBasicos implements Task {


    private final String tipocliente;
    private final String tipodocumento;
    private final String numdocumento;
    private final String codesucursal;
    private final String nombrecliente;
    private final String apellidocliente;
    private final String nombrecomercialcliente;
    private final String ciudadcliente;
    private final String direccioncliente;
    private final String indicativonumerocliente;
    private final String numerocliente;

    public LLenarFormularioDatosBasicos(String tipocliente, String tipodocumento, String numdocumento, String codesucursal, String nombrecliente, String apellidocliente, String nombrecomercialcliente, String ciudadcliente, String direccioncliente, String indicativonumerocliente, String numerocliente) {
        this.tipocliente = tipocliente;
        this.tipodocumento = tipodocumento;
        this.numdocumento = numdocumento;
        this.codesucursal = codesucursal;
        this.nombrecliente = nombrecliente;
        this.apellidocliente = apellidocliente;
        this.nombrecomercialcliente = nombrecomercialcliente;
        this.ciudadcliente = ciudadcliente;
        this.direccioncliente = direccioncliente;
        this.indicativonumerocliente = indicativonumerocliente;
        this.numerocliente = numerocliente;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target DROPDOWN_ANCHOR = Target.the("dropdown de tipo de cliente")
                .located(ByShadow.cssSelector(
                        "div#s2d7bdaf-8e95-4d83-9318-600b7c7512e2 > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(1) > siigo-dropdownlist-web",
                        "div > div > div.mdc-select__anchor.mdc-ripple-upgraded"
                ));
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(
                        Target.the("componente dropdown")
                                .located(By.cssSelector("siigo-dropdownlist-web")),
                        WebElementStateMatchers.isPresent()
                ).forNoMoreThan(30).seconds(),

                MoveMouse.to(FormularioDeRegsitroPage.SELECT_TIPO_CLIENTE).andThen(Actions::click));

                //Click.on(ByShadow.cssSelector(String.valueOf(FormularioDeRegsitroPage.SELECT_TIPO_CLIENTE), "siigo-dropdownlist-web"))

        /*
        actor.attemptsTo(
                WaitUntil.the(FormularioDeRegsitroPage.TITULO_CREAR_TERCER, isVisible()).forNoMoreThan(50).seconds(),

                /*

                // Espera y haz clic en el ancla del dropdown
                WaitUntil.the(ByShadow.cssSelector("#sae4ae54-f96f-456b-97cd-46ee4de16ff0", "siigo-dropdownlist-web"), isVisible())
                        .forNoMoreThan(30).seconds(),

                Click.on(ByShadow.cssSelector("#sae4ae54-f96f-456b-97cd-46ee4de16ff0", "siigo-dropdownlist-web")),

                // Espera y selecciona la opción "Empresa"
                WaitUntil.the(ByShadow.cssSelector("li span.mdc-list-item__text", "siigo-dropdownlist-web"), isVisible())
                        .forNoMoreThan(30).seconds(),

                Click.on(ByShadow.cssSelector("li:nth-child(2)", "siigo-dropdownlist-web")) // Empresa


        ); */

                //ClickOnShadowButton.on("siigo-dropdownlist-web", ".mdc-select__anchor"));
                // WaitUntil.the(FormularioDeRegsitroPage.SELECT_TIPO_CLIENTE, isVisible()).forNoMoreThan(30).seconds(),
                // el botón interno
                /*WaitUntil.the(FormularioDeRegsitroPage.SELECT_TIPO_CLIENTE, isVisible()).forNoMoreThan(30).seconds(),*//*
                Click.on(FormularioDeRegsitroPage.SELECT_TIPO_CLIENTE),
                WaitUntil.the(FormularioDeRegsitroPage.OPCION_TIPO_CLIENTE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(FormularioDeRegsitroPage.OPCION_TIPO_CLIENTE),
                Click.on(FormularioDeRegsitroPage.SELECT_TIPO_IDENTIDAD),
                WaitUntil.the(FormularioDeRegsitroPage.OPCION_TIPO_IDENTIDAD, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(numdocumento).into(FormularioDeRegsitroPage.INPUT_NUM_IDENTIDAD),
                Enter.theValue(codesucursal).into(FormularioDeRegsitroPage.INPUT_CODE_SUCURSAL),
                Enter.theValue((nombrecliente)).into(FormularioDeRegsitroPage.INPUT_NOMBRE_CLIENTE),
                Enter.theValue((apellidocliente)).into(FormularioDeRegsitroPage.INPUT_APELLIDO_CLIENTE),
                Enter.theValue((nombrecomercialcliente)).into(FormularioDeRegsitroPage.INPUT_NOMBRE_COMERCIAL_CLIENTE),
                Enter.theValue((ciudadcliente)).into(FormularioDeRegsitroPage.INPUT_CIUDAD_CLIENTE),
                Enter.theValue((direccioncliente)).into(FormularioDeRegsitroPage.INPUT_DIRECCION_CLIENTE),
                Enter.theValue((indicativonumerocliente)).into(FormularioDeRegsitroPage.INPUT_INDICATIVO_NUM_TELE_CLIENTE),
                Enter.theValue((numerocliente)).into(FormularioDeRegsitroPage.INPUT_NUM_TELE_CLIENTE));*/


    }
    public static LLenarFormularioDatosBasicos delCliente(String tipocliente, String tipodocumento, String numdocumento, String codesucursal, String nombrecliente, String apellidocliente, String nombrecomercialcliente, String ciudadcliente, String direccioncliente, String indicativonumerocliente, String numerocliente){
        return Tasks.instrumented(LLenarFormularioDatosBasicos.class,
                tipocliente, tipodocumento,
                numdocumento, codesucursal,
                nombrecliente, apellidocliente,
                nombrecomercialcliente,ciudadcliente,
                direccioncliente, indicativonumerocliente, numerocliente );
    }
}
