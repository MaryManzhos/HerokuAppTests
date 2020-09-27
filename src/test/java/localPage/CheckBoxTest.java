package localPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxTest extends SetUp {
    @Test
    public void isUncheckedCheckboxes() {
        WebElement checkBoxDogs = driver.findElement(By.id("dogs"));
        WebElement checkBoxCats = driver.findElement(By.id("cats"));
        assertFalse(checkBoxDogs.isSelected());
        assertFalse(checkBoxCats.isSelected());
    }

    @Test
    public void isCheckedCheckboxes() {
        WebElement checkBoxDogs = driver.findElement(By.id("dogs"));
        WebElement checkBoxCats = driver.findElement(By.id("cats"));
        checkBoxDogs.click();
        checkBoxCats.click();
        assertTrue(checkBoxDogs.isSelected());
        assertTrue(checkBoxCats.isSelected());
    }
}
