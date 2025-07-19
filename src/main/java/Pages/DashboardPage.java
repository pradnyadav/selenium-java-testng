package Pages;

import Utilities.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.List;

public class DashboardPage {
    WebDriver driver;
    CommonUtils commonUtils;

    //Xpaths
    private By dashboard = By.xpath("//h6[text()='Dashboard']");
    private By dashboardLogo= By.xpath("//img[@alt=\"client brand banner\"]");
    private By timeAtWorkWidget = By.xpath("//div[contains(@class, 'orangehrm-dashboard-widget-name')]/p[contains(.,'Time at Work')]");
    private By myActionsWidget = By.xpath("//div[contains(@class, 'orangehrm-dashboard-widget-name')]/p[contains(.,'My Actions')]");
    private By quickLaunchWidget = By.xpath("//div[contains(@class, 'orangehrm-dashboard-widget-name')]/p[contains(.,'Quick Launch')]");
    private By menuItemList = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");


// Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        commonUtils= new CommonUtils(this.driver);
    }



    // methods

    /**
     * to return dashboard web element
     * @return
     */
    public WebElement getDashboard() {
        return commonUtils.getElementViaExplicitWait(20, dashboard);
    }
    public Boolean getDashboardLogo(){
       return commonUtils.getElementViaExplicitWait(20, dashboardLogo).isDisplayed();

    }

    public boolean isDashboardDisplayed() {
        return getDashboard().isDisplayed();
    }

    /**
     * to validate if tiles are displayed on the dashboard
     * @param x count of tiles to be validated
     */
    public void validateTilesOnDashboard(int x) {
        for (int i=1;i<=x;i++){
            By TempWidget = By.xpath("(//div[contains(@class, 'orangehrm-dashboard-widget-name')]/p)["+i+"]");
            Assert.assertTrue(driver.findElement(TempWidget).isDisplayed());
            System.out.println("Tile no. "+ i+" validated successfully!");

            }
    }
    /**
     * Validate Main Menu List
     */
    public List<WebElement> getMenuList () {
        return driver.findElements(menuItemList);
    }

}
