package com.co.starter.userinterface.home;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target POPUP_HOME = Target.the("Popup del home alerta informaticva").located(By.id("Layer_1"));
    public static final Target BOTON_CREAR_USUARIO = Target.the("Boton que abre modal para crear cliente").located(By.xpath("//siigo-button-atom[@data-id='header-create-button']"));
    public static final Target LINK_CLIENTES_MODAL = Target.the("Link que me lleva a la pagina de crear tercero").located(By.xpath("//a[@data-value='Clientes' and text()='Clientes']"));
}
