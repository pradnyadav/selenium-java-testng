import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQAElementsRadioButtonTests extends BaseTest {
    @BeforeMethod
    public void setup2(){
        setUp();
        initPages(driver);
        navigateToElementTab();
    }
    @AfterMethod
    public void closure(){
        tearDown();
    }
    @Test
    public void toVerifyYesRadioButtonOutput() throws InterruptedException {
        demoQAElementsRadioButtonPage.navigateToRadioButtonTab();
        demoQAElementsRadioButtonPage.clickOnYesButton();
        Assert.assertTrue(demoQAElementsRadioButtonPage.isYesDisplayedinSuccessMessage(),"You have not selected Yes Radio Button");

    }
    @Test
    public void toVerifyImpressiveRadioButtonOutput() throws InterruptedException {
        demoQAElementsRadioButtonPage.navigateToRadioButtonTab();
        demoQAElementsRadioButtonPage.clickOnImpressiveButton();
        Assert.assertTrue(demoQAElementsRadioButtonPage.isImpressiveDisplayedinSuccessMessage(),"You have not selected Yes Impressive Button");

    }

}
