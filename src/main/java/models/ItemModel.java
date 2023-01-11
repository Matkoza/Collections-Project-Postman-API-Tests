package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemModel {
    @Builder.Default
    String name = "Generic name";

    JsonRequest request;

}


