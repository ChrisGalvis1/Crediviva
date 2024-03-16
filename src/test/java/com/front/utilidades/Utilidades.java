package com.front.utilidades;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Utilidades extends PageObject {

    public void bordearElemento(WebElementFacade webLocalizador) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed red'", webLocalizador);
    }

    public void posicionarElemento(WebElementFacade strWebElement) {
        Actions actions=new Actions(getDriver());
        actions.moveToElement(strWebElement).perform();
    }
}
