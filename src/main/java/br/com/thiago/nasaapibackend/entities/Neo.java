package br.com.thiago.nasaapibackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Neo {

    String id;
    String name;
    @JsonProperty("absolute_magnitude_h")
    Double absoluteMagnitudeH;
    @JsonProperty("estimated_diameter")
    Diameter estimatedDiameter;
    @JsonProperty("is_potentially_hazardous_asteroid")
    boolean hazardous;
    @JsonProperty("close_approach_data")
    CloseApproachData coloseApproachData;

}
