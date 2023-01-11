package crud;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.CollectionService;

public class GetCollectionsTest {

    @Test
    public void testGetAllCollections() {
        CollectionService service = new CollectionService();
        Response response = service.getAllCollections();
        Assert.assertEquals(Integer.toString(response.getStatusCode()), "200");
    }
}
