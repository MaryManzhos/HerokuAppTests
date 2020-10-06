import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DynamicControlsTest extends SetUp {
    @Test
    public void isCorrectFunctionDynamicControls() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        WebElement removeButton = driver.findElement(By.cssSelector("[onclick=\"swapCheckbox()\"]"));

        removeButton.click();

        WebElement message = driver.findElement(By.id("message"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(message));

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int numberOfElements = driver.findElements(By.cssSelector("[type=checkbox]")).size();
        assertEquals(numberOfElements, 0, "The element is found");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement input = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
        assertFalse(input.isEnabled(), "Input is enabled");

        WebElement enableButton = driver.findElement(By.cssSelector("[onclick=\"swapInput()\"]"));
        enableButton.click();

        WebElement messageEnable = driver.findElement(By.id("message"));
        wait.until(ExpectedConditions.visibilityOf(messageEnable));

        assertTrue(input.isEnabled(), "Input is disabled");
    }
}
