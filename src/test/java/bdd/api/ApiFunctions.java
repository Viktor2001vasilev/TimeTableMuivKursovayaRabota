package bdd.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.get;

public class ApiFunctions {

    public static void setApiBaseURI(String uri) {
        RestAssured.baseURI = uri;
        RestAssured.requestSpecification = new RequestSpecBuilder().log(LogDetail.ALL).setAccept(ContentType.JSON).setContentType(ContentType.JSON).build();
    }

    public static String jsonResponseGetString(Response response, String key) {
        String jsonResponse = response.asString();
        JsonPath jsonPath = new JsonPath(jsonResponse);
        return jsonPath.getString(key);
    }

    public static Response executeQuery(String query) {
        return get(query).then().statusCode(200).extract().response();
    }

}
