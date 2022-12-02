package stepdefinitions.saucelab;

import PageObjects.LoginPage;
import PageObjects.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factories.Driver;

public class LoginStepDefinitions {
  WebDriver driver;
  private LoginPage loginPage = new LoginPage();
  private ProductsPage productsPage = new ProductsPage();

  @Given("user lands on the login page")
  public void user_lands_on_the_login_page() {
    driver = Driver.getDriver();
    driver.get("https://www.saucedemo.com/");
  }
  @When("user enters username {string}")
  public void user_enters_username(String username) {
    loginPage.enterUsername(username);
  }
  @When("user enters password {string}")
  public void user_enters_password(String password) {
    loginPage.enterPassword(password);
  }

  @Then("user should land on the product page")
  public void user_should_land_on_the_product_page() {
    String actualTitle = productsPage.pageTitle.getText();
    Assert.assertEquals("PRODUCTS", actualTitle);
  }
  @And("user clicks on the login button")
  public void userClicksOnTheLoginButton() {
    loginPage.loginBtn.click();
  }
  //  @Then("user should see warning message")
  //  public void userShouldSeeWarningMessage() {
  //    WebElement element = driver.findElement(By.cssSelector("[data-test=\"error\"]"));
  //    Assert.assertTrue("Error should be displayed", element.isDisplayed());
  //  }
  //  @And("user enters invalid password")
  //  public void userEntersInvalidPassword() {
  //
  //  }
}

