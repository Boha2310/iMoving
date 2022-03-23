package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitchenRoom {
    public kitchenRoom(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement kitchenDiningChairsPicture;

    @FindBy (xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement kitchenDiningChairsAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/img")
    public WebElement kitchenDiningTablePicture;

    @FindBy (xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement kitchenDiningTableAddToInventoryButton;

    @FindBy (xpath = "/html/body/div/div/div/div[1]/div[3]/div[1]/button")
    public WebElement saveAndGoToNextFromKitchenRoom;

}
