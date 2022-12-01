import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/anotherfeature.feature", // path from content root or full path, where you
    // store the feature file
    // will run all the features file inside this directory
    glue = {"stepdefinitions"}, // path from root (./test/java/), to the stepdefinition directory
    plugin = {
        "pretty",
        "html:target/cucumber.html"
    },
    dryRun = false // false by default
//    tags = "not @wip" // not run @wip tag
)

public class Runner {

}
