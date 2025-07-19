import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQaElementsTextBoxPageTests extends BaseTest{
    @BeforeMethod
    public void setup1(){
        setUp();
        initPages(driver);
        navigateToElementTab();
    }

//    @AfterMethod
    public void closure() {
        tearDown();
    }

//    @Test
//    public void toValidateInputValueAtEmailTextBox(){
//        demoQaElements.handleAdd();
//        demoQaElements.navigateToElementTab();
//        demoQaElements.handleAdd();
//        demoQaElements.navigateToTextBox();
//        demoQaElements.enterEmail(testData.get("emailInput"));
//        demoQaElements.getEnteredEmail(testData.get("emailInput"));
//        Assert.assertTrue(demoQaElements.getEnteredEmail(testData.get("emailInput")).matches(testData.get("emailRegex")),"Email Format doesnot match");
//    }
    @Test
    public void toSubmitInformation(){
        demoQaElementsTextBoxPage.navigateToTextBox();
        demoQaElementsTextBoxPage.enterFullName(testData.get("fullNameInput"));
        demoQaElementsTextBoxPage.getEnteredEmail(testData.get("emailInput"));
        demoQaElementsTextBoxPage.scrollToCurrentAddress();
        demoQaElementsTextBoxPage.enterCurrentAddress(testData.get("currentAddressInput"));
        demoQaElementsTextBoxPage.scrollToPermenentAddress();
        demoQaElementsTextBoxPage.enterPermanentAddress(testData.get("permanentAddressInput"));
        demoQaElementsTextBoxPage.clickOnSubmitButton();
        demoQaElementsTextBoxPage.verifyOutputBox();


    }


}
