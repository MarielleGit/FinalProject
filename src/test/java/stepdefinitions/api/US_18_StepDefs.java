package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_17.StudentInfoExpectedDataPojo;
import utilities.WaitUtils;

import static baseurl.ManagementonSchool_BaseUrl.spec;

import static io.restassured.RestAssured.given;
import static stepdefinitions.api.US_17_StepDefs.studentInfoId;



public class US_18_StepDefs {
    
    Response response;
    StudentInfoExpectedDataPojo updatedData;
    @When("Teacher sets the Url for GetId Student info for teacher")
    public void teacherSetsTheUrlForGetIdStudentInfoForTeacher() {
        spec.pathParams("first","studentInfo","second","get","third",studentInfoId);
    }
    
    @And("Teacher sets the expected data for to updated Student info")
    public void teacherSetsTheExpectedDataForToUpdatedStudentInfo() {
        updatedData= new StudentInfoExpectedDataPojo(10,47,79.0,"hello world, this is a test",4451,40.0,3361);
        WaitUtils.waitFor(2);
    }
    
    @And("Teacher sends GETId request and get response")
    public void teacherSendsGETIdRequestAndGetResponse() {
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    
    @And("Teacher set the url to update Student info")
    public void teacherSetTheUrlToUpdateStudentInfo() {
        spec.pathParams("first","studentInfo","second","update","third",studentInfoId);
        WaitUtils.waitFor(2);
        
        
    }
    
    @And("Teacher set update request for student info")
    public void teacherSetUpdateRequestForStudentInfo() {
        WaitUtils.waitFor(2);
        response=given(spec).when().body(updatedData).put("{first}/{second}/{third}");
        response.prettyPrint();
        
    }
    
    @Then("Teacher verifies new body for update")
    public void teacherVerifiesNewBodyForUpdate() {
        String expectedMidterm=String.valueOf(updatedData.getMidtermExam());
        String expectedfinalExam=String.valueOf(updatedData.getFinalExam());
        String expectedAbseentee=String.valueOf(updatedData.getAbsentee());
        String expectedLessonId=String.valueOf(updatedData.getLessonId());
        String expectedStudentId=String.valueOf(updatedData.getStudentId());
        String expectedEducationTermId=String.valueOf(updatedData.getEducationTermId());
        JsonPath actualData=response.jsonPath();
        
        Assert.assertEquals(expectedMidterm,actualData.getString("object.midtermExam"));
        Assert.assertEquals(expectedfinalExam,actualData.getString("object.finalExam"));
        Assert.assertEquals(expectedAbseentee,actualData.getString("object.absentee"));
        Assert.assertEquals(updatedData.getInfoNote(),actualData.getString("object.infoNote"));
        Assert.assertEquals(expectedLessonId,actualData.getString("object.lessonId"));
        Assert.assertEquals(expectedStudentId,actualData.getString("object.studentResponse.userId"));
        Assert.assertEquals(expectedEducationTermId,actualData.getString("object.educationTermId"));
    }
}
