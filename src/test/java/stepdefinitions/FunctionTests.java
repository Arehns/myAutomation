package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FunctionTests {

    private WebDriver driver;
    SendKeys s = new SendKeys();
    ButtonClicker c = new ButtonClicker();
    StringModifier g = new StringModifier();
    Feedback f = new Feedback();
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

    @Then("user receives feedback")
    public void user_receives_feedback() {
        System.out.println(f.feedBack());
        driver.quit();
    }

}

