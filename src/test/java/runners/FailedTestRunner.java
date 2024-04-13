package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "@target/failedRerun.txt",  // provides path of the features folder
        glue = "stepdefinitions",  // provides path of the stepdefinitions folder
        dryRun =false,    // generates the missing step definitions, without running the existing step definitions
        monochrome = true
)
public class FailedTestRunner {
}
