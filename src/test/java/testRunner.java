
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test",
        features = {"src/test/resources/features"},
        glue = {"stepdefs", "utils"},
        plugin = {"pretty",
                "html:target/cucumber-reports"
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "timeline:test-output-thread/"
        }
)
public class testRunner {

}