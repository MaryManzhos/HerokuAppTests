package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LinkTest extends SetUp {
    @Test
    public void isValidLink() {
        WebElement link = driver.findElement(By.tagName("a"));
        String redirectUrl = link.getAttribute("href");
        assertEquals(redirectUrl, "https://www.disneylandparis.ru/");
    }
}
