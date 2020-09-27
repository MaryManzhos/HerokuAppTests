package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputTest extends SetUp {
    @Test
    public void findElementInput(){
        WebElement inputLogin = driver.findElement(By.id("login"));
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputLogin.click();
        inputLogin.sendKeys("12345");
        String actualResult = inputLogin.getAttribute("value");
        assertEquals(actualResult, "12345");
    }
}
