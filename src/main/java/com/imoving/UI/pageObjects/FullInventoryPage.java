package com.imoving.UI.pageObjects;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullInventoryPage {

    public FullInventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/a")
    public WebElement gotItButtonBoxPopUp;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[2]/div/a")
    public WebElement iMovingCalculatingTxt;

    @FindBy(id= "nextInventoryTutorial")
    public WebElement nextButtonHereYouCanSeeAllRoomsHint;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[2]/div/p[1]")
    public WebElement nextButtonHereYouCanSeeAllRoomsHintText;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[3]/div/p[1]")
    public WebElement okButtonHereYouCanSeeAllRoomsHintText;

    @FindBy(id = "nextNextRoomTutorial")
    public WebElement nextButtonGereYouCanSeeInventoryItems;

    @FindBy(id = "closeTutorial2")
    public WebElement okPressThisButtonToSave;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[1]/div/p[1]")
    public WebElement hereYouCanSeeAllYourRoomsAndStartMovingText;


//public void clickGotItButtonInBoxPopUp(){
//   // Helper.click(gotItButtonBoxPopUp);
//}

    public void passThePopUp(){
        Helper.click(gotItButtonBoxPopUp);
        Helper.click(nextButtonHereYouCanSeeAllRoomsHint);
        Helper.click(nextButtonGereYouCanSeeInventoryItems);
        Helper.click(okPressThisButtonToSave);

    }






}
