package br.com.thiago.nasaapibackend.entities.neo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Neo {

    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;
    @JsonProperty("absolute_magnitude_h")
    Double absoluteMagnitudeH;
    @JsonProperty("estimated_diameter")
    Diameter estimatedDiameter;
    @JsonProperty("is_potentially_hazardous_asteroid")
    boolean hazardous;
    @JsonProperty("close_approach_data")
    CloseApproachData coloseApproachData;
    @JsonProperty("is_sentry_object")
    boolean isSentryObject;

}
