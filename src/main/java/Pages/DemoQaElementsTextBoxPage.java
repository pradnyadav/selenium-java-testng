package Pages;

import Utilities.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQaElementsTextBoxPage {
    WebDriver driver;
    CommonUtils commonUtils;
    private By elementsTab = By.xpath("//h5[contains(normalize-space(.),\"Elements\")]//ancestor::div[@class=\"card mt-4 top-card\"]");
    private By advertisementCard = By.xpath("//div[@id =\"card\"]");
    private By adClose= By.xpath("//div[@id =\"dismiss-button\"]");
    private By textBoxTab = By.xpath("//span[@class=\"text\" and contains(normalize-space(.),\"Text Box\")]");
    private By fullName = By.xpath("//input[@id=\"userName\"]");
    private By email= By.xpath("//input[@id=\"userEmail\"]");
    private By currentAddress= By.xpath("//textarea[@id=\"currentAddress\"]");
    private By permanentAddress = By.xpath("//textarea[@id=\"permanentAddress\"]");
    private By submitButton = By.xpath("//button[@id=\"submit\"]");
    private By outputBox = By.xpath("//div[@id=\"output\"]");

    //Constructor
    public DemoQaElementsTextBoxPage(WebDriver driver){
        this.driver = driver;
        commonUtils=new CommonUtils(this.driver);

    }

    //Menthods
    public void navigateToElementTab(){
        commonUtils.getElementViaExplicitWait(50,elementsTab).click();
    }

    public void navigateToTextBox(){
        commonUtils.getElementViaExplicitWait(50,textBoxTab).click();
    }
    public void enterEmail(String emailInput){
        commonUtils.getElementViaExplicitWait(50,email).sendKeys(emailInput);
    }
    public void enterCurrentAddress(String currentAddressInput){
        commonUtils.getElementViaExplicitWait(50,currentAddress).sendKeys(currentAddressInput);
    }
    public void enterFullName(String fullNameInput){
        commonUtils.getElementViaExplicitWait(50,fullName).sendKeys(fullNameInput);
    }
    public void scrollToCurrentAddress(){
        commonUtils.scrollToElementVisible(commonUtils.getElementViaExplicitWait(50,currentAddress));
    }
    public void scrollToPermenentAddress(){
        commonUtils.scrollToElementVisible(commonUtils.getElementViaExplicitWait(50,permanentAddress));
    }
    public void enterPermanentAddress(String permanentAddressInput){

        commonUtils.getElementViaExplicitWait(50,permanentAddress).sendKeys(permanentAddressInput);
    }
    public void getEnteredEmail(String emailInput){
       commonUtils.getElementViaExplicitWait(20,email).sendKeys(emailInput);

    }
    public void handleAdd(){
        try{
            if(commonUtils.isElementDisplayed(commonUtils.getElementViaExplicitWait(5,advertisementCard))){
                commonUtils.getElementViaExplicitWait(10,adClose).click();
            }
        }catch (Exception e){

        }
    }
    public String getValueOfEnteredCurrentAddress(){
        String enteredCurrentAddress = commonUtils.getElementViaExplicitWait(20,currentAddress).getAttribute("value");
        return enteredCurrentAddress;
    }
    public String getValueOfEnteredPermanentAddress(){
       String enteredPermanentAddress = commonUtils.getElementViaExplicitWait(20,permanentAddress).getAttribute("value");
       return enteredPermanentAddress;
    }
    public void scrollToSubmitButton(){
        commonUtils.scrollToElementVisible(commonUtils.getElementViaExplicitWait(50,permanentAddress));
    }
    public void clickOnSubmitButton(){
        commonUtils.getElementViaExplicitWait(20, submitButton).click();
    }
    public String verifyOutputBox(){
        String outputValue = commonUtils.getElementViaExplicitWait(10,outputBox).getText();
        System.out.println(outputValue);
        return outputValue;

    }
}
