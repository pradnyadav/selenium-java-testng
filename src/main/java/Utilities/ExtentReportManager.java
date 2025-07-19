package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static ExtentReports createInstance() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("HTMLReports/Learn_TestNG_Report.html");
        reporter.config().setReportName("UI Test Report");
        reporter.config().setDocumentTitle("Automation Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Pradnya");

        return extent;
    }
}
