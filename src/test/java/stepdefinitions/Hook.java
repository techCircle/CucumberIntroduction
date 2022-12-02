package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class Hook {
  @After
  public void tearDown() {
    System.out.println("closing driver");
//    Driver.closeDriver();
  }
}
