package apis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static utils.settings.Settings.baseUrl;
import static io.restassured.RestAssured.*;
import static utils.settings.Settings.*;

public class BaseApiTest {
    private static Response response;
    private static RequestSpecification httpRequest;
    private static String srtResponse;

    public static void setBaseUri(){
        RestAssured.baseURI = baseUrl;
    }

    public static RequestSpecification authBanorte(){
        httpRequest = given().auth().oauth(consumerKey,consumerSecret,accessToken, accessTokenSecret);
        return httpRequest;
    }

}
