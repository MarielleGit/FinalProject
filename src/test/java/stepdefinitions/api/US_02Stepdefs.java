package stepdefinitions.api;

import io.cucumber.java.en.And;

import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import pojos.US_02.GuestUserListpojo;
import utilities.WaitUtils;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;


public class US_02Stepdefs {
    GuestUserListpojo payload;
    Response response;
    public static int userId;
    String Id;
    JsonPath json;
    Response response1;



    public static int johnDoeId;



    @When("sends get request and get response for guest user list")
    public void sendsGetRequestAndGetResponseForGuestUserList() {
        spec.pathParams("first", "guestUser", "second", "register");


        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
//
//        WaitUtils.waitFor(3);
//


    }




    @When("user gets the id by using getAll")
    public void userGetsTheIdByUsingGetAll() {

        spec.pathParams("first", "guestUser", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
        List<Integer> listOfID = response.jsonPath().getList("content.findAll{it.username=='Johndoe'}.id");
        System.out.println("listOfID = " + listOfID);
        johnDoeId = listOfID.get(0);
        System.out.println("johnDoeId = " + johnDoeId);

//        json = response.jsonPath();
//        Id = json.getString("object.userId");
//        userId = Integer.valueOf(Id);
//        System.out.println("userId = " + userId);
//

    }
    @And("User delete guest user list By id")
    public void userDeleteGuestUserListById() {
        spec.pathParams("first","guestUser", "second", "delete", "third", johnDoeId);
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

//    @And("User delete guest user list By id")
//    public void userDeleteGuestUserListById() {
//        spec.pathParams("first", "guestUser", "second", "delete", "third", userId);
//        response = given(spec).delete("{first}/{second}/{third}");
//
//        response.then().statusCode(200);
//    }


}
