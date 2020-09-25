import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void checkBoxTest(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> input = driver.findElements(By.tagName("input"));
        Assert.assertFalse(input.get(0).isSelected());
        input.get(0).click();
        Assert.assertTrue(input.get(0).isSelected());
        Assert.assertTrue(input.get(1).isSelected());
        input.get(1).click();
        Assert.assertFalse(input.get(1).isSelected());
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
