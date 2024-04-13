package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_22_Pojos.AdminExpectedDataPojo;
import utilities.WaitUtils;

import java.util.Objects;
import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static stepdefinitions.ui.US_22_StepDefs.*;

public class US_22_AdminValidation {
    AdminExpectedDataPojo adminExpectedData;
    public static Integer userId;
    String Id;
    static String createdAdminUsername;
    static String createdAdminSsn;
    static String createdAdminName;
    static String createdAdminSurname;
    static String createdAdminbirthDay;
    static String createdAdminbirthPlace;
    static String createdAdminphoneNumber;
    static String createdAdmingender;
    static String createdAdminbuilt_in;
    Response response;
    @Given("admin sets the url to send the getAll request for admins")
    public void adminSetsTheUrlToSendTheGetAllRequestForAdmins() {

        spec.pathParams("first","admin","second","getAll").queryParams("page","0","size","200","sort","name","type","desc");
        WaitUtils.waitFor(3);
    }

    @And("admin sends GET request for all admins")
    public void adminSendsGETRequestForAllAdmins() {
        response = given(spec).get("{first}/{second}");
        //response.prettyPrint();
    }

    @And("admin gets the id of new created admin")
    public void adminGetsTheIdOfNewCreatedAdmin() {
        JsonPath json = response.jsonPath();

        for (int i = 0; i <200 ; i++) {
            if (Objects.equals(json.getString("content[" + i + "].username"), Adminusername)){
                Id= json.getString("content["+i+"].id");
                System.out.println("Id = " + Id);
                userId= Integer.valueOf(Id);
                break;
            }
        }

    }



    @And("admin sets the expected data for admin")
    public void adminSetsTheExpectedDataForAdmin() {
        adminExpectedData= new AdminExpectedDataPojo("2000-01-01","Kabul",true,"MALE","Hekmat","Hekmat123",Adminphonenumber,Adminssn,"Amini",Adminusername);
    }



    @And("admin verify response body of created admin")
    public void adminVerifyResponseBodyOfCreatedAdmin() {
        Assert.assertEquals(adminExpectedData.getBirthDay(),createdAdminbirthDay);
        Assert.assertEquals(adminExpectedData.getGender(),createdAdmingender);
        Assert.assertEquals(adminExpectedData.getName(),createdAdminName);
        Assert.assertEquals(adminExpectedData.getSsn(),createdAdminSsn);
        Assert.assertEquals(adminExpectedData.getPhoneNumber(),createdAdminphoneNumber);
        Assert.assertEquals(adminExpectedData.getUsername(),createdAdminUsername);
        Assert.assertEquals(adminExpectedData.getBirthPlace(),createdAdminbirthPlace);
        Assert.assertEquals(adminExpectedData.getSurname(),createdAdminSurname);
        //Assert.assertEquals(adminExpectedData.isBuiltIn(),createdAdminbuilt_in);

    }

    @When("admin deletes the created admin by id")
    public void adminDeletesTheCreatedAdminById() {
        spec.pathParams("first","admin", "second", "delete", "third", userId);
        response = given(spec).delete("{first}/{second}/{third}");
        response.then().statusCode(200);
    }

    @Given("admin sends GetAll request and selects the created admin")
    public void adminSendsGetAllRequestAndSelectsTheCreatedAdmin() {
        //spec.pathParams("first","admin","second","getAll").queryParams("page","0","size","200","sort","name","type","desc");
        //response = given(spec).get("{first}/{second}");
        JsonPath json = response.jsonPath();

        for (int i = 0; i <200 ; i++) {
            if (Objects.equals(json.getString("content[" + i + "].username"), Adminusername)){
                createdAdminUsername=json.getString("content["+i+"].username");
                createdAdminSsn=json.getString("content["+i+"].ssn");
                createdAdminName=json.getString("content["+i+"].name");
                createdAdminSurname=json.getString("content["+i+"].surname");
                createdAdminbirthDay=json.getString("content["+i+"].birthDay");
                createdAdminbirthPlace=json.getString("content["+i+"].birthPlace");
                createdAdminphoneNumber=json.getString("content["+i+"].phoneNumber");
                createdAdmingender=json.getString("content["+i+"].gender");
                createdAdminbuilt_in=json.getString("content["+i+"].built_in");
                break;
            }

        }

    }


}