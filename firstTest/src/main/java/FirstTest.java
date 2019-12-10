import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest {

    @Test

    public void googleOpenTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/lsolarz/Test.html");

        IfElementExist(By.name("fname"), driver);

    }

    public boolean IfElementExist (By locator, WebDriver driver){
        if (driver.findElements(locator).size()>0){
            System.out.println("Element jest dostępny");
            return true;
        }
        else {
            System.out.println("Element nie dostępny");
            return false;
        }
    }





}