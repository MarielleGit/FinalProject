package baseurl;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementonSchoolAuthentication.generateToken;


public class ManagementonSchool_BaseUrl {

    public static RequestSpecification spec;



    public static void setUp(String userName, String password){
        String baseUrl = "https://managementonschools.com/app";

        spec = new RequestSpecBuilder()

                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken(userName,password))
                .build();
}

}




