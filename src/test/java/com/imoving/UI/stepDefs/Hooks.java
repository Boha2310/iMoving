package com.imoving.UI.stepDefs;

import com.imoving.UI.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Driver is started");

    }
    @After
    public void teatDown(Scenario scenario){
        if (scenario.isFailed()){
            try{
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png","screenshot");
            }
            catch (WebDriverException noSupportedScreenshot){
                System.err.println(noSupportedScreenshot.getMessage());
            }
        }
        Driver.closeDriver();
    }
}
