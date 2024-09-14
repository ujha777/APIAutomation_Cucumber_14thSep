package steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBookingTest {
    public static String BASE_URL="https://restful-booker.herokuapp.com";
    public static RequestSpecification requestSpecification = RestAssured.given().baseUri(BASE_URL);
    public static Response response;
    public static ValidatableResponse validatableResponse;
    @Given("create a request with url {string}")
    public void createARequestWithUrl(String basePath) {
        //System.out.println(basePath);
        requestSpecification.contentType(ContentType.JSON).basePath(basePath);
        response=requestSpecification.when().get();
    }

    @Then("status code for get request {string}")
    public void statusCodeForGetRequest(String respnseCode) {
       // System.out.println(response);
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(Integer.parseInt(respnseCode));
    }


}
