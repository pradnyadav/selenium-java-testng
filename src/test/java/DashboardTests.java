import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DashboardTests extends BaseTest{



        @BeforeMethod
        public void setup() throws InterruptedException {
//            setUp();
//            initPages(driver);
            login("Admin", "Admin123");
        }

        @AfterMethod
        public void closure() {
//            tearDown();
        }

        @Test (groups = "Sanity")
        public void dashboardTileValidation() {
            dashboardPage.validateTilesOnDashboard(7);

        }

        @Test (groups = "Sanity")
        public void menuListValidation(){
            List<String> expectedMenuItems = Arrays.asList(
                    "Admin",
                    "PIM",
                    "Leave",
                    "Time",
                    "Recruitment",
                    "My Info",
                    "Performance",
                    "Dashboard",
                    "Directory",
                    "Maintenance",
                    "Claim",
                    "Buzz"
            );
            List<WebElement> actualMenuItems = dashboardPage.getMenuList();
            for (int i=0;i<expectedMenuItems.size();i++){

                Assert.assertEquals( actualMenuItems.get(i).getText(),expectedMenuItems.get(i));
                System.out.println(" Successfully validated " + expectedMenuItems.get(i));

            }


        }







}
