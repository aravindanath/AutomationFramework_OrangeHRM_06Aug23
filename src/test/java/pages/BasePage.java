package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public static void waitForElement(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void assertTitle(WebElement element, String title) {
        String actualTitle = element.getText();
        System.out.println("Title: " + actualTitle);
        Assert.assertEquals(actualTitle, title,"Title NOT match");
    }

}
