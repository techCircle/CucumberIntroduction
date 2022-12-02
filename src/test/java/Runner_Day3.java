import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/saucelab-login.feature", // path from content root or full path, where you
    glue = {"stepdefinitions"}, // path from root (./test/java/), to the stepdefinition directory
    plugin = {
        "pretty",
        "html:target/cucumber.html"
    },
    dryRun = false,
    tags = "not @wip" // not run @wip tag
)

public class Runner_Day3 {
}
