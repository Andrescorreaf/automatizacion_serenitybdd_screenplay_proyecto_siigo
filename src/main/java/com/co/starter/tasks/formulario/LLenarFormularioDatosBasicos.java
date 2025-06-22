package com.co.starter.tasks.formulario;


import com.co.starter.userinterface.formularioderegistro.FormularioDeRegsitroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LLenarFormularioDatosBasicos implements Task {

    private final String numdocumento;
    private final String codesucursal;
    private final String nombrecliente;
    private final String apellidocliente;
    private final String nombrecomercialcliente;
    private final String ciudadcliente;
    private final String direccioncliente;
    private final String indicativonumerocliente;
    private final String numerocliente;
    private final String correo;
    private final String codepostal;

    public LLenarFormularioDatosBasicos(String numdocumento, String codesucursal, String nombrecliente, String apellidocliente, String nombrecomercialcliente, String ciudadcliente, String direccioncliente, String indicativonumerocliente, String numerocliente, String correo, String codepostal) {
        this.numdocumento = numdocumento;
        this.codesucursal = codesucursal;
        this.nombrecliente = nombrecliente;
        this.apellidocliente = apellidocliente;
        this.nombrecomercialcliente = nombrecomercialcliente;
        this.ciudadcliente = ciudadcliente;
        this.direccioncliente = direccioncliente;
        this.indicativonumerocliente = indicativonumerocliente;
        this.numerocliente = numerocliente;
        this.correo = correo;
        this.codepostal = codepostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(FormularioDeRegsitroPage.TITULO_CREAR_TERCER, isVisible()).forNoMoreThan(50).seconds(),
                Click.on(FormularioDeRegsitroPage.SELECT_TIPO_CLIENTE),
                Click.on(FormularioDeRegsitroPage.OPCION_TIPO_CLIENTE_PERSON),
                Click.on(FormularioDeRegsitroPage.SELECT_TIPO_IDENTIDAD),
                Click.on(FormularioDeRegsitroPage.OPCION_TIPO_IDENTIDAD_CEDULA),

                Click.on(FormularioDeRegsitroPage.INPUT_NUM_IDENTIDAD),
                Enter.theValue(numdocumento).into(FormularioDeRegsitroPage.INPUT_NUM_IDENTIDAD),

                Click.on(FormularioDeRegsitroPage.INPUT_CODE_SUCURSAL),
                Enter.theValue(numdocumento).into(FormularioDeRegsitroPage.INPUT_CODE_SUCURSAL),

                Click.on(FormularioDeRegsitroPage.INPUT_INDICATIVO_NUM_TELE_CLIENTE),
                Enter.theValue(indicativonumerocliente).into(FormularioDeRegsitroPage.INPUT_INDICATIVO_NUM_TELE_CLIENTE),

                Click.on(FormularioDeRegsitroPage.INPUT_NUM_TELE_CLIENTE),
                Enter.theValue(numerocliente).into(FormularioDeRegsitroPage.INPUT_NUM_TELE_CLIENTE),

                Enter.theValue(nombrecliente).into(FormularioDeRegsitroPage.INPUT_NOMBRE_CLIENTE),
                Click.on(FormularioDeRegsitroPage.INPUT_NOMBRE_CLIENTE),

                Enter.theValue(apellidocliente).into(FormularioDeRegsitroPage.INPUT_APELLIDO_CLIENTE),
                Click.on(FormularioDeRegsitroPage.INPUT_APELLIDO_CLIENTE),

                Enter.theValue(nombrecomercialcliente).into(FormularioDeRegsitroPage.INPUT_NOMBRE_COMERCIAL_CLIENTE),
                Click.on(FormularioDeRegsitroPage.INPUT_NOMBRE_COMERCIAL_CLIENTE),

                Enter.theValue(ciudadcliente).into(FormularioDeRegsitroPage.INPUT_CIUDAD_CLIENTE),
                Click.on(FormularioDeRegsitroPage.INPUT_CIUDAD_CLIENTE),

                Enter.theValue(direccioncliente).into(FormularioDeRegsitroPage.INPUT_DIRECCION_CLIENTE),
                Click.on(FormularioDeRegsitroPage.INPUT_DIRECCION_CLIENTE),

                Enter.theValue(nombrecomercialcliente).into(FormularioDeRegsitroPage.INPUT_FACT_NOMBRE_CONTACTO),
                Click.on(FormularioDeRegsitroPage.INPUT_FACT_NOMBRE_CONTACTO),

                Enter.theValue(apellidocliente).into(FormularioDeRegsitroPage.INPUT_FACT_APELLIDO_CONTACTO),
                Click.on(FormularioDeRegsitroPage.INPUT_FACT_APELLIDO_CONTACTO),

                Click.on(FormularioDeRegsitroPage.INPUT_FACT_CORREO_CONTACTO),
                Enter.theValue(correo).into(FormularioDeRegsitroPage.INPUT_FACT_CORREO_CONTACTO),

                Click.on(FormularioDeRegsitroPage.SELEC_FACT_FACT_TIPO),
                Click.on(FormularioDeRegsitroPage.OPTION_FACT_FACT_TIPO),

                Click.on(FormularioDeRegsitroPage.INPUT_FACT_INDICA_CONTACTO),
                Enter.theValue(indicativonumerocliente).into(FormularioDeRegsitroPage.INPUT_FACT_INDICA_CONTACTO),

                Click.on(FormularioDeRegsitroPage.INPUT_FACT_NUME_CONTACTO),
                Enter.theValue(numerocliente).into(FormularioDeRegsitroPage.INPUT_FACT_NUME_CONTACTO),

                Click.on(FormularioDeRegsitroPage.INPUT_FACT_CODIGO_POSTAL),
                Enter.theValue(codepostal).into(FormularioDeRegsitroPage.INPUT_FACT_CODIGO_POSTAL),

                Click.on(FormularioDeRegsitroPage.BOTON_GUARDAR)


        );



    }
    public static LLenarFormularioDatosBasicos delCliente(String numdocumento, String codesucursal, String nombrecliente, String apellidocliente, String nombrecomercialcliente, String ciudadcliente, String direccioncliente, String indicativonumerocliente, String numerocliente, String correo, String codepostal){
        return Tasks.instrumented(LLenarFormularioDatosBasicos.class,
                numdocumento, codesucursal,
                nombrecliente, apellidocliente,
                nombrecomercialcliente,ciudadcliente,
                direccioncliente, indicativonumerocliente, numerocliente, correo, codepostal );
    }
}
