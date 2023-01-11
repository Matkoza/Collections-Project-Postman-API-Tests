package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class JsonRequest {
    @Builder.Default
    String url = "https://echo.getpostman.com/headers";

    @Builder.Default
    String method = "GET";

    List<HeaderArray> headers;

}
