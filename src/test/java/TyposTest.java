import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends SetUp {

    @Test
    public void typosTest() {
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement paragraph = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]"));
        Assert.assertEquals(paragraph.getText(), "Sometimes you'll see a typo, other times you won't.");
    }
}
