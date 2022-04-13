package br.com.thiago.nasaapibackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class NeosApiResponse {

    private Map<String, Object> links;
    @JsonProperty("element_count")
    private Integer elementCount;
    @JsonProperty("near_earth_objects")
    private Map<String, Object> nearEarthObjects;
}
