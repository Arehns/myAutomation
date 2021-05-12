package stepdefinitions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefinitions.DriveCreator;

public class FunctionTests {


    private WebDriver driver;
    SendKeys s = new SendKeys();

    @Given("user opens Sign up web page in browser {string}")
    public void user_opens_up_browser(String browser) {
        DriveCreator creator = new DriveCreator();
        driver = creator.createBrowser(browser);
        driver.get("https://login.mailchimp.com/signup/");
    }
    @Given("enter {string}")
    public void enter(String email) {

        s.sendKeys(driver, By.name("email"), (email));

    }

    @Given("and then enter {string}")
    public void and_then_enter(String user) {
            s.sendKeys(driver, By.id("new_username"), (user));
        System.out.println(user);
    }

    @Given("then lastly enter {string}")
    public void then_lastly_enter(String pass) {
            s.sendKeys(driver, By.id("new_password"), (pass));
        System.out.println(pass);


    }

/*


private void click(WebDriver driver, By by) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(By.name("marketing-newsletter")).click();

   /* @Then("user receives feedback")
    public void user_receives_feedback() {
        System.out.println("No answer yet");
        driver.quit();*/

    }

/*
    }
@When("user clicks on Sign up button")
public void user_clicks_on_sign_up_button() {

    click(driver, By.cssSelector("input[name='marketing-newsletter']"));
    System.out.println("Good");
    ;
}
    private void click(WebDriver driver, By by) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(By.name("marketing-newsletter")).click();
    } */

