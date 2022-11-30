import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // path from src, to the features directory
    glue = {"stepdefinitions/saucelab"} // path from root, to the stepdefinition directory
)

public class Runner {

}
