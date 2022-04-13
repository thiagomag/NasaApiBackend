package br.com.thiago.nasaapibackend.entities.neo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NeosResponse {

    @JsonProperty("element_count")
    private Integer elementCount;
    @JsonProperty("near_earth_objects")
    private List<Neo> nearEarthObjects;
}
