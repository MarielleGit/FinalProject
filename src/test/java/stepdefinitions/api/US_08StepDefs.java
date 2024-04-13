package stepdefinitions.api;

import baseurl.ManagementonSchool_BaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_08.ObjectPOJO;
import pojos.US_08.US08LessonsPOJO;
import pojos.US_08.US08LessonsPOSTPOJO;


import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_08StepDefs {
    ManagementonSchool_BaseUrl managementonSchoolBaseUrl= new ManagementonSchool_BaseUrl();
public  static int lessonId;
    US08LessonsPOJO expectedData;
    US08LessonsPOJO actualData;
    Response response;
    US08LessonsPOSTPOJO payload;
    ObjectMapper objectMapper = new ObjectMapper();

    @And("User sets the Url for lessons Save")
    public void userSetsTheUrlForLessonsSave() {
        spec.pathParams("first","lessons","second","save");
    }

    @And("sets the payload for lessons")
    public void setsThePayloadForLessons() {
    payload = new US08LessonsPOSTPOJO(true,5,"CPlus");
    }

    @When("sends post request and get response for lessons")
    public void sendsPostRequestAndGetResponseForLessons() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for created lessons")
    public void verifiesStatusCodeIsForCreatedLessons(int code) {
        assertEquals(code,response.statusCode());
    }

    @And("verifies lessons response body")
    public void verifiesLessonsResponseBody() {
        US08LessonsPOJO actualData = response.as(US08LessonsPOJO.class);
        assertEquals(payload.isCompulsory(),actualData.getObject().isCompulsory());
        assertEquals(payload.getLessonName(),actualData.getObject().getLessonName());
        assertEquals(payload.getCreditScore(),actualData.getObject().getCreditScore());
    }

    @And("User gets id of the lessons with lesson name {string}")
    public void userGetsIdOfTheLessonsWithLessonName(String lessonName) {
        spec.pathParams("first","lessons","second","getAll");
        response = given(spec).get("{first}/{second}");
        List<Integer> idList = response.jsonPath().getList("findAll{it.lessonName =='"+lessonName+"'}.lessonId");
        lessonId = idList.get(0);
        System.out.println("lessonID= "+lessonId);

    }

    @And("User sets the Url for Get lessons By id")
    public void userSetsTheUrlForGetLessonsById() {
        spec.pathParams("first","lessons","second","getAllLessonByLessonId").
                queryParam("lessonId",lessonId);

    }

    @And("sets the expected data for Get lessons By id")
    public void setsTheExpectedDataForGetLessonsById(){
    ObjectPOJO innerJson = new ObjectPOJO(lessonId,"CPlus",5,true);
    expectedData =new US08LessonsPOJO(innerJson,"Lesson successfully found","OK");
    }

    @When("sends get request and get response for lesson")
    public void sendsGetRequestAndGetResponseForLesson() throws JsonProcessingException {
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

    @Then("verifies status code is {int} for get lessons")
    public void verifiesStatusCodeIsForGetLessons(int code) {
        assertEquals(code, response.statusCode());
    }

    @And("verifies response body for Get lesson By lesson id")
    public void verifiesResponseBodyForGetLessonByLessonId() throws JsonProcessingException {
//        String resultList =response.asString();
//         System.out.println("resultList = " + resultList);
//        List<US08LessonsPOJO> pojoList = objectMapper.readValue(resultList, new TypeReference<List<US08LessonsPOJO>>() {});
//        actualData = pojoList.get(0);
//
//        System.out.println(actualData);

//        US08LessonsPOJO  actualData= convertJsonToJava(response.asString(), US08LessonsPOJO.class);
//        assertEquals(expectedData.getMessage(),actualData.getMessage());
        spec.pathParams("first", "lessons", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        List<Integer> idList =  response.jsonPath().getList("findAll{it.lessonName == 'CPlus' }.lessonId");
        lessonId = idList.get(0);
        System.out.println("userId = " + lessonId);
    }

    @And("User sets the Url for lessons delete")
    public void userSetsTheUrlForLessonsDelete() {
        spec.pathParams("first","lessons", "second","delete","third",lessonId);
    }

    @When("sends delete request for lessons")
    public void sendsDeleteRequestForLessons() {
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for deleted lessons")
    public void verifiesStatusCodeIsForDeletedLessons(int code) {
        assertEquals(code,response.statusCode());
    }
}
