package stepdefinitions.saucelab;

import io.cucumber.datatable.DataTable;
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

import java.util.List;

public class LoginStepDefinitions {
  WebDriver driver;

  @Given("user lands on the login page")
  public void user_lands_on_the_login_page() {

    System.out.println("Go to Login Page");
  }
  @When("user enters username {string}")
  public void user_enters_valid_username(String username) {
    System.out.println("User enter username: " + username);
  }
  @When("user enters password {string}")
  public void user_enters_valid_password(String password) {
    System.out.println("User enter username: " + password);
  }
  @Then("user should land on the product page")
  public void user_should_land_on_the_product_page() {
    System.out.println("Verify that use is on Product Page");
  }
  @And("user clicks on the login button")
  public void userClicksOnTheLoginButton() {
    System.out.println("Click Login button");
  }

  @Then("user should see warning message {string}")
  public void userShouldSeeWarningMessage(String errorMsg) {
    System.out.println("Verify that " + errorMsg + " is displayed");
  }
  @Then("user should see following menus")
  public void userShouldSeeFollowingMenus(DataTable dataTable) {
    List<String> menus = dataTable.asList();
    for (String menu : menus) {
      System.out.println(menu);
    }
  }

  @Given("user land on {string}")
  public void navigateTo(String website) {
    System.out.println("User navigate to " + website);
  }
}

