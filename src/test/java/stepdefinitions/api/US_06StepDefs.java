package stepdefinitions.api;

import baseurl.ManagementonSchool_BaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_06.US_06ObjectPojo;
import pojos.US_06.US_06ViceDeanPojo;
import pojos.US_06.US_06ViceDeanPostPojo;


import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.setUp;
import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US_06StepDefs {
    US_06ViceDeanPostPojo payload;
    Response response;
   public static US_06ObjectPojo innerJson;
   public static int userId;
    US_06ViceDeanPojo expectedData;
    ManagementonSchool_BaseUrl managementonSchoolBaseUrl= new ManagementonSchool_BaseUrl();
    @Given("User is authorized as {string} for US_06")
    public void userIsAuthorizedAsForUS_06(String role) {
      role =role.trim().toLowerCase();
    switch (role){
        case "admin":
            setUp("AdminBatch197","Batch197+");
            break;
        case "dean":
            setUp("DeanBatch197","DeanBatch197");
            break;
         case"vice dean":
             setUp("ViceDeanEmre","ViceDeanEmre1");
             break;
          case "teacher":
              setUp("TeacherBatch197","TeacherBatch197");
              break;
        default:
            System.out.println("please provide valid credential for your role");
      }
     }
    @And("User sets the Url for Vice Dean Save")
    public void userSetsTheUrlForViceDeanSave() {
        spec.pathParams("first","vicedean", "second","save");

    }

    @And("sets the payload for Vice Dean")
    public void setsThePayloadForViceDean() {
        payload = new US_06ViceDeanPostPojo("1990-10-10", "Ankara", "ViceDean1000", "445-412-1039", "MALE", "last", "Naim", "695-11-2039", "ViceDean1000");
    }

    @When("sends post request and get response")
    public void sendsPostRequestAndGetResponse() {
         response = given(spec).body(payload).post("{first}/{second}");
         response.prettyPrint();
    }

    @Then("verifies status code is {int} for US_06")
    public void verifiesStatusCodeIsForUS_06(int code) {
        assertEquals(code,response.statusCode());
    }

    @And("verifies ViceDean response body")
    public void verifiesViceDeanResponseBody() {
     US_06ViceDeanPojo actualData= response.as(US_06ViceDeanPojo.class);
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
    }


    @And("User gets id of the ViceDean with username {string}")
    public void userGetsIdOfTheViceDeanWithUsername(String username) {
        spec.pathParams("first","vicedean","second","getAll");
       response = given(spec).get("{first}/{second}");
    List<Integer> idList= response.jsonPath().getList("findAll{it.username =='"+username+"'}.userId" );
    userId = idList.get(0);
        System.out.println("userId = "+ userId);
    }

    @And("User sets the Url for Get ViceDean By id")
    public void userSetsTheUrlForGetViceDeanById() {
        spec.pathParams("first","vicedean","second","getViceDeanById","third",userId);
    }

    @And("sets the expected data for Get ViceDean By id")
    public void setsTheExpectedDataForGetViceDeanById() {
         innerJson = new US_06ObjectPojo("1990-10-10","Ankara" ,"445-412-1039", "MALE", "last","Naim",userId, "ViceDean1000","695-11-2039");
        expectedData = new US_06ViceDeanPojo("OK","Vice dean successfully found",innerJson);
    }

    @When("sends get request and get response")
    public void sendsGetRequestAndGetResponse() {

        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @And("verifies response body for Get ViceDean By id")
    public void verifiesResponseBodyForGetViceDeanById() {
       US_06ViceDeanPojo actualData = response.as(US_06ViceDeanPojo.class);
       assertEquals(expectedData.getObject().getBirthDay(), actualData.getObject().getBirthDay());

    }

    @And("User deletes the created ViceDean")
    public void userDeletesTheCreatedViceDean() {
        spec.pathParams("first","vicedean","second","delete","third",userId);
        response = given(spec).delete("{first}/{second}/{third}");
    response.then().statusCode(200);
    }
}
