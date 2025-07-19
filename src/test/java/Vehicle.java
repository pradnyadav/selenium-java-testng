import org.testng.Assert;
import org.testng.annotations.*;

public class Vehicle {

    @BeforeSuite(groups = {"Smoke","Regression"})
    public void beforeSuite() {
        System.out.println("running before suite...");
    }

    @BeforeTest(groups = {"Smoke","Regression"})
    public void beforeTest() {
        System.out.println("running before test...");
    }

    @BeforeClass(groups = {"Smoke","Regression"})
    public void beforeClass() {
        System.out.println("running before class...");
    }

    @BeforeMethod(groups = {"Smoke","Regression"})
    public void beforeMethod() {
        System.out.println("running before method...");
    }

    @AfterMethod(groups = {"Smoke","Regression"})
    public void afterMethod() {
        System.out.println("running after method...");
    }

    @AfterClass(groups = {"Smoke","Regression"})
    public void afterClass() {
        System.out.println("running after class...");
    }

    @AfterTest(groups = {"Smoke","Regression"})
    public void afterTest() {System.out.println("running after test...");}

    @AfterSuite(groups = {"Smoke","Regression"})
    public void afterSuite() {
        System.out.println("running after suite...");
    }
    @Test (dataProvider = "getFirstLastName",groups = "Smoke")
    public void createFullName(String firstname,String lastname){
    System.out.println("Fullname is "+firstname+" "+lastname);
    }
    @DataProvider
    public Object [][] getFirstLastName(){
        Object data[][]= new Object[3][2];
        data[0][0]="Pradnya"; data[0][1]="Kolte";
        data[1][0]="Nishant"; data[1][1]="Kolte";
        data[2][0]="Anaya"; data[2][1]="Kolte";
        return data;
    }

    @Test(groups = "Smoke")
    private void test1() {
        System.out.println("running test 1 ... on thread:"+ Thread.currentThread().getId());
        Assert.assertTrue(true,"test 1 failed");
    }
    @Test (groups = {"Smoke","Regression","critical"})
    private void test2() {
        System.out.println("running test 2 ... on thread:"+ Thread.currentThread().getId());
        Assert.assertTrue(true);
    }
    @Test (groups = "Smoke")
    private void test3() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("running test 3 ... on thread:"+ Thread.currentThread().getId());
        Assert.assertTrue(true);
    }
    @Test (groups = {"Regression","critical"}, dependsOnMethods = "test2")
    private void test4() {
        System.out.println("running test 4 ... on thread:"+ Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

    @Test (groups = "Regression", dependsOnGroups = "critical")
    private void test5() {
        System.out.println("running test 5 ... on thread:"+ Thread.currentThread().getId());
        Assert.assertTrue(true);
    }
}
