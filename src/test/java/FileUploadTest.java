import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends SetUp {
    @Test
    public void isUploadFile() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("/Users/marym/Documents/Courses_Automation/Part_2_QA/Lesson 5 QA/HerokuAppTests/src/test/resources/Belle.png");
        driver.findElement(By.id("file-submit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
        WebElement nameOfFile = driver.findElement(By.id("uploaded-files"));
        assertEquals(nameOfFile.getText(), "Belle.png", "It's not uploaded file");
    }
}
