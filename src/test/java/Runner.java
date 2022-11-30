import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // path from content root or full path, where you store the feature file
    glue = {"stepdefinitions/saucelab"} // path from root (./test/java/), to the stepdefinition directory
)

public class Runner {

}
