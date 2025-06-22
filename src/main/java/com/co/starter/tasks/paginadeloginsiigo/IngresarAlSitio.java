package com.co.starter.tasks.paginadeloginsiigo;

import com.co.starter.Utils.ExcelReader;
import com.co.starter.userinterface.SitioDeLoginSiigoPage.SitioDeLoginSiigo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarAlSitio implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> credenciales = ExcelReader.leerCredenciales("src/test/resources/datos/credenciales.xlsx", "login");

        String usuario = credenciales.get("usuario");
        String password = credenciales.get("password");


        actor.attemptsTo(
                WaitUntil.the(SitioDeLoginSiigo.EMAIL, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SitioDeLoginSiigo.EMAIL),
                Enter.theValue(usuario).into(SitioDeLoginSiigo.EMAIL),
                WaitUntil.the(SitioDeLoginSiigo.CONTRASENA, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SitioDeLoginSiigo.CONTRASENA),
                Enter.theValue(password).into(SitioDeLoginSiigo.CONTRASENA),
                Click.on(SitioDeLoginSiigo.BTN_CONTINUAR)
        );
    }

    public static IngresarAlSitio delLoginDeSiigo() {
        return new IngresarAlSitio();
    }

    
}
