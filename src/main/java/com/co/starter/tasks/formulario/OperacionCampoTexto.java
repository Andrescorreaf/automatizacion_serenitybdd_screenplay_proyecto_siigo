package com.co.starter.tasks.formulario;

import com.co.starter.userinterface.formularioderegistro.FormularioDeRegsitroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperacionCampoTexto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        // Extraer el texto que contiene la instrucción
        String texto = Text.of(FormularioDeRegsitroPage.INPUT_CIUDAD_CLIENTE)
                .answeredBy(actor)
                .trim();

        // Extraer número y letra usando regex
        Pattern pattern = Pattern.compile("(Escriba|Write)\\s+(\\d+)\\s+(veces|times)\\s+(la letra|the letter)\\s+\"(\\w)\"", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto);

        int cantidad = 0;
        String letra = "";

        if (matcher.find()) {
            cantidad = Integer.parseInt(matcher.group(2));
            letra = matcher.group(5);
        } else {
            throw new RuntimeException("No se pudo interpretar el texto: " + texto);
        }

        // Construir la cadena repetida
        String respuesta = letra.repeat(cantidad);


        actor.attemptsTo(SendKeys.of(respuesta)
                .into(FormularioDeRegsitroPage.INPUT_NUM_TELE_CLIENTE));

    }
    public static OperacionCampoTexto repetir(){
        return instrumented(OperacionCampoTexto.class);
    }
}
