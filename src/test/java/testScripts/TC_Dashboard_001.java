package testScripts;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class TC_Dashboard_001 extends  BaseTest{


    @Test
    public void TC_Dashboard_001(){
        String username = "Admin",password = "admin123";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.validLogin(username, password);

        DashboardPage dp = new DashboardPage(driver);
        dp.validateMenuTitles();

    }
}
