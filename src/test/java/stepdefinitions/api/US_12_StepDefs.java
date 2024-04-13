package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_12.*;
import java.util.List;
import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_12_StepDefs {

    Response response;
    Lessonpojo payload;

    int unAssignedLessonProgId;

    @Then("sets the url for getAllUnassignedLessons to find an unassigned lessons")
    public void setsTheUrlForGetAllUnassignedLessons() {
        spec.pathParams("first", "lessonPrograms", "second", "getAllUnassigned");
        response = given(spec).get("{first}/{second}");

        List<Integer> unAssignedlessonProgramId =  response.jsonPath().getList("findAll { it.lessonProgramId}.lessonProgramId");
        System.out.println("unAssignedlessonProgramId = " + unAssignedlessonProgramId);
        unAssignedLessonProgId = unAssignedlessonProgramId.get(0);
        System.out.println("unAssignedLessonProgId = " + unAssignedLessonProgId);
    }
    @And("sets the Url for assigning the lesson to teacher")
    public void setsTheUrlForAssigningTheLessonToTeacher() {
        spec.pathParams("first", "teachers", "second", "chooseLesson");
    }

    @And("sets the payload for assigning the lesson to teacher")
    public void setsThePayloadForAssigningTheLessonToTeacher() {

        List<Integer> lessonProgIdList = List.of(unAssignedLessonProgId);
        payload = new Lessonpojo(lessonProgIdList,5334);
    }

    @When("sends POST request and GETS response for assigning lesson")
    public void sendsPOSTRequestAndGETSResponseForAssigningLesson() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for assigning lesson")
    public void verifiesStatusCodeIsIntForAssigningLesson(int code) {
        assertEquals(code,response.statusCode());
    }


    @And("verifies response body for assigning lesson")
    public void verifiesResponseBodyForAssigningLesson() {
        LessonPostpojo actualData = response.as(LessonPostpojo.class);
        assertTrue(actualData.getMessage().contains("Lesson added to Teacher"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));

    }
}

