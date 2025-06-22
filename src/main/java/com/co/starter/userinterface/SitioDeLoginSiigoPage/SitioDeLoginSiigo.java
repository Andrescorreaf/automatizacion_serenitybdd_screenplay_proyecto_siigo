package com.co.starter.userinterface.SitioDeLoginSiigoPage;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class SitioDeLoginSiigo {

    public static final Target EMAIL = Target.the("Input correo").located(By.xpath("//*[@id='siigoSignInName']"));
    public static final Target CONTRASENA = Target.the("Contraseña").located(By.xpath("//*[@id='siigoPassword']"));;
    public static final Target BTN_CONTINUAR = Target.the("Botón continuar").located(By.xpath("//*[@id='siigoNext']"));


}
