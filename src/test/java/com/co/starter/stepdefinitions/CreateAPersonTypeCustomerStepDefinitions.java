package com.co.starter.stepdefinitions;

import com.co.starter.tasks.paginadeloginsiigo.AbrirPaginaDeLogin;
import com.co.starter.tasks.paginadeloginsiigo.IrAPaginaCrearClienteTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CreateAPersonTypeCustomerStepDefinitions {
    
    @Dado("que el usuario esta en la pagina crear un tercero")
    public void queElUsuarioEstaEnLaPaginaCrearUnTercero() {
        // Go to the Siigo site
        OnStage.theActorInTheSpotlight().wasAbleTo(
                AbrirPaginaDeLogin.abrir(),
                IrAPaginaCrearClienteTask.deTercero());
    }

    @Cuando("el usuario completa el formulario con los datos del cliente y guarda")
    public void elUsuarioCompletaElFormularioConLosDatosDelClienteYGuarda() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("debe ser redirigido a una pagina con un que coniene el nombre del cliente y estado activo")
    public void debeSerRedirigidoAUnaPaginaConUnQueConieneElNombreDelClienteYEstadoActivo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
