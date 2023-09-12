package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "StepDefinitions", dryRun = false,
        tags = "@All",
        plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class JUnitTestRunner {
    
}
