package com.co.starter.stepdefinitions;

import com.co.starter.questions.TituloRegsitro;
import com.co.starter.tasks.formulario.LLenarFormularioDatosBasicos;
import com.co.starter.tasks.paginadeloginsiigo.AbrirPaginaDeLogin;
import com.co.starter.tasks.paginadeloginsiigo.IngresarAlSitio;
import com.co.starter.tasks.paginadeloginsiigo.IrAPaginaCrearClienteTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.starter.questions.TituloRegsitro.es;

public class CreateAPersonTypeCustomerStepDefinitions {
    
    @Dado("que el usuario esta en la pagina crear un tercero")
    public void queElUsuarioEstaEnLaPaginaCrearUnTercero() {
        // Go to the Siigo site
        OnStage.theActorInTheSpotlight().wasAbleTo(
                AbrirPaginaDeLogin.abrir(),
                IngresarAlSitio.delLoginDeSiigo(),
                IrAPaginaCrearClienteTask.deTercero());
    }

    @Cuando("el usuario completa el formulario con los datos del cliente y guarda")
    public void elUsuarioCompletaElFormularioConLosDatosDelClienteYGuarda() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                LLenarFormularioDatosBasicos.delCliente("8600125003", "202",
                        "Andre", "Francis",
                        "Andrfranc", "Manizales",
                                "cr2 # 00 - 00","57",
                        "3148507679", "textautomationacorrea@gmailcom",
                        "170006")
        );
    }

    @Entonces("debe ser redirigido a una pagina con un que coniene el nombre del cliente y estado activo")
    public void debeSerRedirigidoAUnaPaginaConUnQueConieneElNombreDelClienteYEstadoActivo() {
        WebDriver driver = ThucydidesWebDriverSupport.getDriver();

        // Espera hasta que la URL contenga '#exito'
        new WebDriverWait(driver, Duration.ofSeconds(80))
                .until(ExpectedConditions.urlContains("Customer"));

        String titulo = TituloRegsitro.es().answeredBy(OnStage.theActorInTheSpotlight());
        System.out.println("Título actual de la página: " + titulo);

    }

}
