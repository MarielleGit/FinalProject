package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_19.MeetPostpojo;
import pojos.US_20_Pojos.MeetEditResponsePojo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_19_StepDefs.description;
import static stepdefinitions.api.US_19_StepDefs.studentId;
import static utilities.US_20_MeetUpdateJsonPlaceHolderMapper.jsonPlaceHolderMapper;
public class US_20_StepDefs {
    Response response;
    public static Integer meetId;
    static String actualDate;
    static String actualdescription;
    MeetPostpojo payload;
    //public static Map<String, Object> payload;

    ObjectMapper objectMapper = new ObjectMapper();
    public static String date = "2025-01-24";


    @When("gets id of the created meeting")
    public void getsIdOfTheCreatedMeeting() throws JsonProcessingException {
        spec.pathParams("first", "meet", "second", "getAll");
        response = given(spec).get("{first}/{second}");

        String resultList = response.asString();

        List<MeetEditResponsePojo> pojoList = objectMapper.readValue(resultList, new TypeReference<List<MeetEditResponsePojo>>() {});

        for (MeetEditResponsePojo getIdLoop : pojoList)
        {
            if (Objects.equals(getIdLoop.getDescription(), description)) {
                meetId = getIdLoop.getId();
                System.out.println(meetId);
                actualDate=getIdLoop.getDate();
                actualdescription=getIdLoop.getDescription();
            }
        }

        //List<Integer> idList = response.jsonPath().getList("findAll{it.description=='Meet Bahar'}.id");
        //meetId = idList.get(0);
        //System.out.println("id List : " + idList);
    }


    @And("sets the Url for updating meeting with students")
    public void setsTheUrlForUpdatingMeetingWithStudents() {
        spec.pathParams("first","meet","second","update", "third", meetId);
    }


    @And("sets the expected data to update the meeting")
    public void setsTheExpectedDataToUpdateTheMeeting() {

        payload = new MeetPostpojo(date, description, "13:00", "14:00",studentId);
        // payload = jsonPlaceHolderMapper(date, description, "13:00","14:00",studentId);
    }


    @And("updates the meeting with id")
    public void updatesTheMeetingWithId() {
        response = given(spec).when().body(payload).put("{first}/{second}/{third}"); // Serialization
        response.prettyPrint();
    }

    @Then("verifies response body for updating meeting")
    public void verifiesResponseBodyForUpdatingMeeting() {
        assertEquals(200,response.statusCode());
        assertEquals(date,actualDate);
        assertEquals(description,actualdescription);

    }


    @When("teacher deletes the meeting by id")
    public void teacherDeletesTheMeetingById() {
        spec.pathParams("first","meet", "second", "delete", "third", meetId);
        response = given(spec).delete("{first}/{second}/{third}");
        response.then().statusCode(200);

    }


}
