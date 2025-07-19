package Pages;

import Utilities.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAElementsRadioButtonPage {
    WebDriver driver;
    CommonUtils commonUtils;

    private By yesButton = By.xpath("//label[@for=\"yesRadio\"]");
    private By radioButtonTab = By.xpath("//span[@class=\"text\" and contains(normalize-space(.),\"Radio Button\")]");
    private By successMessage= By.xpath("//span[@class=\"text-success\"]//parent::p[contains(normalize-space(.),\"You have selected \")]");
    private By impressiveButton = By.xpath("//label[@for=\"impressiveRadio\"]");
    // Constructor
    public DemoQAElementsRadioButtonPage(WebDriver driver){
        this.driver= driver;
        commonUtils = new CommonUtils(driver);

    }

    public void navigateToRadioButtonTab(){
        commonUtils.getElementViaExplicitWait(10, radioButtonTab).click();
    }
    public void clickOnYesButton() {
        commonUtils.getElementViaExplicitWait(20, yesButton).click();

    }

    public boolean isYesDisplayedinSuccessMessage(){

        return commonUtils.getElementViaExplicitWait(10,successMessage).getText().contains("Yes");
    }

    public void clickOnImpressiveButton() {
        commonUtils.getElementViaExplicitWait(20, impressiveButton).click();

    }

    public boolean isImpressiveDisplayedinSuccessMessage(){
        return commonUtils.getElementViaExplicitWait(10,impressiveButton).getText().contains("Impressive");

    }

}
