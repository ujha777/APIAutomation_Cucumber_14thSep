package steps.definitions;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import module.PayloadManager;

public class CreateBookingTest{
    PayloadManager payloadManager=new PayloadManager();
    public static String BASE_URL="https://restful-booker.herokuapp.com";
    public static RequestSpecification requestSpecification = RestAssured.given().baseUri(BASE_URL);
    public static Response response;
    public static ValidatableResponse validatableResponse;
    @Given("create a booking with url {string}")
    public void createABookingWithUrl(String basePath) throws JsonProcessingException {

        requestSpecification.contentType(ContentType.JSON).basePath(basePath);

        response=requestSpecification.when().body(payloadManager.createPayload()).post();
    }

    @Then("status code for post request {string}")
    public void statusCodeForPostRequest(String respnseCode) {
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(Integer.parseInt(respnseCode));
    }
}
