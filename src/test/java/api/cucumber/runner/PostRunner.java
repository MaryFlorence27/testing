package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/api/cucumber/feature/posts.feature"},
        glue={"api.cucumber.feature.steps","api.cucumber.hooks"},
//plugin={"pretty","html:target/HtmlReports"}
plugin = {"pretty","json:target/report.json"},tags="@SmokeTest")
//plugin = {"pretty","junit:target/report.xml"})
public class PostRunner {

}
