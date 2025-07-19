package Pages;

import Utilities.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    CommonUtils commonUtils;

    // Xpaths of the page
    private  By brandingImage = By.xpath("//img[@alt='company-branding']");
    private By brandingImage2 = By.xpath("//img[@alt='orangehrm-logo']");

    private By usernameInput = By.xpath( "//input[@name='username']");
    private By passwordInput = By.xpath("//input[@name='password']");
    private By loginButton =  By.xpath("//button[text()=' Login ']");
    private By invalidCredentialsError = By.xpath("//p[contains(normalize-space(.),\"Invalid credentials\")]");


    public LoginPage(WebDriver driver) {

        this.driver = driver;
        commonUtils = new CommonUtils(this.driver);

    }


    // Methods to perform actions


    // Method to check if Branding image 1 displayed or not?
        public boolean isBrandingImage1Displayed() {
        System.out.println("isBrandingImage1Displayed()");
            return commonUtils.isElementDisplayed(commonUtils.getElementViaExplicitWait(20, brandingImage));
        }

        // Method to check if Branding element displayed or not
        public boolean isBrandingImage2Displayed() {
            return commonUtils.isElementDisplayed(commonUtils.getElementViaExplicitWait(20, brandingImage2));
        }


        // Method to input usename
        public void enterUsername(String username) {
            commonUtils.getElementViaExplicitWait(20, usernameInput).sendKeys(username);
        }

        // Method to input Password
        public void enterPassword(String password) {
            commonUtils.getElementViaExplicitWait(20,passwordInput).sendKeys(password);
                    }
        //method to click login button

        public void clickLogin() {
            commonUtils.getElementViaExplicitWait(20,loginButton).click();
    }


    public WebElement getInvalidCredentialsError() {
        return commonUtils.getElementViaExplicitWait(20,invalidCredentialsError);
    }


}


