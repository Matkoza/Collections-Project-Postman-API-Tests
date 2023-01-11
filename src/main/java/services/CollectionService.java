package services;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.*;
public class CollectionService {
    private String url = System.getenv("APIUrl");
    private String APIKey = System.getenv("APIKey");
    private RequestSpecification request = RestAssured.given()
            .baseUri(url)
            .header("X-API-Key", APIKey)
            .queryParam("workspace", System.getenv("workspaceID"))
            .contentType(ContentType.JSON);

    public Response getAllCollections() {
        Response res = request
                .when()
                .get(url)
                .then()
                .extract().response();
        System.out.println(res.prettyPeek());
        return res;

    }
    public Response getCollectionById(String id){
        Response res = request
                .pathParam("collectionId", id)
                .when()
                .get(url+"/{collectionId}")
                .then()
                .extract().response();
        System.out.println(res.prettyPeek());
        return res;
    }

    public Response createCollectionPost(CollectionModel collection) {
        // Creating a Json object out of the collection
        JsonElement payload = new GsonBuilder().serializeNulls().create().toJsonTree(collection);
        JsonObject jsonCollection = new JsonObject();
        jsonCollection.add("collection", payload);

        // Post call on url
        Response response = request.body(jsonCollection.toString()).post(url);
        return response;
    }
}


