package stepdefinitions.api;

import baseurl.ManagementonSchool_BaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_07.US07ContactMessagesPOJO;
import pojos.US_07.US07ContactMessagesPOSTPOJO;


import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_07StepDefs {
    public static String email = "vicedean@vicedean.com";

    Response response;
    Statement statement;
    String expectedEmail;
    Connection connection;
    ManagementonSchool_BaseUrl managementonSchoolBaseUrl= new ManagementonSchool_BaseUrl();
    US07ContactMessagesPOJO expectedData ;
    US07ContactMessagesPOSTPOJO payload;
    @And("User sets url for message save")
    public void userSetsUrlForMessageSave() {
        spec.pathParams("first","contactMessages","second","save");
    }




    @And("sets the payload for message")
    public void setsThePayloadForMessage() {
        payload = new US07ContactMessagesPOSTPOJO("vicedean@vicedean.com","school schedule","manager","management issue");

    }

    @When("sends post request and get response from contact Messages")
    public void sendsPostRequestAndGetResponseFromContactMessages() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();

    }

    @And("verifies contact Messages response body")
    public void verifiesContactMessagesResponseBody() {
        US07ContactMessagesPOJO actualData = response.as(US07ContactMessagesPOJO.class);
        assertEquals(payload.getEmail(),actualData.getObject().getEmail());
        assertEquals(payload.getMessage(),actualData.getObject().getMessage());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getSubject(),actualData.getObject().getSubject());

    }

    @Then("verifies status code is {int} for contact messages")
    public void verifiesStatusCodeIsForContactMessages(int code) {
        assertEquals(code,response.statusCode());
    }


    @And("User sets the Url for Get contact By email {string}")
    public void userSetsTheUrlForGetContactByEmail(String email) {
        spec.pathParams("first","contactMessages","second","searchByEmail").
                queryParam("email",email);
    }
    @When("sends get request and get response for contact messages")
    public void sendsGetRequestAndGetResponseForContactMessages() {
        expectedEmail = "vicedean@vicedean.com";


        response = given(spec).get("{first}/{second}");
            response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        List<String> emails= jsonPath.getList("content.findAll{it.email=='"+email+"'}");
        emails.get(0);
        String actualEmail = jsonPath.getString("content.email");

        assertTrue(actualEmail.contains(expectedEmail));
    }

//    @And("sets the expected data for Get contact messages By email")
//    public void setsTheExpectedDataForGetContactMessagesByEmail() {
//        ObjectPOJO innerJSON = new ObjectPOJO("manager","vicedean@vicedean.com","management issue","school schedule","03/29/2024");
//    expectedData = new US07ContactMessagesPOJO(innerJSON,"Con","OK")
//    }

    @And("verifies response body for Get contact messages By email")
    public void verifiesResponseBodyForGetContactMessagesByEmail() {

    }



}
