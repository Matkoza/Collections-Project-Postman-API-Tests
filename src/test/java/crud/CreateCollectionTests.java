package crud;

import io.restassured.response.Response;
import models.CollectionModel;
import models.CollectionModelDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.CollectionService;

public class CreateCollectionTests {
    CollectionService collectionService = new CollectionService();

    @Test(dataProvider = "InfoProvider", dataProviderClass = DPClass.class)
    public void testCreateCollectionPostSuccess(CollectionModel collection){
        Response response = collectionService.createCollectionPost(collection);
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println(collection.toString());
    }

    @Test
    public void testCreateCollectionPostFailsNoItem(){
        CollectionModel collection = CollectionModelDataGenerator.initCollectionWithoutItems();
        Response response = collectionService.createCollectionPost(collection);
        Assert.assertNotEquals(response, "200");
        System.out.println(response.prettyPrint());
    }

    @Test
    public void testCreateCollectionPostFailsNoInfo(){
        CollectionModel collection = CollectionModelDataGenerator.initCollectionWithoutInfo();
        Response response = collectionService.createCollectionPost(collection);
        Assert.assertNotEquals(response, "200");
        System.out.println(response.prettyPrint());
    }
}
