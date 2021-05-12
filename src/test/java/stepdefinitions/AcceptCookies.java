package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptCookies {
    public static void Cookies(WebDriver driver, By by) {
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }
}
