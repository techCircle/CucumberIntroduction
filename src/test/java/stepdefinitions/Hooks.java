package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before; // must come from this package

public class Hooks {
  @Before
  public void setUp() {
    System.out.println("This is from before annotation");
  }

  @After
  public void tearDown() {
    System.out.println("This will tear down the browser");
  }
}
