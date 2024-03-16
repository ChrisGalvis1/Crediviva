package com.front.definitions;

import com.front.steps.CredivivaSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CredivivaDefinition {

    @Steps
    CredivivaSteps credivivaSteps;
    @Given("Ingresar a la pagina de Google para realizar la busqueda {string}")
    public void ingresar_a_la_pagina_de_google_para_realizar_la_busqueda(String URL) {
        credivivaSteps.ingresarPaginaDeGoogleParaRealizarLaBusqueda(URL);
    }
    @Given("Digitar en el buscado la palabra de Crediviva {string}")
    public void digitar_en_el_buscado_la_palabra_de_crediviva(String textoBuscar) {
        credivivaSteps.digitarEnElBuscadorLaPalabraCrediviva(textoBuscar);
    }
    @When("Ir a la opcion de Blog de la pagina")
    public void ir_a_la_opcion_de_blog_de_la_pagina() {
        credivivaSteps.irOpcionDeBlogDeLaPagina();
    }
    @Then("Validar que la palabra BLOG CREDIVIVA este visible en la pagina y tomar una captura de pantalla")
    public void validar_que_la_palabra_blog_crediviva_este_visible_en_la_pagina_y_tomar_una_captura_de_pantalla() {
        credivivaSteps.validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla();
    }
}
