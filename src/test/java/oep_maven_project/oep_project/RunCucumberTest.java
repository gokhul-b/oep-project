package oep_maven_project.oep_project;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/oep_maven_project/oep_project",
glue = {"stepDefinitions"},
plugin = {"json:target/cucumber/cucumber.json"})
public class RunCucumberTest {
    // This class doesn't need any code inside, it's just for running Cucumber tests
}

