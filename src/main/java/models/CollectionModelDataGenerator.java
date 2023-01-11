package models;

import java.util.ArrayList;
import java.util.List;

public class CollectionModelDataGenerator {
    List<ItemModel> items = new ArrayList<ItemModel>();
    List<HeaderArray> headers = new ArrayList<HeaderArray>();
    ItemModel item = ItemModel.builder().build();
    InfoModel info = InfoModel.builder().build();
    HeaderArray header = HeaderArray.builder().build();
    JsonRequest jsonRequest = JsonRequest.builder().build();

    public CollectionModelDataGenerator(){
        // Set collection fields
        headers.add(header);
        items.add(item);
        jsonRequest.setHeaders(headers);
        item.setRequest(jsonRequest);

    }

    public CollectionModelDataGenerator(String name, String description){
        // Set collection fields
        info.setName(name);
        info.setDescription(description);
        headers.add(header);
        items.add(item);
        jsonRequest.setHeaders(headers);
        item.setRequest(jsonRequest);

    }

    static CollectionModelDataGenerator collectionModelDataGenerator = new CollectionModelDataGenerator();
    static CollectionModel collection = CollectionModel.builder().build();
    public static CollectionModel initCollection(){
        collection.setItem(collectionModelDataGenerator.items);
        collection.setInfo(collectionModelDataGenerator.info);
        return collection;
    }
    public static CollectionModel initCollection(String name, String description){
        CollectionModelDataGenerator collectionModelDataGenerator = new CollectionModelDataGenerator(name, description);
        CollectionModel collection = CollectionModel.builder().build();
        collection.setItem(collectionModelDataGenerator.items);
        collection.setInfo(collectionModelDataGenerator.info);
        return collection;
    }
    public static CollectionModel initCollectionWithoutItems(){
        collection.setInfo(collectionModelDataGenerator.info);
        return collection;
    }
    public static CollectionModel initCollectionWithoutInfo(){
        collection.setItem(collectionModelDataGenerator.items);
        return collection;
    }
}
