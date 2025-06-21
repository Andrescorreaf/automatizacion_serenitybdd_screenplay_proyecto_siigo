package com.co.starter.tasks.paginadeloginsiigo;

import com.co.starter.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAPaginaCrearClienteTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.POPUP_HOME, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.POPUP_HOME),
                Click.on(HomePage.BOTON_CREAR_USUARIO),
                WaitUntil.the(HomePage.LINK_CLIENTES_MODAL, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.LINK_CLIENTES_MODAL)
                );

    }

    public static IrAPaginaCrearClienteTask deTercero() {
        return instrumented(IrAPaginaCrearClienteTask.class);
    }
}
