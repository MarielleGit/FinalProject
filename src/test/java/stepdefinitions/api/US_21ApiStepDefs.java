package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.US_21.StudentPostPojo;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_21ApiStepDefs {

    StudentPostPojo payload;
    Response response;

    @And("User sets the Url for lesson Save")
    public void userSetsTheUrlForLessonSave() {
        spec.pathParams("first", "lessons", "second", "save");
    }

    @And("sets the payload for lesson Save")
    public void setsThePayloadForLessonSave() {
        payload = new StudentPostPojo(true,10,"swordsmanship");
    }

    @And("sends POST request and get response as a student")
    public void sendsPOSTRequestAndGetResponseAsAStudent() {
        response = given(spec).body(payload).post("{first}/{second}");
    }

    @Then("verifies status code is {int} for the student")
    public void verifiesStatusCodeIsForTheStudent(int code) {
        assertEquals(code, response.statusCode());
    }


}
