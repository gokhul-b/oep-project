package oep_maven_project.oep_project;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/oep_maven_project/oep_project",
glue = {"oep_maven_project/oep_project"},
plugin = {"json:target/cucumber/cucumber.json"})
public class OepTest {
	private OEP oep;
    private int number;
    private String result;

    @Given("Create an OEP Game Play object")
    public void createOEPObject() {
        oep = new OEP();
    }

    @When("I Play the Game with number {int}")
    public void playGameWithNumber(int num) {
        number = num;
        result = oep.play(number);
    }

    @Then("The result is {string}")
    public void verifyResult(String expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
}
