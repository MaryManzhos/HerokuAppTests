import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropdownTest extends SetUp{

    @Test
    public void dropdownTest(){

        driver.get("http://the-internet.herokuapp.com/dropdown");
        //Get all elements
        List <WebElement> options = driver.findElements(By.tagName("option"));
        List <String> optionsValue = new ArrayList<String>();

        for (WebElement value: options) {
            optionsValue.add(value.getText());
        }

        List<String> expectedOptions = new ArrayList<String>();
        expectedOptions.add(0,"Please select an option");
        expectedOptions.add(1,"Option 1");
        expectedOptions.add(2,"Option 2");

        //Check all elements
        Assert.assertEquals(optionsValue, expectedOptions);

        //Check first selected element
        options.get(1).click();
        Assert.assertEquals(options.get(1).getText(), expectedOptions.get(1));

        //Check second selected element
        options.get(2).click();
        Assert.assertEquals(options.get(2).getText(), expectedOptions.get(2));
    }
}
