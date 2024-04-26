package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Facebook",
        glue = "stepdefinitions",
        features ="src/test/resources/features/facebook.feature"

)
public class CucumberRunner {

}