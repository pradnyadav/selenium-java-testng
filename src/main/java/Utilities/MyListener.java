package Utilities;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
    private WebDriver driver;

    public MyListener(WebDriver driver){
        this.driver= driver;
    }


    public void onStart(ITestContext context) {
        ExtentReportManager.createInstance();
        System.out.println("logging execution started in execution report");
    }

    public void onTestStart(ITestResult result) {
        ExtentReportManager.test = ExtentReportManager.extent.createTest(result.getMethod().getMethodName());
        System.out.println("logging test started in execution report");
    }

    public void onTestSuccess(ITestResult result) {
//        String screenshotPath = ScreenshotsUtilities.takeScreenshot(driver, result.getName());
//        ExtentReportManager.test.log(Status.PASS,"Test Passed: " + result.getThrowable(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        ExtentReportManager.test.log(Status.PASS,result.getName()+" Test case passed!!!");

        System.out.println("logging test passed in execution report");
    }

    public void onTestFailure(ITestResult result) {
        ExtentReportManager.test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
        System.out.println("logging test failure in execution report");
    }

    public void onTestSkipped(ITestResult result) {
        ExtentReportManager.test.log(Status.SKIP, "Test Skipped");
        System.out.println("logging test skipped in execution report");
    }

    public void onFinish(ITestContext context) {
        ExtentReportManager.extent.flush();
        System.out.println("logging execution completed in execution report");
    }

}
