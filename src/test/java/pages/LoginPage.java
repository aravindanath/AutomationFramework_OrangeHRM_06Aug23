package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }
// Object Repository
    @FindBy(name = "username")
    WebElement usernameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(xpath = "//button[text()=' Login ']")
    WebElement loginButton;

    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    WebElement forgetPasswordButton;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardTitle;


   // Business Logic

    public void validLogin(String username, String password){
        System.out.println("Page Title: " + driver.getTitle());
        usernameField.sendKeys(username);
        waitForElement(3000);
        passwordField.sendKeys(password);
        waitForElement(3000);
        loginButton.click();
        waitForElement(3000);
        assertTitle(dashboardTitle,"Dashboard");
        System.out.println("Page Title: " + driver.getTitle());
    }
}
