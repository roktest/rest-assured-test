package apiTesting;


import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class GetCreatedCustomerByID {

    /**
     * Set authentication
     * basic auth / bearer token using headers
     * request -> set of request specifications
     * response -> do validations
     * content-type
     */

    public static void main(String[] args){
        Response response = given()
            .header("content-type", "application/json")
            .auth().basic("token_from_app","")
            .params("limit", 3) // this will retrieve up to 3 customers only
            .get("https://api.stripe.com/v1/customers");

        response.prettyPrint();
        System.out.println("Response code: " + response.statusCode());

    }

}
