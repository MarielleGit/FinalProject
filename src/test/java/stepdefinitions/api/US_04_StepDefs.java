package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.bouncycastle.cms.jcajce.JcaX509CertSelectorConverter;
import pojos.Us4_5.DeanPojo;
import pojos.Us4_5.DeanPostPojo;
import pojos.Us4_5.ObjectPojo;
import utilities.WaitUtils;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.setUp;
import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.ui.US_04_StepDefs.*;

public class US_04_StepDefs {



    DeanPostPojo payload;
    Response response;
    public static ObjectPojo objectPojo;
    public static int userId;
    public static DeanPojo expectedData;


    @Given("User is authorized as {string}")
    public void userIsAuthorizedAs(String role) {
        role = role.trim().toLowerCase();

        switch (role){
            case "admin":
                setUp("AdminBatch197", "Batch197+");
                break;
            case "dean":
                setUp("DeanEmre","DeanEmre1");
                break;
            case "vicedean":
                setUp("ViceCaptainZoro","Nikolas2022!!");
                break;
            case "teacher":
                setUp("SemaTeacher","SemaTeacher1");
                break;
            case "student":
                setUp("CaptainKid","Nikolas2022!!");
                break;
            case "teacheribrahim":
                setUp("İbrahim3","ibrahim33A");
                break;
            default:
                System.out.println("Please provide valid credentials for your role");
        }
    }

    @And("User sets the Url for Dean Save")
    public void userSetsTheUrlForDeanSave() {
        spec.pathParams("first", "dean", "second", "save");
    }

    @And("sets the payload for Dean Save")
    public void setsThePayloadForDeanSave() {
        payload = new DeanPostPojo("1990-09-24", "TR", "MALE", "Ali", "Ali_3434", "226-662-2261", "882-22-2881", "Can", "AliCancan");
//        System.out.println("payload = " + payload);
    }

    @When("sends POST request and get response")
    public void sendsPOSTRequestAndGetResponse() {
        response = given(spec).body(payload).post("{first}/{second}");
       // response.prettyPrint();
    }

    @Then("verifies status code is {int}")
    public void verifiesStatusCodeIs(int code) {
        assertEquals(code, response.statusCode());
    }

    @And("verifies response body")
    public void verifiesResponseBody() {
        DeanPojo actualData = response.as(DeanPojo.class);

        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
        assertEquals("Dean Saved",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());

//        //2. way for assertion
//        response.
//                then().
//                body("object.username",equalTo(payload.getUsername()),
//                        "object.name",equalTo(payload.getName()),
//                        "message",equalTo("Dean Saved"),
//                        "httpStatus",equalTo("CREATED"));

//        //3. way for assertion
//        JsonPath jsonPath = response.jsonPath();
//        assertEquals(payload.getUsername(),jsonPath.getString("object.username"));
//        assertEquals(payload.getPhoneNumber(),jsonPath.getString("object.phoneNumber"));
    }

    @And("User gets id of the Dean with username {string}")
    public void userGetsIdOfTheDeanWithUsername(String username) {
        WaitUtils.waitFor(3);
        spec.pathParams("first", "dean", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        List<Integer> idList =  response.jsonPath().getList("findAll{it.username == '"+username+"' }.userId");
        userId = idList.get(0);
     //   System.out.println("userId = " + userId);
    }

    @And("User sets the Url for Get Dean By id")
    public void userSetsTheUrlForGetDeanById() {
        spec.pathParams("first","dean", "second", "getManagerById", "third", userId);
    }

    @And("sets the expected data for Get Dean By id")
    public void setsTheExpectedDataForGetDeanById() {
        objectPojo = new ObjectPojo(userId, "AliCancan", "Ali", "Can", "1990-09-24", "882-22-2881", "TR", "226-662-2261", "MALE");
        expectedData = new DeanPojo(objectPojo, "Dean successfully found", "OK");

    }

    @When("sends GET request and get response")
    public void sendsGETRequestAndGetResponse() {
        response = given(spec).get("{first}/{second}/{third}");
        //    response.prettyPrint();
    }

    @And("verifies response body for Get Dean By id")
    public void verifiesResponseBodyForGetDeanById() {
        DeanPojo actualData = response.as(DeanPojo.class);

        assertEquals(expectedData.getObject().getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getUsername(), actualData.getObject().getUsername());
        assertEquals(expectedData.getObject().getName(), actualData.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getObject().getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getObject().getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getObject().getUserId(), actualData.getObject().getUserId());

        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
    }

    @And("User deletes the created dean")
    public void userDeletesTheCreatedDean() {
        spec.pathParams("first","dean", "second", "delete", "third", userId);
        response = given(spec).delete("{first}/{second}/{third}");

        response.then().statusCode(200);
    }
}
