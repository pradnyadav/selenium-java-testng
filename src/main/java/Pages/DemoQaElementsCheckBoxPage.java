package Pages;

import Utilities.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQaElementsCheckBoxPage {
    WebDriver driver;
    CommonUtils commonUtils;
    private By homeToggleButton = By.xpath("//span[contains(normalize-space(.),\"Home\")]/button[@title =\"Toggle\"]");
    private By checkBoxTab= By.xpath("//span[@class=\"text\" and contains(normalize-space(.),\"Check Box\")]");
    private By homeCheckBoxUnchecked=By.xpath("//*[local-name()='svg' and @class=\"rct-icon rct-icon-uncheck\"]");
    private By homeCheckBoxChecked=By.xpath("//*[local-name()='svg' and @class=\"rct-icon rct-icon-check\"]");



    //Constructor
    public DemoQaElementsCheckBoxPage(WebDriver driver) {
        this.driver = driver;
        commonUtils = new CommonUtils(driver);
    }

    // Methods
    public void navigateToCheckBoxTab(){
        commonUtils.getElementViaExplicitWait(30,checkBoxTab).click();
    }
    public void expandHomeToggleButton(){
        commonUtils.getElementViaExplicitWait(30, homeToggleButton).click();
    }
    public void selectHomeCheckBox(){

        commonUtils.getElementViaExplicitWait(50,homeCheckBoxUnchecked).click();
    }

    public void scrollToHomeCheckBox(){
        commonUtils.scrollToElementVisible(commonUtils.getElementViaExplicitWait(30,homeCheckBoxUnchecked));
    }
    public boolean toVerifyHomeCBChecked(){
        if(commonUtils.getElementViaExplicitWait(20,homeCheckBoxChecked).isDisplayed()){
            System.out.println("Home checkbox is checked");
            return true;
        } else if (commonUtils.getElementViaExplicitWait(20,homeCheckBoxUnchecked).isDisplayed()) {
            System.out.println("Home CheckBox is not Checked");
            return false;
        }else{
            System.out.println("Home Checkbox is not visible");
            return false;
        }
    }


}
