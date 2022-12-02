package stepdefinitions;

import io.cucumber.java.After;

public class Hook {
  @After
  public void tearDown() {
    System.out.println("closing driver");
//    Driver.closeDriver();
  }
}
