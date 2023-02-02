package apiTesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateCustomer {


    public static void main(String[] args) {

        /**
         * Some examples on how to form the request:
         *
         * EXAMPLE 1
         * //in this case i wrote the entire thing manually... even the \ to make a string compatible with json format
         * String theWorstWayT_manuallyFormAJson = "{\"name\":\"estela maris\",\"email\":\"estela_maris@email.com\"}";
         *
         * Response response = given()
         *                     .contentType(ContentType.JSON)
         *                     .body(theWorstWayT_manuallyFormAJson)
         *                     .post("https://api.stripe.com/v1/customers");
         *
         *
         * EXAMPLE 2
         * Response response = given()
         *                     .auth().basic("sk_test_51MUrXjFB2jtqRv4qT22iWZ3FP5OGuqoGkbcl8IUiSZK4ZaF3PZlT71EJsXnoaEaNtNDd9eugn3goHMoeoAONnhON00afPOq3qh", "")
         *                     .formParams("name", "estela maris")
         *                     .formParams("email", "estela_maris@email.com")
         *                     .formParams("description", "this customer is one of my neighbours, she has a cat which is always messing up with pots")
         *                     .post("https://api.stripe.com/v1/customers");
         */

        // EXAMPLE 3: changed to reqres api
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("email", "eve.holt@reqres.in");
        hashMap.put("password", "pistol");


        Response response = given()
                            .contentType(ContentType.JSON)
                            .body(hashMap)
                            .post("https://reqres.in/api/register");

        response.prettyPrint();
        System.out.println("Response status code: " + response.statusCode());
    }

}
