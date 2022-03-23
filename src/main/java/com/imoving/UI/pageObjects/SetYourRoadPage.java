package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetYourRoadPage {
    public SetYourRoadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/h2")
    public WebElement setYourRoadText;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/input-auto-complete-address/span/input")
    public WebElement pickUpFormButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/input-auto-complete-address/span/input")
    public WebElement enterZipCodeField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[1]/div/div/button[2]")
    public WebElement flightOfStairsIncreaseButton;

    @FindBy(partialLinkText = "New Orleans")
    public WebElement streetName;

}
