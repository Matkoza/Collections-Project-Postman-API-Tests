package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoModel {
    @Builder.Default
    String name = "First Collection";

    @Builder.Default
    String description = "First Collection Description";

    @Builder.Default
    String schema = "https://schema.getpostman.com/json/collection/v2.1.0/collection.json";
}


