import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeaveTests extends BaseTest {
    @BeforeMethod
    public void setup1() throws InterruptedException {
        setUp();
        initPages(driver);
        login("Admin","admin123");
        leavePage.navigateToLeaveSection();
    }

    @AfterMethod
    public void closure() {
        tearDown();
    }

    @Test (description = "To validate message on apply tab", priority = 1)
    public void toValidateApplyTabMessage(){
        leavePage.navigateToApplyTab();
        leavePage.applyTabMassage();

    }
    @Test(description = "Validate the functionality of today button")
    public void toValidateTodayButton() throws InterruptedException {
        leavePage.navigateToMyLeave();
        leavePage.enterTodaysdateAtToDate();
        leavePage.getTodaysDate();

    }
    @Test
    public void validatemonth(){
        leavePage.inputDateInFromDateBox();
    }



}
