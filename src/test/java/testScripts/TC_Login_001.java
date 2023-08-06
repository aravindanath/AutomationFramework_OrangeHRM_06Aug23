package testScripts;

import org.testng.annotations.Test;
import pages.LoginPage;

public class TC_Login_001 extends  BaseTest{


    @Test
    public void TC_Login_001(){
        String username = "Admin",password = "admin123";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.validLogin(username, password);

    }
}
