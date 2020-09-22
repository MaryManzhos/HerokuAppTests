import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class HoversTest extends SetUp{

    @Test
    public void hover1Test(){

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement img = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        Actions action = new Actions(driver);
        action.moveToElement(img).perform();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
        String actualResult1 = user.getText();
        Assert.assertEquals(actualResult1, "name: user1");

        WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
        action.moveToElement(link).click().perform();
        WebElement name = driver.findElement(By.tagName("h1"));
        String actualResult2 = name.getText();
        Assert.assertEquals(actualResult2, "Not Found");

    }

    @Test
    public void hover2Test(){

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement img = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        Actions action = new Actions(driver);
        action.moveToElement(img).perform();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        String actualResult1 = user.getText();
        Assert.assertEquals(actualResult1, "name: user2");

        WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/a"));
        action.moveToElement(link).click().perform();
        WebElement name = driver.findElement(By.tagName("h1"));
        String actualResult2 = name.getText();
        Assert.assertEquals(actualResult2, "Not Found");

    }

    @Test
    public void hover3Test(){

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement img = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        Actions action = new Actions(driver);
        action.moveToElement(img).perform();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5"));
        String actualResult1 = user.getText();
        Assert.assertEquals(actualResult1, "name: user3");

        WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/a"));
        action.moveToElement(link).click().perform();
        WebElement name = driver.findElement(By.tagName("h1"));
        String actualResult2 = name.getText();
        Assert.assertEquals(actualResult2, "Not Found");

    }

}
