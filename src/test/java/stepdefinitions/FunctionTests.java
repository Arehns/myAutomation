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

   /* @Given("I have used {string} as browser")
    public void i_have_used_as_browser(String browser) throws InterruptedException {
        DriveCreator creator = new DriveCreator();

        driver = creator.createBrowser(browser);
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");

    }

    @Given("I have entered {int} into the calculator")
    public void sendFirstNumber(int first) {
        sendKeys(driver, By.cssSelector("input[name=n01]"), Integer.toString(first));
    }

    @Given("I have also entered {int} into the calculator")
    public void sendingSecondNumber(int second) {
        sendKeys(driver, By.name("n02"), Integer.toString(second));
    }

    private void sendKeys(WebDriver driver, By by, String keys) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(keys);
        System.out.println("Sending keys");

    }

    @When("I press add")
    public void add() {

        click(driver, By.cssSelector("input[type=button]"));

    }


    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(Integer int1) {

        driver.quit();

    }

    private void click(WebDriver driver, By by) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    } */

    @Given("user opens up browser {string}")
    public void user_opens_up_browser(String string) {
        System.out.println("Good");
    }

    @Given("navigates to Sign up webpage")
    public void navigates_to_sign_up_webpage() {
        System.out.println("Good");
    }

    @Given("enter {string}")
    public void enter(String string) {
        System.out.println("Good");
    }

    @When("user clicks on Sign up button")
    public void user_clicks_on_sign_up_button() {
        System.out.println("Good");;
    }

    @Then("user receives feedback")
    public void user_receives_feedback() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }







}