package step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIDemoTestFeature {
    @Given("create a user  with {string} with {string} and {string}")
    public void createAUserWithWithAnd(String URL, String UN, String PWD) {
        System.out.println(URL);
        System.out.println(UN);
        System.out.println(PWD);
    }

    @Then("status code should be {string}")
    public void statusCodeShouldBe(String respnseCode) {
        System.out.println(respnseCode);
    }
}
