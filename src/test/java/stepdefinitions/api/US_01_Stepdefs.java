package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_01.GuestUserpojo;

import pojos.US_01.ObjectOutter;
import utilities.WaitUtils;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US_01_Stepdefs {

    GuestUserpojo payload;
    Response response;
    ObjectOutter actualResult;
    Integer id;
    public static String username = "Johndoe";

    public static int userId;

    String Id;


    @And("User sets the Url for guest User")
    public void userSetsTheUrlForGuestUser() {
        spec.pathParams("first", "guestUser", "second", "register");
    }

    @And("sets the payload for guest User")
    public void setsThePayloadForGuestUser() {

        payload = new GuestUserpojo("1978-07-06",
                "New york", "MALE", "John",
                "SecurePwd1", "171-569-5896", "456-89-8569",
                "Doe", username);


    }

    @When("sends POST request and get response for guest user")
    public void sendsPOSTRequestAndGetResponseForGuestUser() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
        WaitUtils.waitFor(3);

        JsonPath json = response.jsonPath();
        Id = json.getString("object.userId");
        userId = Integer.valueOf(Id);
        System.out.println("userId = " + userId);

//        List<Integer> idOfList = response.jsonPath().getList("findAll{it.object.username == '" + username + "'}object.userId");
//        System.out.println("idOfList = " + idOfList);
//        userId = idOfList.get(0);
//        System.out.println("userId = " + userId);

    }


    @And("verifies response body guest user")
    public void verifiesResponseBodyGuestUser() {

        actualResult = response.as(ObjectOutter.class);

        assertEquals(payload.getName(), actualResult.getObject().getName());
        assertEquals(payload.getSurname(), actualResult.getObject().getSurname());
        assertEquals(payload.getBirthPlace(), actualResult.getObject().getBirthPlace());
        assertEquals(payload.getPhoneNumber(), actualResult.getObject().getPhoneNumber());
        assertEquals(payload.getGender(), actualResult.getObject().getGender());
        assertEquals(payload.getBirthDay(), actualResult.getObject().getBirthDay());
        assertEquals(payload.getSsn(), actualResult.getObject().getSsn());
        assertEquals(payload.getUsername(), actualResult.getObject().getUsername());
        assertTrue(actualResult.getMessage().contains("Guest User registered"));
        assertTrue(actualResult.getHttpStatus().contains("CREATED"));


    }

    @Then("verifies status code is {int} for guest user")
    public void verifiesStatusCodeIsForGuestUser(int code) {
        assertEquals(code, response.statusCode());

    }


    //DELETE
    @And("User sets the Url for delete guest user By id")
    public void userSetsTheUrlForDeleteGuestUserById() {

        spec.pathParams("first", "guestUser", "second", "delete", "third", userId); // url
        response = given(spec).delete("{first}/{second}/{third}"); // request


    }

    @And("User deletes the created guest user")
    public void userDeletesTheCreatedGuestUser() {
      //  assertEquals(200, response.statusCode());
    }


}
