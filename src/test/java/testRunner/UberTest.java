package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/appFeatures/Uber.feature"},
        glue = {"stepsDefinitions", "myHooks"},
        tags = "@All",
        plugin = {"pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml",
                "html:target/MyReports/report.html"},
        monochrome = true

)

public class UberTest {

}
