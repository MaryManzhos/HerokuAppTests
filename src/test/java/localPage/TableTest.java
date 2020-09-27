package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TableTest extends SetUp {
    @Test
    public void findElementTable() {
        WebElement cell2 = driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));
        String actualResult = cell2.getText();
        assertEquals(actualResult, "Petr");
    }

}
