package com.co.starter.tasks.paginadeloginsiigo;

import com.co.starter.Utils.ExcelReader;
import com.co.starter.userinterface.SitioDeLoginSiigoPage.SitioDeLoginSiigo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.Map;

public class IngresarAlSitio implements Performable {



    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> credenciales = ExcelReader.leerCredenciales("src/test/resources/datos/credenciales.xlsx", "login");

        String usuario = credenciales.get("Usuario");
        String password = credenciales.get("Password");

        actor.attemptsTo(
            SendKeys.of(usuario).into(SitioDeLoginSiigo.EMAIL),
            SendKeys.of(password).into(SitioDeLoginSiigo.CONTRASENA),
            Click.on(SitioDeLoginSiigo.BTN_CONTINUAR)
        );
    }

    public static IngresarAlSitio delLoginDeSiigo() {
        return new IngresarAlSitio();
    }

    
}
