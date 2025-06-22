package com.co.starter.userinterface.home;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BARRA_NAV = Target.the("Barra de navegacion").located(By.xpath("/a[@class='brand-logo' and @href='#/dashboard/1055']"));
    public static final Target POPUP_HOME = Target.the("Popup del home alerta informaticva").located(By.xpath("//*[name()='svg' and @id='Layer_1']"));
    public static final Target BOTON_CREAR_USUARIO = Target.the("Boton que abre modal para crear cliente").located(By.xpath("//*[@id=\"single-spa-application:react-dashboard\"]/div/div/div/div/div[2]/div[1]/panel-atom/div/div/div[8]/div/img"));
    public static final Target LINK_CLIENTES_MODAL = Target.the("Link que me lleva a la pagina de crear tercero").located(By.xpath("//a[@data-value='Clientes' and text()='Clientes']"));
}
