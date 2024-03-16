package com.front.pageObjects;

import com.front.runners.RunnerFlujosCrediviva;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CredivivaPageObject extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunnerFlujosCrediviva.class);
    //Objetos mapeados
    String txtBusquedaGoogle = "//form[@action='/search']//div[@class='RNNXgb']//div[@class='a4bIc']";
    String btnSeleccionarBusqueda = "//div[@role='main']//div[@id='search']//div[@class='BYM4Nd']//div[@class='eKjLze']//div[@aria-hidden='true']";

    public void digitarEnElBuscadorLaPalabraCrediviva(String textoBuscar) {
        try {
            find(By.xpath(txtBusquedaGoogle)).sendKeys(textoBuscar);
            find(By.xpath(txtBusquedaGoogle)).sendKeys(Keys.ENTER);
            waitFor(1).second();
        }catch (Exception e){
            LOGGER.error("Falló en el paso digitarEnElBuscadorLaPalabraCrediviva: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }

    public void seleccionarLaOpcionBuscada() {
        try {
            find(By.xpath(btnSeleccionarBusqueda)).click();
            waitFor(2).seconds();
        }catch (Exception e){
            LOGGER.error("Falló en el paso seleccionarLaOpcionBuscada: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }

    public void irOpcionDeBlogDeLaPagina() {
        try {

        }catch (Exception e){
            LOGGER.error("Falló en el paso irOpcionDeBlogDeLaPagina: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }

    public void validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla() {
        try {

        }catch (Exception e){
            LOGGER.error("Falló en el paso validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }
}
