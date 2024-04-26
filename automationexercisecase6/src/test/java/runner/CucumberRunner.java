package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Contactus",
        glue = "stepdefinitions",
        features ="src/test/resources/features/ContactUs.feature"

)
public class CucumberRunner {

}