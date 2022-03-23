package com.imoving.UI.utils;

import com.imoving.UI.methods.Helper;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SauceLabDemo1 {
    public static void main(String[] args) throws MalformedURLException {



        String USERNAME = "oauth-imanbekob-d0a8c";
        String ACCESS_KEY = "1805e40f-411a-4879-a7c1-f00f487c5d55";

        String url ="https://oauth-imanbekob-d0a8c:1805e40f-411a-4879-a7c1-f00f487c5d55@ondemand.eu-central-1.saucelabs.com:443/wd/hub";


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.MOJAVE);
        capabilities.setCapability("browserName", BrowserType.SAFARI);
        capabilities.setCapability("browserVersion", "latest");

        WebDriver driver = new RemoteWebDriver(new URL(url), capabilities);
        driver.get("https://www.amazon.com/");
        WebElement searchInput = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchInput.sendKeys("Iphone" + Keys.ENTER);
        Helper.pause(5000);

        List<WebElement> brands = driver.findElements(By.id("brandsRefinements"));
        for (WebElement element : brands) {
            System.out.println(element.getText());
        }



    }
}
