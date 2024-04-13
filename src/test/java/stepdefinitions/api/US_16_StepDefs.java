
package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_16.ContactMesasgePostPojo;
import pojos.US_16.ContactMessageActualDataPojo;
import utilities.WaitUtils;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_16_StepDefs {

    ContactMesasgePostPojo payload;
    //ContactMessageActualDataPojo actualData;

    Response response;
    JsonPath actualData;
    @When("User sets the Url to post message")
    public void userSetsTheUrlToPostMessage() {

        spec.pathParams("first","contactMessages","second","save");

    }

    @And("User sets the payload for message")
    public void userSetsThePayloadForMessage() {
        payload=new ContactMesasgePostPojo("Kadıbaba@gmail.com","Message gönderilmiştir.","Kadı","Baba");
                }

    @When("User sends post request and get response")
    public void userSendsPostRequestAndGetResponse() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
        WaitUtils.waitFor(3);

    }

    @Then("User verifies status code is {int}")
    public void userVerifiesStatusCodeIs(int  code) {
        assertEquals(code, response.statusCode());
    }


    @And("The Vice Dean sets the Url to get message by email")
    public void theViceDeanSetsTheUrlToGetMessageByEmail() {
        WaitUtils.waitFor(1);
        spec.pathParams("first","contactMessages","second","searchByEmail")
                .queryParams("email","Kadıbaba@gmail.com","page","0","size","10","sort","date","type","desc");
        WaitUtils.waitFor(1);
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @And("The Vice Dean sets the payload for message")
    public void theViceDeanSetsThePayloadForMessage() {
        payload=new ContactMesasgePostPojo("Kadıbaba@gmail.com","Message gönderilmiştir.","Kadı","Baba");
    }

    @When("The Vice Dean sends get request by email")
    public void theViceDeanSendsGetRequestByEmail() {

       // actualData=response.as(ContactMessageActualDataPojo.class);
        actualData = response.jsonPath();



    }





    @And("The Vice Dean verifies response body")
    public void theViceDeanVerifiesResponseBody() {

        assertEquals(payload.getMessage(), actualData.getString("content[0].message"));
        assertEquals(payload.getEmail(), actualData.getString("content[0].email"));
        assertEquals(payload.getName(), actualData.getString("content[0].name"));
        assertEquals(payload.getSubject(), actualData.getString("content[0].subject"));


    }
}


























