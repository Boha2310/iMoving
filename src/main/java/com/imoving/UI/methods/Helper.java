package com.imoving.UI.methods;

import com.imoving.UI.Log4jDemo;
import com.imoving.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {
    private static Logger logger = LogManager.getLogger(Helper.class);

    public static void click(WebElement element) {
        logger.info("I am trying to click " + element);
        try {
            waitElementToBeDisplayed(element);
            waitFoeElementToBeClickable(element);
            negativeToElement(element);
            element.click();
            logger.info("Element is clicked");
        } catch (ElementClickInterceptedException e) {
            logger.warn("Element is not clickable, but I clicked with JS click");
            jsClick(element);

        }

    }



    public static void waitElementToBeDisplayed(WebElement element) {
        logger.debug("Waiting dor element to be displayed " + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitFoeElementToBeClickable(WebElement element) {
        logger.info("Waiting foe element to be clickable");
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void sandKeys(WebElement element, Keys button){
        element.sendKeys(button);
    }

    public static void pause(Integer milliseconds) {
        logger.info("Pausing system for " + milliseconds);
        try {
            logger.debug("Trying to pause the system");
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            logger.error("can not pause the system");
            e.printStackTrace();
        }
    }

    public static String getTextValue(WebElement element) {
        logger.info("get text");
        waitElementToBeDisplayed(element);
        return element.getText();
    }

    public static void jsClick(WebElement element) {
        waitElementToBeDisplayed(element);
        waitFoeElementToBeClickable(element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);

    }

    public static void negativeToElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }

    public static void multiClick(WebElement element, int howManyTimes){
        int counter = howManyTimes;
        waitElementToBeDisplayed(element);
        waitFoeElementToBeClickable(element);
        while (counter>0){
            element.click();
            counter--;
        }

    }


}
