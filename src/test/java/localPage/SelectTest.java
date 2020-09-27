package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;

public class SelectTest extends SetUp{
    @Test
    public void factOptionsEqualsExpectedOptions(){
        List<WebElement> options = driver.findElements(By.tagName("option"));
        String moodHappy = options.get(0).getText();
        assertEquals(moodHappy,"Happy");
    }
}
