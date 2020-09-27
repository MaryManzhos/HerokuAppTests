package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParagraphTest extends SetUp {
    @Test
    public void checkedValueOfParagraph() {
        WebElement paragraph = driver.findElement(By.id("cinderella"));
        String factValue = paragraph.getText();
        assertEquals(factValue, "ONCE UPON A TIME a girl named Cinderella lived with her stepmother and two stepsisters.");
    }
}
