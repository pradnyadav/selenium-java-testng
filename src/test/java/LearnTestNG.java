import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class LearnTestNG {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Set up Driver - Chrome");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Open Chrome Driver");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Application for testing");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sign In");
    }

    @Test (priority = 10, groups = "Smoke")
    public void learnAssertsions() {
        SoftAssert softassert = new SoftAssert();
        int a = 10, b = 10;
        boolean result = (a==b);
        softassert.assertEquals(a, b, "a does not equal to b");
        softassert.assertTrue(result, "a=b is true");
        softassert.assertAll();
        System.out.println("This is learn Assertsions test");
    }

    @Test (dependsOnGroups = "Smoke")
    private void searchBalloon() {
        System.out.println("Search for Balloon");
    }
    @Test (priority = 50)
    public void searchCar() {
        SoftAssert softassert = new SoftAssert();
        int a = 10, b = 10;
        boolean result = (a==b);
        softassert.assertFalse(result, "a=b is true");
        softassert.assertAll();
        System.out.println("Search for Car");
    }
    @Test (dependsOnMethods = "searchCar")
    public void searchApple() {
        System.out.println("Search for Apple");
    }
    @Test (priority = 1)
    public void searchJacket() {
        System.out.println("Search for Jacket");
    }
    @Test (dependsOnMethods = "searchCar")
    public void searchJeans() {
        System.out.println("Search for Jeans");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Sign Out");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Close test Application");
    }

    @AfterTest
    public void afterTest() {System.out.println("Close Chrome Driver");}

    @AfterSuite
    public void afterSuite() {
        System.out.println("Clean all cookies of Chrome Driver");
    }
}

