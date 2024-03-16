package com.front.utilidades;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Utilidades extends PageObject {

    public void bordearElemento(WebElementFacade webLocalizador) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed red'", webLocalizador);
    }

    public void posicionarElemento(WebElementFacade strWebElement) {
        Actions actions=new Actions(getDriver());
        actions.moveToElement(strWebElement).perform();
    }

    public void takeScreenShot (WebDriver driver, String screenShotName){
        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Serenity.recordReportData().withTitle("ScreenShots").andContents(screenShotName);
        screenShotFile.renameTo(new File("target/site/screenShots_passed", screenShotName));
    }
}