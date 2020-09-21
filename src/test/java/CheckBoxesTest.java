import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxesTest extends InputTest{

    @Test
    public void checkBoxesTest(){

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List <WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        //check 1 checkbox unchecked
        Assert.assertFalse(checkBoxes.get(0).isSelected());

        //Checked 1 checkbox
        checkBoxes.get(0).click();

        //check 1 checkbox checked
        Assert.assertTrue(checkBoxes.get(0).isSelected());

        //check 2 checkbox checked
        Assert.assertTrue(checkBoxes.get(1).isSelected());

        //Checked 2 checkbox
        checkBoxes.get(1).click();

        //check 2 checkbox unchecked
        Assert.assertFalse(checkBoxes.get(1).isSelected());

    }
}
