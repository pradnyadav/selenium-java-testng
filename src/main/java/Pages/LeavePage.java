package Pages;

import Utilities.CommonUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class LeavePage {
    WebDriver driver;
    CommonUtils commonUtils;

    private By leaveButton= By.xpath("//span[contains(normalize-space(.),\"Leave\") and @class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]");
    //Topbar
    //Apply Tab
    private By applyButton = By.xpath("//a[@class=\"oxd-topbar-body-nav-tab-item\" and contains(normalize-space(.),\"Apply\")]");
    private By massage = By.xpath("//p[contains(normalize-space(.),\"No Leave Types with Leave Balance\")]");
    private By myLeaveButton = By.xpath("//a[contains(normalize-space(.),\"My Leave\")]");
   // My Leave List
    private By fromDateInputBox = By.xpath("(//label[@class=\"oxd-label\" and contains(normalize-space(.),\"From Date\")]//following::i)[1]");
    //Date picker dropdown
    private By month = By.xpath("//div[@class=\"oxd-calendar-selector-month-selected\"]");
    private By year = By.xpath("//div[@class=\"oxd-calendar-selector-year-selected\"]");
    private By date = By.xpath("//div[@class=\"oxd-calendar-date\" and text()=\"20\"]");
    private By calenderRightNavigator = By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]");
    private By calenderLeftNavigator = By.xpath("//button[@class=\"oxd-icon-button\"]/i[@class=\"oxd-icon bi-chevron-left\"]");
    private By todayButton = By.xpath("//div[@class=\"oxd-date-input-link --today\"]");
    private By clearButton = By.xpath("//div[@class=\"oxd-date-input-link --clear\"]");
    private By closeButton = By.xpath("//div[@class=\"oxd-date-input-link --close\"]");
    //To Date
    private By toDateInputBox= By.xpath("//div/label[contains(normalize-space(.),\"From Date\")]//following::input[@class=\"oxd-input oxd-input--active\"][2]");
    // Show leave with status section
    private By showLeaveWithStatusButton = By.xpath("//label[contains(normalize-space(.),\"Show Leave with Status\")]//following::div[@class=\"oxd-select-text oxd-select-text--active\"][1]");
    private By rejectedButton = By.xpath("//span[contains(normalize-space(.),\"Rejected\")]/i");
    private By takenButton =By.xpath("//span[contains(normalize-space(.),\"Taken\")]/i");
    private By cancelledButton = By.xpath("//span[contains(normalize-space(.),\"Cancelled\")]/i");
    //LeaveType
    private By leaveType = By.xpath("//label[contains(normalize-space(.),\"Show Leave with Status\")]//following::div[@class=\"oxd-select-text oxd-select-text--active\"][2]");

    // Entitlements Button Setion
    private By entitlementButton = By.xpath("//span[contains(text(),\"Entitlements \")]");
    private By addEntitlements = By.xpath("//a[@role=\"menuitem\" and contains(normalize-space(.),\"Add Entitlements\")]");
    private By employeeEntitlements = By.xpath("//a[@role=\"menuitem\" and contains(normalize-space(.),\"Employee  Entitlements\")]");
    private By myEntitlemnts = By.xpath("//a[@role=\"menuitem\" and contains(normalize-space(.),\"My Entitlements\")]");

    //Constructor
    public LeavePage(WebDriver driver){
        this.driver = driver;
        commonUtils= new CommonUtils(this.driver);

    }
    // Methods
    public void navigateToLeaveSection(){
        commonUtils.getElementViaExplicitWait(20,leaveButton).click();
    }

    public void navigateToApplyTab(){
        commonUtils.getElementViaExplicitWait(10,applyButton).click();

    }
    public boolean applyTabMassage(){
        String actualMassage = commonUtils.getElementViaExplicitWait(10,massage).getText();
        Assert.assertEquals(actualMassage,"No Leave Types with Leave Balance","Message Does not match");
        return true;
    }
    public void navigateToMyLeave(){
        commonUtils.getElementViaExplicitWait(10,myLeaveButton).click();
    }
    public String enterTodaysdateAtToDate() throws InterruptedException {
        commonUtils.getElementViaExplicitWait(30,fromDateInputBox).click();
        commonUtils.getElementViaExplicitWait(30,todayButton).click();
        Thread.sleep(5000);
        String enteredDate= commonUtils.getElementViaExplicitWait(30,fromDateInputBox).getText();
        System.out.println(enteredDate);

        String enteredDate2= commonUtils.getElementViaExplicitWait(30,fromDateInputBox).getAttribute("placeholder");
        System.out.println(enteredDate2);
        String enteredDate3= commonUtils.getElementViaExplicitWait(30,fromDateInputBox).getDomProperty("placeholder");
        System.out.println(enteredDate3);
        return enteredDate;
    }
    public String getTodaysDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM"); // Change format if needed
        String expectedDate = LocalDate.now().format(formatter);
        System.out.println(expectedDate);
        return expectedDate;
    }

    public void inputDateInFromDateBox(){
        commonUtils.getElementViaExplicitWait(30,fromDateInputBox).click();
        String clickmonth = commonUtils.getElementViaExplicitWait(20,month).getText();
        System.out.println(clickmonth);


    }











}
