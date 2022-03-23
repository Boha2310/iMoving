package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoxCalculator {
    public BoxCalculator(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/a[4]")
    public WebElement boxCalculatorAddAndContinueButton;
}
