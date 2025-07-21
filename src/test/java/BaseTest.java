import Pages.*;
import Utilities.CommonUtils;
import Utilities.MyListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseTest {
        WebDriver driver;
        LoginPage loginPage;
        DashboardPage dashboardPage;
        CommonUtils commonUtils;
        MyListener listener;
        LeavePage leavePage;
        DemoQaElementsTextBoxPage demoQaElementsTextBoxPage;
    HashMap<String, String> testData;
    DemoQaElementsCheckBoxPage demoQaElementsCheckBoxPage;
    DemoQAElementsRadioButtonPage demoQAElementsRadioButtonPage;

      // @BeforeMethod
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--incognito");

            driver = new ChromeDriver(options);
            driver.get("https://demoqa.com/");
            //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
            System.out.println("Driver Inintialized");

        }

        public void initPages(WebDriver driver){
            commonUtils = new CommonUtils(driver);
            testData = commonUtils.readJsonToMap("src/test/resources/testdata.json");
            loginPage= new LoginPage(driver);
            dashboardPage = new DashboardPage(driver);
            listener= new MyListener(driver);
            leavePage = new LeavePage(driver);
            demoQaElementsTextBoxPage = new DemoQaElementsTextBoxPage(driver);
            demoQaElementsCheckBoxPage = new DemoQaElementsCheckBoxPage(driver);
            demoQAElementsRadioButtonPage = new DemoQAElementsRadioButtonPage(driver);

        }

    public void login(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        Assert.assertTrue(dashboardPage.getDashboardLogo(),"Login Successfull" );
    }
    // to navigate on element tab of DemoQA website
    public void navigateToElementTab(){
        demoQaElementsTextBoxPage.handleAdd();
        demoQaElementsTextBoxPage.navigateToElementTab();
        demoQaElementsTextBoxPage.handleAdd();
    }

        //@AfterMethod
        public void tearDown() {
            driver.quit();
            System.out.println("browser closed...");
        }
    }

