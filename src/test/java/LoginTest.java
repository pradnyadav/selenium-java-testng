import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod (groups = "Sanity")
    public void startup(){
        setUp();
        initPages(driver);
    }

    @AfterMethod (groups = "Sanity")
    public void closure() {
        tearDown();
    }

    @Test (groups = "Sanity", description = "To Verify URL")
    public void checkURL(){
        Assert.assertTrue(loginPage.isBrandingImage1Displayed(),"image 1 is not displayed");
        //Assert.assertTrue(loginPage.isBrandingImage2Displayed(),"image 2 is not displayed");
    }



    @Test (dataProvider = "loginCredentials", groups = "Sanity",description = "To validate login for Valid and invalid inputs")
    public void toValidateInputCredentials(String Scenario,String username, String password){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        if(Scenario.equals("4")){
            Assert.assertTrue(dashboardPage.getDashboardLogo(),"Login Successfull" );
        }
        else{
            Assert.assertTrue(commonUtils.isElementDisplayed(loginPage.getInvalidCredentialsError()),"Error Message not displayed");
        }

}

    @DataProvider(name = "loginCredentials")
    public Object[][] loginCredentials() {
        return new Object[][] {
                {"1","Admin", "admin234"},
                {"2","Pradnya", "admin123"},
                {"3","Pradnya", "fghjkl"},
                {"4","Admin", "admin123"}
        };
    }
}
