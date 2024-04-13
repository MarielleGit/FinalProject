package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.US_09.LessonPojo;
import pojos.US_09.LessonPostPojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class US_09_StepDefs {
    LessonPostPojo payload;
    Response response;
    public static int userId;
    @And("Vice Dean sets the Url to add Lesson")
    public void viceDeanSetsTheUrlToAddLesson() {
        spec.pathParams("first", "lessons", "second", "save");}

    @And("Vice Dean sets the payload to add Lesson")
    public void viceDeanSetsThePayloadToAddLesson() {
        payload = new LessonPostPojo( true, 50, "newLesson");
    }

    @And("Vice Dean sends POST request and get response")
    public void viceDeanSendsPOSTRequestAndGetResponse() {
        response = given(spec).body(payload).post("{first}/{second}");
     //   response.prettyPrint();
    }

    @Then("verifies status code is {int} for added Lesson")
    public void verifiesStatusCodeIsForAddedLesson(int code) {
        assertEquals(code, response.statusCode());
    }
    @And("Vice Dean verifies response body")
    public void viceDeanVerifiesResponseBody() {
        LessonPojo actualData = response.as(LessonPojo.class);

        assertEquals(payload.isCompulsory(),actualData.getObject().isCompulsory());
        assertEquals(payload.getCreditScore(),actualData.getObject().getCreditScore());
        assertEquals(payload.getLessonName(),actualData.getObject().getLessonName());
        assertTrue(actualData.getMessage().contains("Lesson Created"));
        assertTrue(actualData.getHttpStatus().contains("OK"));
    }
    @And("Vice Dean gets id of the added Lesson")
    public void viceDeanGetsIdOfTheAddedLesson() {
        spec.pathParams("first", "lessons", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        List<Integer> idList =  response.jsonPath().getList("findAll{it.lessonName == 'newLesson' }.lessonId");
        userId = idList.get(0);
     //   System.out.println("userId = " + userId);
    }
    @And("Vice Dean sets the Url for Get Lesson By id")
    public void viceDeanSetsTheUrlForGetLessonById() {
        spec.pathParams("first", "lessons", "second", "getAllLessonByLessonId","third", userId);
        response = given(spec).get("{first}/{second}/{third}");
    }
    @And("Vice Dean deletes the added Lesson")
    public void viceDeanDeletesTheAddedLesson() {
        spec.pathParams("first","lessons", "second", "delete", "third", userId);
        response = given(spec).delete("{first}/{second}/{third}");

        response.then().statusCode(200);
    }
}
