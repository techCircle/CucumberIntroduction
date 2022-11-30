package stepdefinitions.saucelab;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
  WebDriver driver;

  @Given("user lands on the login page")
  public void user_lands_on_the_login_page() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
  }
  @When("user enters valid username")
  public void user_enters_valid_username() {
    driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
  }
  @When("user enters valid password")
  public void user_enters_valid_password() {
    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
  }
  @Then("user should land on the product page")
  public void user_should_land_on_the_product_page() {
    String actualTitle = driver.findElement(By.xpath("//*[@class='title']")).getText();
    Assert.assertEquals("PRODUCTS",actualTitle);
  }
  @And("user clicks on the login button")
  public void userClicksOnTheLoginButton() {
    driver.findElement(By.xpath("//*[@id='login-button']")).click();
  }

  @When("user enters invalid username")
  public void userEntersInvalidUsername() {
    driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("invalid_user");
  }
  @Then("user should see warning message")
  public void userShouldSeeWarningMessage() {
    WebElement element = driver.findElement(By.cssSelector("[data-test=\"error\"]"));
    Assert.assertTrue("Error should be displayed", element.isDisplayed());
  }
  @And("user enters invalid password")
  public void userEntersInvalidPassword() {

  }
}

