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

    /** // get all customers
    public static void main(String[] args){
        Response response = given()
            .header("content-type", "application/json")
            .auth().basic("token","")
            .params("limit", 3) // this will retrieve up to 3 customers only
            // if i want to add more than one param i can use formParams
            // formParams("limit", 3)
            // formParams("email", "juancar@email.com")
            .get("https://api.stripe.com/v1/customers");

        response.prettyPrint();
        System.out.println("Response code: " + response.statusCode());

    }
     */

    // get a customer by id
    public static void main(String[] args){
        Response response = given()
                .header("content-type", "application/json")
                .header("authorization", "Bearer token")
                .get("https://api.stripe.com/v1/customers/cus_NFMkf6txiLdFvl");

        response.prettyPrint();
        System.out.println("Response code: " + response.statusCode());

    }
}
