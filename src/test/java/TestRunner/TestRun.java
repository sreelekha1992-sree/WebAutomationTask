package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions
            (
                    features= {"/Users/macuser/Desktop/Sample/WebAutomationTask/Features/Login.feature","/Users/macuser/Desktop/Sample/WebAutomationTask/Features/orderTshirt.feature","/Users/macuser/Desktop/Sample/WebAutomationTask/Features/updatePersonalInfo.feature"},
                    glue = {"stepDefinitions"},
                    dryRun = true,
                    monochrome = true,
                    plugin = {"json:target/cucumber.json"}
    )
    public class TestRun {
}
