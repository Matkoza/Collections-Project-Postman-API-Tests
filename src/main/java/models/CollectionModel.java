package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class CollectionModel {
    @SerializedName("info")
    InfoModel info;

    @SerializedName("item")
    List<ItemModel> item;

}
