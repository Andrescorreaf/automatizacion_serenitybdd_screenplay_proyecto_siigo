package com.co.starter.tasks.paginadeloginsiigo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.starter.transversal.PagDeLoginSiigo;
import net.serenitybdd.screenplay.Performable;

public class AbrirPaginaDeLogin implements Performable {


    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(">>>>>< Intentando abiri la pagina");
        actor.attemptsTo(Open.browserOn().the(PagDeLoginSiigo.class));
    }

    public static AbrirPaginaDeLogin abrir() {
        return instrumented(AbrirPaginaDeLogin.class);
    }
   
}
