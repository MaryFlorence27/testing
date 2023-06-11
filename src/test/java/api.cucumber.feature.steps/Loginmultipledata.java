package api.cucumber.feature.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginmultipledata {
    private WebDriver driver;

    @Given("User on Home Page")
    public void userOnHomePage() {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
    }

    @When("User Navigate to login page")
    public void userNavigateToLoginPage() {
        System.out.println("userNavigateToLoginPage");
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        System.out.println("user name is"+username+"password"+password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displayed login successfully")
    public void messageDisplayedLoginSuccessfully() throws InterruptedException {
        System.out.println("successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }


}
