package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@SaucedemoTest",
        glue = "stepdefs",
        features ="src/test/resources/feature/saucedemo.feature",
        dryRun = false

)
public class CucumberRunner {

}