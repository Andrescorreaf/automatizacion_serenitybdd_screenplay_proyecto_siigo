package com.co.starter.questions;

import com.co.starter.userinterface.SitioDeLoginSiigoPage.SitioDeLoginSiigo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TituloRegsitro implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return SitioDeLoginSiigo.CONTRASENA.resolveFor(actor).getText();
    }

    public static Question<String> es() {
        return new TituloRegsitro();
    }
}