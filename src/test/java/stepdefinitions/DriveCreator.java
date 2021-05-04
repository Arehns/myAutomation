package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriveCreator {


    public WebDriver createBrowser(String browser) {
        WebDriver driver = null;

        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrea\\selenium\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\andrea\\selenium\\drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\andrea\\selenium\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        return driver;

    }


}
