package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.assertEquals;




public class FunctionTests {

    private WebDriver driver;
    SendKeys s = new SendKeys();
    ButtonClicker c = new ButtonClicker();
    GetterSetter get = new GetterSetter();


    @Given("user opens Sign up web page in browser {string}")
    public void user_opens_up_browser(String browser) {
        DriveCreator creator = new DriveCreator();
        driver = creator.createBrowser(browser);
        driver.get("https://login.mailchimp.com/signup/");
    }

    @Given("click on Accept all Cookies")
    public void click_on_accept_all_cookies() {
        c.click(driver, By.id("onetrust-accept-btn-handler"));
    }

    @Given("enter {string}")
    public void enter(String email) {
        get.setNewEmail(email);
        s.sendKeys(driver, By.name("email"), (get.getNewEmail()));

    }

    @Given("and then enter {string}")
    public void and_then_enter(String user) {
        get.setNewUser(user);
        s.sendKeys(driver, By.id("new_username"), (get.getNewUser()));

    }

    @Given("then lastly enter {string}")
    public void then_lastly_enter(String pass) {
        s.sendKeys(driver, By.id("new_password"), (pass));

    }

    @When("user clicks on Sign up button")
    public void user_clicks_on_sign_up_button() {

        c.click(driver, By.id("create-account"));
    }


    @Then("user receives feedback{string}")
    public void userReceivesFeedback(String status) {
        if ("success".equals(status)) {
            String actualString1 = driver.findElement(By.tagName("h1")).getText();
            assertEquals("Check your email", actualString1);
            System.out.println(actualString1);
        } else if ("duplicate".equals(status)) {
            String actualString2 = driver.findElement(By.className("invalid-error")).getText();
            assertEquals("Another user with this username already exists. Maybe it's your evil twin. Spooky.", actualString2);
            System.out.println(actualString2);
        } else if ("emptyField".equals(status)) {
            String actualString3 = driver.findElement(By.className("invalid-error")).getText();
            assertEquals("Please enter a value", actualString3);
            System.out.println(actualString3);
        } else if ("maximum".equals(status)) {
            String actualString4 = driver.findElement(By.className("invalid-error")).getText();
            assertEquals("Enter a value less than 100 characters long", actualString4);
            System.out.println(actualString4);

        } else {
            System.out.println("Something wrong at the last step");
        }
        driver.quit();
    }
}