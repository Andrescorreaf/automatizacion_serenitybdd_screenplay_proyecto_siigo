package com.co.starter.userinterface.SitioDeLoginSiigoPage;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class SitioDeLoginSiigo {

    public static final Target EMAIL = Target.the("Input correo ").located(By.id("siigoSignInName"));
    public static final Target CONTRASENA = Target.the("Contraseña").located(By.id("siigoPassword"));
    public static final Target BTN_CONTINUAR= Target.the("Botón continuar").located(By.id("siigoNext"));

}
