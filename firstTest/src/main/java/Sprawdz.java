import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.TestNG;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class Sprawdz {
    WebDriver driver = new ChromeDriver();

    @Test
    public void Testowa() {

        driver.get("https://google.com");
        String ActualPage = driver.getTitle();
        String ExpectedPage = "Google";

        Assert.assertEquals(ActualPage, ExpectedPage);    //1 sposób
        assertTrue(driver.getTitle().equals(ExpectedPage), "Strona jest niepoprawna ");  // 2 sposób z komentarzem



    }

    @AfterClass
    public void Zniszcz(){
        driver.quit();
    }

}
