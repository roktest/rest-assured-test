package apiTesting;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateCustomer {

    public static void main(String[] args) {
        Response response = given()
                            .auth().basic("token", "")
                            .formParams("name", "estela maris")
                            .formParams("email", "estela_maris@email.com")
                            .formParams("description", "this customer is one of my neighbours, she has a cat which is always messing up with pots")
                            .post("https://api.stripe.com/v1/customers");
        response.prettyPrint();
        System.out.println("Response status code: " + response.statusCode());
    }
}
