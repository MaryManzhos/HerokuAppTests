import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends SetUp {
    @Test
    public void isValidTextFromAlert() {
        driver.get("http://the-internet.herokuapp.com/context_menu");

        WebElement elementForClick = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementForClick).contextClick().perform();

        Alert alert = driver.switchTo().alert();

        String textFromAlert = alert.getText();

        assertEquals(textFromAlert, "You selected a context menu", "Text from alert don't contains expected text");

        alert.accept();
    }
}
