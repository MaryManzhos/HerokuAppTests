package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class ImageTest extends SetUp {
    @Test
    public void checkedImageOnPage() {
        WebElement image = driver.findElement(By.cssSelector("[alt=Belle]"));
        assertNotNull(image);
    }
}
