package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClicker {

    public void click(WebDriver driver, By by) {
        (new WebDriverWait(driver,50)).until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }
}
