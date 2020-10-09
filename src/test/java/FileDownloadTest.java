import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class FileDownloadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", System.getProperty("user.dir"));

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        driver = new ChromeDriver(options);
    }

    @Test
    public void isFileDownloadTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        WebElement link = links.get(1);
        link.click();

        Thread.sleep(1000);

        File folder = new File(System.getProperty("user.dir"));

        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;

        if(listOfFiles != null) {
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    String fileName = listOfFile.getName();
                    System.out.println("File " + listOfFile.getName());
                    if (fileName.matches("test.txt")) {
                        f = new File(fileName);
                        found = true;
                    }
                }
            }
        } else {
            System.out.println("Нет файлов");
        }

        Assert.assertTrue(found, "Downloaded document is not found");
        f.deleteOnExit();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
