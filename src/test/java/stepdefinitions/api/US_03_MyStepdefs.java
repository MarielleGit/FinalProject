package stepdefinitions.api;

import baseurl.ManagementonSchool_BaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_03.GetActuallDatapojo;
import pojos.US_03.Outerpojo;
import pojos.US_03.Payloadpojo;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static baseurl.RegisterBaseUrl.setupRegister;
import static baseurl.RegisterBaseUrl.spec_1;
import static io.restassured.RestAssured.given;
import static org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment.setup;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_03_MyStepdefs {

    Payloadpojo payload;
    Response response;
    Outerpojo actuallData;

    Payloadpojo expectedData;

    GetActuallDatapojo actuallData1;

    Response response1;


    //post
    @Given("User sets the Url for contact message")
    public void userSetsTheUrlForContactMessage() {
        spec_1.pathParams("first", "contactMessages", "second", "save");
    }

    @And("user sets the payload for contact message")
    public void userSetsThePayloadForContactMessage() {
        payload = new Payloadpojo("admin1@gmail.com", "about team management", "Admin", "final project");

    }

    @And("user sends POST request and get response for contact message")
    public void userSendsPOSTRequestAndGetResponseForContactMessage() {
        response = given(spec_1).body(payload).post("{first}/{second}"); // json
        actuallData = response.as(Outerpojo.class);
    }

    @Then("verifies status code is {int} for contact message")
    public void verifiesStatusCodeIsForContactMessage(int statuscode) {
        assertEquals(statuscode, response.statusCode());

    }

    @And("verifies response body for contact message")
    public void verifiesResponseBodyForContactMessage() {
        assertEquals(payload.getMessage(), actuallData.getObject().getMessage());
        assertEquals(payload.getName(), actuallData.getObject().getName());
        assertEquals(payload.getSubject(), actuallData.getObject().getSubject());
        assertEquals(payload.getEmail(), actuallData.getObject().getEmail());

        assertEquals("Contact Message Created Successfully", actuallData.getMessage());

    }


    // GetAll
    @Given("admin sets the Url for contact messages getAll")
    public void adminSetsTheUrlForContactMessagesGetAll() {
        spec.pathParams("first", "contactMessages", "second", "getAll").queryParams("sort", "", "Date", "", "type", "", "desc", "");
    }

    @When("admin sets the expected data for contact messages getAll")
    public void adminSetsTheExpectedDataForContactMessagesGetAll() {
        expectedData = new Payloadpojo("admin1@gmail.com", "about team management", "Admin", "final project");
    }

    @And("admin sent the request and get the respond for contact messages getAll")
    public void adminSentTheRequestAndGetTheRespondForContactMessagesGetAll() {
        response1 = given(spec).body(expectedData).get("{first}/{second}");
        actuallData1 = response1.as(GetActuallDatapojo.class);

    }

    @Then("admin verifies status code is {int} for contact message getAll")
    public void adminVerifiesStatusCodeIsForContactMessageGetAll(int statuscode) {
        assertEquals(statuscode, response1.statusCode());
    }

    @And("verifies response body for contact message for getAll")
    public void verifiesResponseBodyForContactMessageForGetAll() {

        assertEquals(expectedData.getMessage(), actuallData1.getContent().get(7).getMessage());
        assertEquals(expectedData.getEmail(), actuallData1.getContent().get(7).getEmail());
        assertEquals(expectedData.getName(), actuallData1.getContent().get(7).getName());
        assertEquals(expectedData.getSubject(), actuallData1.getContent().get(7).getSubject());

    }
}
