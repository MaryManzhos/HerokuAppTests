package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ButtonTest extends SetUp {
    @Test
    public void checkedNameOfButton() {
        WebElement button = driver.findElement(By.tagName("button"));
        String nameOfButton = button.getText();
        assertEquals(nameOfButton, "Button");
    }
}
