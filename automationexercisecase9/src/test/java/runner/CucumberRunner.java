package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Product",
        glue = "stepdefinitions",
        features ="src/test/resources/feature/autoexerciseproduct.feature",
        dryRun = false

)
public class CucumberRunner {

}