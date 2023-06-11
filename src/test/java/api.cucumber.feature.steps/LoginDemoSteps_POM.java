

package api.cucumber.feature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import pages.Loginpage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LoginDemoSteps_POM {
    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("^browser is open$")
    public void browser_is_open() throws Throwable {
        System.out.println("=======I Am inside browser_is_open=======");
        System.out.println("Inside step_browser is open");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
        login=new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() throws Throwable {
        home=new HomePage_PF(driver);
       assertTrue(home.checkLogoutIsDisplayed());
       driver.findElement(By.id("logout")).isDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

    @And("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
       driver.navigate().to("https:example.testproject.io/web/");
    }

    @And("^user clicks on login$")
    public void user_clicks_on_login() throws Throwable {
       login.clickOnLogin();

    }
}

