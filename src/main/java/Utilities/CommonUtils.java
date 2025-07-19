package Utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CommonUtils {

    WebDriver driver;

    public CommonUtils(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getElementViaExplicitWait(int timeInSec, By byLocator ) {
        // implicit wait set to zero
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);

        // Create WebDriverWait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
//        System.out.println(byLocator.toString() + " - element found!");

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        return element;
    }

    public boolean isElementDisplayed(WebElement webElement){
        try {
            return webElement.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public HashMap<String, String> readJsonToMap(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, String> data = null;

        try {
            data = mapper.readValue(new File(filePath), HashMap.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void scrollToElementVisible(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownByPixels(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down 600 pixels
        js.executeScript("window.scrollBy(0, 600);");

        System.out.println("Scrolled down by 600 pixels");
    }

}
