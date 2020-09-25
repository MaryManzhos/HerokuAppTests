import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DataTablesTest extends SetUp {

    @Test
    public void dataTable1Test() {
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement cell1 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]"));
        WebElement cell2 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[2]"));
        WebElement cell3 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]"));
        WebElement cell4 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[4]"));
        WebElement cell5 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[5]"));

        assertEquals(cell1.getText(), "Smith");
        assertEquals(cell2.getText(), "Frank");
        assertEquals(cell3.getText(), "fbach@yahoo.com");
        assertEquals(cell4.getText(), "$100.00");
        assertEquals(cell5.getText(), "http://www.timconway.com");
    }

    @Test
    public void dataTable2Test() {
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement cell1 = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[1]/td[1]"));
        WebElement cell2 = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[2]/td[2]"));
        WebElement cell3 = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[2]/td[3]"));
        WebElement cell4 = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[3]/td[4]"));
        WebElement cell5 = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[4]/td[5]"));

        assertEquals(cell1.getText(), "Smith");
        assertEquals(cell2.getText(), "Frank");
        assertEquals(cell3.getText(), "fbach@yahoo.com");
        assertEquals(cell4.getText(), "$100.00");
        assertEquals(cell5.getText(), "http://www.timconway.com");
    }

}
