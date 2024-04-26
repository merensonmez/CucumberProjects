package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@RegisterPage",
        glue = "stepdefinitions",
        features ="src/test/resources/features/automationexercisereg.feature"

)
public class CucumberRunner {

}