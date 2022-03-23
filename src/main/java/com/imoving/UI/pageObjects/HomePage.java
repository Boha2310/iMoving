package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="/html/body/div[2]/div/main/section[1]/figure/div/div/div[2]/div[1]/form/div[3]/button")
    public WebElement compareQuotesButton;

    @FindBy(xpath = "/html/body/div[2]/div/main/section[1]/figure/div/div/div[1]/ul/li[1]/a")
    public WebElement movingTab;

    @FindBy(xpath = "/html/body/div[2]/div/main/section[1]/figure/div/div/div[1]/ul/li[2]/a")
    public WebElement laborTab;

    @FindBy(id = "houseTypeSelectList")
    public WebElement whatAreYouMovingDropDownMenu;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/h2/span[1]")
    public WebElement whatAreYouMovingDropDownMenuText;

    @FindBy(xpath = "/html/body/div[2]/div/main/section[1]/figure/div/div/div[2]/div[1]/form/div[1]/div/button")
    public WebElement whatAreYouMovingDropDownMenuSelectedValue;

    @FindBy(id = "hp-nav-select-house")
    public WebElement houseMoveSizeSelect;



}
