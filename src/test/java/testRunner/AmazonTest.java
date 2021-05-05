package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/appFeatures/Search.feature"},
        glue = {"stepsDefinitions","myHooks"},
        tags = "@All",
        plugin = {"pretty"}
)

public class AmazonTest {

}
