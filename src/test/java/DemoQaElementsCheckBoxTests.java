import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQaElementsCheckBoxTests extends BaseTest{
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
    public void toVerifyHomeCheckBoxStatus() throws InterruptedException {
        demoQaElementsCheckBoxPage.navigateToCheckBoxTab();
//        demoQaElementsCheckBoxPage.expandHomeToggleButton();
//        demoQaElementsCheckBoxPage.scrollToHomeCheckBox();
        demoQaElementsCheckBoxPage.selectHomeCheckBox();
        Assert.assertTrue(demoQaElementsCheckBoxPage.toVerifyHomeCBChecked(),"Check Box is not selected");
    }
}
