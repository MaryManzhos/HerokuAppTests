import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends SetUp {

    @Test
    public void notificationMessagesTest() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.manage().deleteAllCookies();
        WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a"));
        Actions action = new Actions(driver);
        action.moveToElement(link).click().perform();

        WebElement notification = driver.findElement(By.id("flash"));
        String actualResult = notification.getText();

        if (actualResult.equals("Action unsuccesful, please try again")) {
            Assert.assertEquals(actualResult, "Action unsuccesful, please try again");
        }
        if (actualResult.equals("Action successful")) {
            Assert.assertEquals(actualResult, "Action successful");
        }
    }
}
