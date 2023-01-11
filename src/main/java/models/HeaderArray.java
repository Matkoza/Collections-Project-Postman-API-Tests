package models;

import lombok.Builder;
@Builder
public class HeaderArray {
    @Builder.Default
    String key = "Content-Type";
    @Builder.Default
    String value = "application/json";

}
