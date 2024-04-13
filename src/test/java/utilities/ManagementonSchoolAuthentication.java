
package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ManagementonSchoolAuthentication {

//    public static void main(String[] args) {
//        System.out.println("Token = " + generateToken());
//    }

    public static String generateToken(String userName, String password) {

        String url = "https://managementonschools.com/app/auth/login";

        String payload = "{\n" +
                "  \"password\": \"" + password + "\",\n" +
                "  \"username\": \"" + userName + "\"\n" +
                "}";

        Response response = given().body(payload).contentType(ContentType.JSON).when().post(url);

        return response.jsonPath().getString("token");

    }



}

// {"password": "Mark.123","rememberMe": true,"username": "mark_twain"}

