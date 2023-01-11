package crud;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CollectionModel;
import models.CollectionModelDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.CollectionService;

public class GetCollectionTest {

    @Test
    public void testGetCollectionById(){
        CollectionModel collection = CollectionModelDataGenerator.initCollection();
        CollectionService collectionService = new CollectionService();
        Response postResponse = collectionService.createCollectionPost(collection);
        JsonPath jsonPath = new JsonPath(postResponse.asString());
        String id = jsonPath.get("collection.id");
        Response getResponse = collectionService.getCollectionById(id);
        System.out.println("Created collection, id: " + id);
        Assert.assertEquals(getResponse.statusCode(), 200);
    }
}
