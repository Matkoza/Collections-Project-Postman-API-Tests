package crud;

import models.CollectionModel;
import models.CollectionModelDataGenerator;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class DPClass {
    @DataProvider(name = "InfoProvider")
    public static Object[][] collectionProvider(){
        CollectionModel collection1 = CollectionModelDataGenerator.initCollection("First  collection", "First Description");
        CollectionModel collection2 = CollectionModelDataGenerator.initCollection("Second colection", "Second Description");
        CollectionModel collection3 = CollectionModelDataGenerator.initCollection("Third collection", "Third Description");
        List<CollectionModel> collectionList = new ArrayList<>();
        collectionList.add(collection1);
        collectionList.add(collection2);
        collectionList.add(collection3);

        Object [][] objArray = new Object[collectionList.size()][];

        for(int i = 0; i < collectionList.size(); i++){
            objArray[i] = new Object[1];
            objArray[i][0] = collectionList.get(i);
        }
        return objArray;
    }
}
