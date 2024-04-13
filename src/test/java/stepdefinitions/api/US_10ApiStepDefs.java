package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.openqa.selenium.support.ui.Wait;
import pojos.US_10.LessonProgramPojo;
import pojos.US_10.LessonProgramPostPojo;
import pojos.US_11.ObjectPojo;
import utilities.WaitUtils;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_10ApiStepDefs {

    LessonProgramPostPojo payload;
    ObjectPojo objectPojo;
    Response response;
    public int id;
    List<Integer> lessonIdList = List.of(4452);
    LessonProgramPojo actualData;


    @And("User sets the Url to create Lesson Program")
    public void userSetsTheUrlToCreateLessonProgram() {
        WaitUtils.waitFor(2);
        spec.pathParams("first", "lessonPrograms", "second", "save");
    }

    @And("sets the payload to create Lesson Program")
    public void setsThePayloadToCreateLessonProgram() {
        payload = new LessonProgramPostPojo("WEDNESDAY",45,lessonIdList, "10:00","11:00");
    }

    @When("sends POST request and get response for creating Lesson program")
    public void sendsPOSTRequestAndGetResponseForCreatingLessonProgram() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for created lesson program")
    public void verifiesStatusCodeIsForCreatedLessonProgram(int code) {
        assertEquals(code, response.statusCode());
    }

    @And("verifies response body for creating lesson program")
    public void verifiesResponseBodyForCreatingLessonProgram() {
        LessonProgramPojo actualData = response.as(LessonProgramPojo.class);

        assertTrue(actualData.getMessage().contains("Created Lesson Program"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));
        id = actualData.getObject().getLessonProgramId();
        System.out.println(id);
    }

    @And("User deletes the created lesson program")
    public void userDeletesTheCreatedLessonProgram() {
        spec.pathParams("first","lessonPrograms", "second", "delete", "third", id);
        response = given(spec).delete("{first}/{second}/{third}");
    }

    @Then("verifies status code is {int} for deleted lesson")
    public void verifiesStatusCodeIsForDeletedLesson(int code) {
        assertEquals(code, response.statusCode());
    }
}
