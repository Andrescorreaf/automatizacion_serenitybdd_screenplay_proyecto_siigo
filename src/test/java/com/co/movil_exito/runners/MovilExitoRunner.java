package com.co.movil_exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recargas/", // Ruta de las características (features)
        glue = "com.co.movil_exito.stepdefinitions", // Paquete donde están los step definitions
        snippets = CucumberOptions.SnippetType.CAMELCASE, // Define el formato de los métodos generados automáticamente cuando Cucumber detecta un paso sin definición.
        plugin = "pretty" // Opcional: mejora la salida en consola, pretty hace que los pasos del escenario se vean bien formateados y legibles.
        //tags = "@Test" // Permite filtrar los escenarios que quieres ejecutar según etiquetas (tags) en tus features.

)
public class MovilExitoRunner {

}
