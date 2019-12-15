import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Szukaj {
    @Test

    public void Google() {
        WebDriver driver = new ChromeDriver();
        driver.get("https:/google.com");
        driver.manage().window().maximize();
        CheckIt(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"),driver, "PoleWyszukiwania");
        CheckIt(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]"),driver, "PrzyciskSzukaj");
        CheckIt(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[2]"),driver, "PrzyciskSzczęśliwyTraf");

    }

    public boolean CheckIt(By locator, WebDriver driver, String nazwaElementu) {
        if (driver.findElements(locator).size() > 0) {
            System.out.println("Element " + nazwaElementu + " istnieje na stronie");
            return true;

        } else {
            System.out.println("Element " + nazwaElementu + "nie istnieje na stronie");
            return false;
        }
    }


}


