package stepDefinitions;


import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import oep_maven_project.oep_project.OEP;



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

