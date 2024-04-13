package stepdefinitions.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import pojos.US_11.LessonNamePojo;
import pojos.US_11.LessonsProgranPojo;
import pojos.US_11.TeachersPojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_11ApiStepDefs {

    Response response;

    public static String lessonName;
    int id;

    @Given("Vice Dean sends GetAll request For Lessons Program")
    public void viceDeanSendsGetAllRequestForLessonsProgram() {
        spec.pathParams("first", "lessonPrograms", "second", "getAll");
    }

    @And("vice dean gets the lesson program and assert")
    public void viceDeanGetsTheLessonProgramAndAssert() {
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

    @And("User sends delete request for lesson program")
    public void userSendsDeleteRequestForLessonProgram() {
        id= Faker.instance().number().numberBetween(3964,4600);
        spec.pathParams("first", "lessonPrograms","second","delete","third",id);
        response = given(spec).when().delete("/{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for deleted program lesson")
    public void verifiesStatusCodeIsForDeletedProgramLesson(int code) {
        assertEquals(code, response.statusCode());
    }


}
