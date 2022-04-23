package br.com.thiago.nasaapibackend.entities.neo;

import br.com.thiago.nasaapibackend.entities.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NeosApiResponse {

    private Links links;
    @JsonProperty("element_count")
    private Integer elementCount;
    @JsonProperty("near_earth_objects")
    private Map<String, List<Neo>> nearEarthObjects;
}
