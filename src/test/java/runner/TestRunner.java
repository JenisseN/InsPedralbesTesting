package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

// tags ={"@tag1"} )
@CucumberOptions (
        features = "src/test/java/features" ,
        glue = ("seleniumGlueCode"), tags = {"@Test"}
)
// tags = {"@SmokeTest"}
public class TestRunner {
}
