package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Us24_25.US_24.Actualpojo;
import pojos.Us24_25.US_24.Expectedpojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class Us_24_Stepdefs {

    public static Integer userId;
    public static Integer lessonId;
    Response response;
    Expectedpojo expectedData;
    Actualpojo actualData;
    ObjectMapper objectMapper = new ObjectMapper();

//   Map<String,Object> listOfActualData;



    @And("User gets id of the Teacher with name {string}")
    public void userGetsIdOfTheTeacherWithName(String name) {

        //first of all ı have to take id in my hand dynamically
        spec.pathParams("first","teachers","second","getTeacherByName").queryParam("name",name);

        response = given(spec).get("{first}/{second}");
        List<Integer> idList = response.jsonPath().getList("findAll{it.name=='"+name+"'}.userId");
         userId = idList.get(0);
        System.out.println("userId = " + userId);

//        //secondly ı have to take lessonId in my hand dynamically
//        spec.pathParams("first","lessons","second","getAll");
//       response = given(spec).get("{first}/{second}");
//       List<Integer>lessonIdList = response.jsonPath().getList("findAll{it.lessonName=='Flying'}.lessonId");
//       lessonId =lessonIdList.get(0);
//        System.out.println("lessonId = " + lessonId);

    }

    @And("sets the expected data for Get Teacher By name")
    public void setsTheExpectedDataForGetTeacherByName() {

        expectedData = new Expectedpojo("2013-01-01", "Urfa", "NMkk@gmail.com", "MALE", true, "namık", "Namıkk197", "639-677-3233", "639-77-5399", "Selimm", "Namıkok");
        System.out.println("expectedData = " + expectedData);

    }

    @When("sends GET request and get response for Teacher")
    public void sendsGETRequestAndGetResponseForTeacher() throws JsonProcessingException {
//        spec.pathParams("first", "teachers", "second", "getTeacherByName").queryParam("name", "namık");

//        response = given(spec).get("{first}/{second}");

        String resultList =response.asString();
        System.out.println("resultList = " + resultList);

        // Deserialize JSON array into a list of objects
        List<Actualpojo> pojoList = objectMapper.readValue(resultList, new TypeReference<List<Actualpojo>>() {});

        // Extract the first object from the list
        actualData = pojoList.get(0);

        System.out.println(actualData);

    }

    @Then("verifies status code for teacher is {int}")
    public void verifiesStatusCodeForTeacherIs(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

    @And("verifies response body for Get Teacher By id")
    public void verifiesResponseBodyForGetTeacherById() {
        Assert.assertEquals(expectedData.getBirthDay(), actualData.getBirthDay());
        Assert.assertEquals(expectedData.getBirthPlace(), actualData.getBirthPlace());
        Assert.assertEquals(expectedData.getEmail(), actualData.getEmail());
        Assert.assertEquals(expectedData.getName(), actualData.getName());
        Assert.assertEquals(expectedData.getGender(), actualData.getGender());
        Assert.assertEquals(expectedData.getPhoneNumber(), actualData.getPhoneNumber());
        Assert.assertEquals(expectedData.getSsn(), actualData.getSsn());
        Assert.assertEquals(expectedData.getSurname(), actualData.getSurname());
        Assert.assertEquals(expectedData.getUsername(), actualData.getUsername());
        Assert.assertEquals(expectedData.isIsAdvisorTeacher(), actualData.isAdvisorTeacher());


    }

    @And("User deletes the created Teacher")
    public void userDeletesTheCreatedTeacher() {
        spec.pathParams("first","teachers","second","delete","third",userId);
      response = given(spec).delete("{first}/{second}/{third}");
      Assert.assertEquals(200,response.statusCode());


    }
}



