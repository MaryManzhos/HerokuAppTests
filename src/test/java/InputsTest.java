import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends InputTest{

    @Test
    public void inputsTest(){
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("0");
        input.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(input.getAttribute("value"),"1");
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(input.getAttribute("value"),"0");

        input.clear();
        input.sendKeys("q");
        input.sendKeys("йцуке");
        input.sendKeys("!@#$%");
        Assert.assertEquals(input.getAttribute("value"),"");
    }
}
