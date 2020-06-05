package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )


@CucumberOptions (
        features = "src/test/java/features",
        glue = ("seleniumGlueCode"), tags = {"@TestCL"}
)
// tags = {"@TestPE"} Pestaña Estudis
// tags = {"@TestPP"} Pestaña Projectes
// tags = {"@TestFC"} Formulario Contacto
// tags = {"@TestCL"} Check Links

public class TestRunner {
}
