package stepdefinitions.mathtest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MathSteps {
  Integer sum = 0;
  @Given("I have {int}") // cucumber expression
  public void i_have(Integer int1) {
    System.out.println("I have " + int1);
    sum += int1;
  }
  @When("I add them together")
  public void i_add_them_together() {
    System.out.println("Add them together");
  }
//  @Then("It should be {int}")
//  public void it_should_be(Integer sum) {
//    Assert.assertEquals(this.sum,sum);
//  }

  @Then("^It should( not)? be (\\d+)$")
  public void it_should_not_something_blah_equals(String not, Integer result) {
    if (not != null) {
      System.out.println(not);
      Assert.assertEquals(this.sum,sum);
    }
    else {
      System.out.println(not);
      Assert.assertNotEquals(this.sum, result);
    }
  }

  @Given("I have {string} dollars")
  public void iHaveSomeMoney(String money) {
    System.out.println("I have this amount of money " + money);
  }

  @When("I buy {string} and {string}")
  public void iBuyThings(String item1, String item2) {
    System.out.println("I buy " + item1 + " first.");
    System.out.println("then buy " + item2 + " next.");
  }

//  @And("I buy {string} for {double} dollars")
//  public void iBuyForDollars(String item, double price) {
//    System.out.println("I buy " + item + " for $" + price);
//  }

// Regex
  // has to be in between   ^....$
  // your parameters has to be in (param)
  @And("^I buy \"([^\"]*)\" for (\\d+\\.\\d+) dollars$")
  public void iBuyForDollars(String item, double price) {
    System.out.println("I buy " + item + " for $" + price);
  }
}
