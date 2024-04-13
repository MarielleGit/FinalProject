package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_19.MeetPostpojo;
import pojos.US_19.MeetResponsePojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_19_StepDefs {

    MeetPostpojo payload;
    public static List<String> studentId = List.of("3631","3653");
    Response response;

    public static String description = "Meet Bahar";

    @And("sets the Url for creating meeting with students")
    public void setsTheUrlForCreatingMeetingWithStudents() {
        spec.pathParams("first","meet","second","save");
    }
    @And("sets the payload to create meeting with students")
    public void setsThePayloadToCreateMeetingWithStudents() {

    payload = new MeetPostpojo("2025-01-24", description, "13:00", "14:00",studentId);

    }

    @When("sends POST request and GETS response for creating meetings")
    public void sendsPOSTRequestAndGETSResponseForCreatingMeetings() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for creating meeting")
    public void verifiesStatusCodeIsForCreatingMeeting(int code) {
        assertEquals(code,response.statusCode());
    }

    @Then("verifies response body for creating meeting")
    public void verifiesResponseBodyForCreatingMeeting() {
        MeetResponsePojo actualData = response.as(MeetResponsePojo.class);
        assertEquals(payload.getDate(),actualData.getObject().getDate());
        assertEquals(payload.getDescription(),actualData.getObject().getDescription());
        //assertEquals(payload.getStartTime(),actualData.getObject().getStartTime());
        //assertEquals(payload.getStopTime(),actualData.getObject().getStopTime());
    }

}
