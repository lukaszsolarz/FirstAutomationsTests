import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.TestNG;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class Sprawdz {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setUp(){
        driver.manage().window().maximize();
        System.out.println("przed klasa test");

    }

    @Test
    public void test() {

        driver.get("https://google.com");
        String ActualPage = driver.getTitle();
        String ExpectedPage = "Google";

        Assert.assertEquals(ActualPage, ExpectedPage);    //1 sposób
        assertTrue(driver.getTitle().equals(ExpectedPage), "Strona jest niepoprawna ");  // 2 sposób z komentarzem



    }

    @AfterClass
    public void tearDown(){

        System.out.println("po klasie Test");
        driver.quit();
    }

}
