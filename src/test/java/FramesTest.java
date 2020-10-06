import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FramesTest extends SetUp{
    @Test
    public void isValidTextIntoFrame() {
        driver.get("http://the-internet.herokuapp.com/frames");
        driver.findElement(By.xpath("//*[@class=\"example\"]//a[contains(text(), 'iFrame')]")).click();
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        WebElement paragraph = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        String valueOfParagraph = paragraph.getText();
        assertEquals(valueOfParagraph,"Your content goes here.","It's not valid text");
    }
}
