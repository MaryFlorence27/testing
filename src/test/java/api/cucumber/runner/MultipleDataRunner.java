
package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/api/cucumber/feature/Loginwithmultipledata.feature"},glue={"api.cucumber.feature.steps"},dryRun = false)
public class MultipleDataRunner {
}

