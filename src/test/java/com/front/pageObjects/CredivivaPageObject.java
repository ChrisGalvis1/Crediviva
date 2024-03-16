package com.front.pageObjects;

import com.front.runners.RunnerFlujosCrediviva;
import com.front.utilidades.Utilidades;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;

public class CredivivaPageObject extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunnerFlujosCrediviva.class);

    Utilidades utilidades;
    String dateTime = utilidades.getCurrentDateTime();

    //Objetos mapeados
    String txtBusquedaGoogle = "//form[@action='/search']//div[@class='RNNXgb']//div[@class='a4bIc']//textarea";
    String btnSeleccionarBusqueda = "//div[@role='main']//div[@id='search']//div[@class='BYM4Nd']//div[@class='eKjLze']//div[@aria-hidden='true']";
    String btnBlogCrediviva = "//div[@id='page']//div[@class='elementor elementor-1499 elementor-location-header']//div[@class='elementor-container elementor-column-gap-no']//div[@data-id='76fb61c2']//div[@data-element_type='widget']//div[@id='ekit-megamenu-menu_2023']//ul[@id='menu-menu_2023']//li[@id='menu-item-2009']//a[text()='Blog']";
    String lblBlogCrediviva = "//div[@id='content']//div[@id='primary']//section[@data-id='54856cde']//div[@class='elementor-widget-wrap elementor-element-populated']//div[@data-id='84465bf']//div[@class='elementor-widget-container']";


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
            utilidades.bordearElemento(find(By.xpath(btnBlogCrediviva)));
            find(By.xpath(btnBlogCrediviva)).click();
        }catch (Exception e){
            LOGGER.error("Falló en el paso irOpcionDeBlogDeLaPagina: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }

    public void validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla() {
        try {
            utilidades.bordearElemento(find(By.xpath(lblBlogCrediviva)));
            Assert.assertTrue(find(By.xpath(lblBlogCrediviva)).isDisplayed());
            waitFor(1).second();
            utilidades.takeScreenShot(getDriver(), "screeShot_BlogCrediviva__"+dateTime+"__.png");
        }catch (Exception e){
            LOGGER.error("Falló en el paso validarQueLaPalabraBlogCredivivaEsteVisibileEnLaPaginaTomarUnaCapturaDePantalla: " + e.getMessage());
            Assert.assertTrue(false);
        }
    }
}
