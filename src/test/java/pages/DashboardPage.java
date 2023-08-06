
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {


    public DashboardPage(WebDriver driver) {
        super(driver);
    }


// Object Repository
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li/a/span")
    List<WebElement> menuList;


    public void validateMenuTitles(){
        for (WebElement element : menuList){
            System.out.println(element.getText());
        }
    }

}
