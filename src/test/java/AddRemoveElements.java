import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElements extends InputTest{

    @Test
    public void AddRemoveElementsTest() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add 2 elements
        WebElement addElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        for(int i = 0; i < 2; i++) {
            addElement.click();
        }

        //Remove element from Collection of Elements
        List<WebElement> removeElement = driver.findElements(By.className("added-manually"));
        int amount = 0;
        for (int i = 0; i < 1; i++) {
            removeElement.get(0).click();
            amount++;
        }

        // Assert size
        List<WebElement> removeElements = driver.findElements(By.className("added-manually"));
        int fact = removeElements.size();
        int expected = removeElement.size() - amount;
        Assert.assertEquals(fact, expected);
    }
}
