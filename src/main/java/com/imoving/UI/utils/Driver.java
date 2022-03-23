package com.imoving.UI.utils;

import com.imoving.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver(){
        //singleton pattern (класс в единственном экземпляре)
    }


    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox" :
                    driver = FireFoxWebDriver.loadFirefoxDriver();
                    break;
                case "Edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver != null)
            {
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
