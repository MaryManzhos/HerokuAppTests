import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxTest extends InputTest {

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

}
