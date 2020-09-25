import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElementsTest extends SetUp{

    @Test
    public void addElementsTest() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add 2 elements
        WebElement addElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElement.click();
        addElement.click();

        // Assert size
        List<WebElement> addElements = driver.findElements(By.className("added-manually"));
        int fact = addElements.size();
        Assert.assertEquals(fact, 2);
    }

    @Test
    public void removeElementsTest() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add 2 elements
        WebElement addElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElement.click();
        addElement.click();

        //Remove element from Collection of Elements
        List<WebElement> removeElement = driver.findElements(By.className("added-manually"));
        removeElement.get(0).click();


        // Assert size
        List<WebElement> removeElements = driver.findElements(By.className("added-manually"));
        int fact = removeElements.size();
        Assert.assertEquals(fact, 1);
    }
}
