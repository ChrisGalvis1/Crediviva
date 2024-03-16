package com.front.steps;

import com.front.pageObjects.CredivivaPageObject;
import com.front.runners.RunnerFlujosCrediviva;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CredivivaSteps extends CredivivaPageObject {

    CredivivaPageObject credivivaPageObject;
    private static final Logger LOGGER = LoggerFactory.getLogger(RunnerFlujosCrediviva.class);

    @Step
    public void ingresarPaginaDeGoogleParaRealizarLaBusqueda(String url) {
        try {
            credivivaPageObject.openAt(url);
        }catch (Exception e){
            LOGGER.error("Falló en el paso ingresarPaginaDeGoogleParaRealizarLaBusqueda: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }

    @Step
    public void digitarEnElBuscadorLaPalabraCrediviva(String textoBuscar) {
        credivivaPageObject.digitarEnElBuscadorLaPalabraCrediviva(textoBuscar);
    }

    @Step
    public void irOpcionDeBlogDeLaPagina() {
        credivivaPageObject.irOpcionDeBlogDeLaPagina();
    }

    @Step
    public void validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla() {
        credivivaPageObject.validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla();
    }
}
