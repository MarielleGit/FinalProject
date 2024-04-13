package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_23_Pojos.ViceDeanActualDataPojo;
import pojos.US_23_Pojos.ViceDeanExpectedDataPojo;

import java.util.List;
import java.util.Objects;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static stepdefinitions.ui.US_22_StepDefs.Adminusername;
import static stepdefinitions.ui.US_23_StepDefs.*;

public class US_23_ViceDeanValidation {
    public static Integer userId;
    ViceDeanExpectedDataPojo viceDeanExpectedData;
    ViceDeanActualDataPojo viceDeanActualData;
    Response response;
    String Id;
    @When("admin sets the url to send the getAll request for vice deans")
    public void adminSetsTheUrlToSendTheGetAllRequestForViceDeans() {

        spec.pathParams("first", "vicedean", "second", "getAll");
    }

    @And("admin sends GET request for all vice deans")
    public void adminSendsGETRequestForAllViceDeans() {
        response = given(spec).get("{first}/{second}");
        //response.prettyPrint();
    }

    @And("admin gets the id of new created vice dean")
    public void adminGetsTheIdOfNewCreatedViceDean() {
        List<Integer> idList =  response.jsonPath().getList("findAll{it.username == '"+vicedeanUsername+"' }.userId");
        userId = idList.get(0);
        System.out.println("userId = " + userId);
    }

    @When("admin sends GET request for the vice dean by its id")
    public void adminSendsGETRequestForTheViceDeanByItsId() {

        spec.pathParams("first","vicedean","second","getViceDeanById","third",userId);
        response = given(spec).get("{first}/{second}/{third}");
        //response.prettyPrint();
    }

    @And("admin sets the expected data for vice dean")
    public void adminSetsTheExpectedDataForViceDean() {
        viceDeanExpectedData= new ViceDeanExpectedDataPojo("2000-01-01","Kabul","MALE","Hekmat","Hekmat123",vicedeanphoneNumber,vicedeanSsn,"Amini",vicedeanUsername);
    }

    @And("admin gets the response body for vice dean as actual data")
    public void adminGetsTheResponseBodyForViceDeanAsActualData() {
        viceDeanActualData = response.as(ViceDeanActualDataPojo.class);

    }

    @And("admin verify response body of created vice dean")
    public void adminVerifyResponseBodyOfCreatedViceDean() {
     //   response.then().statusCode(200);
        Assert.assertEquals(viceDeanExpectedData.getBirthDay(),viceDeanActualData.getObject().getBirthDay());
        Assert.assertEquals(viceDeanExpectedData.getGender(),viceDeanActualData.getObject().getGender());
        Assert.assertEquals(viceDeanExpectedData.getName(),viceDeanActualData.getObject().getName());
        Assert.assertEquals(viceDeanExpectedData.getSsn(),viceDeanActualData.getObject().getSsn());
        Assert.assertEquals(viceDeanExpectedData.getPhoneNumber(),viceDeanActualData.getObject().getPhoneNumber());
        Assert.assertEquals(viceDeanExpectedData.getUsername(),viceDeanActualData.getObject().getUsername());
        Assert.assertEquals(viceDeanExpectedData.getBirthPlace(),viceDeanActualData.getObject().getBirthPlace());
        Assert.assertEquals(viceDeanExpectedData.getSurname(),viceDeanActualData.getObject().getSurname());


    }

    @When("admin deletes the created vice dean by id")
    public void adminDeletesTheCreatedViceDeanById() {

        spec.pathParams("first","vicedean", "second", "delete", "third", userId);
        response = given(spec).delete("{first}/{second}/{third}");
       response.then().statusCode(200);
    }
}
