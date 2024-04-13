package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementonSchoolAuthentication.generateToken;

public class RegisterBaseUrl {
    public static RequestSpecification spec_1;
// blabla
    public static void setupRegister(){
        spec_1 = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .setContentType(ContentType.JSON)
                .build();
    }
}
