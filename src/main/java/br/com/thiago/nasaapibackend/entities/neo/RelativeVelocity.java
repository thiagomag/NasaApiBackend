package br.com.thiago.nasaapibackend.entities.neo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RelativeVelocity {

    @JsonProperty("kilometers_per_second")
    private String kilometersPerSecond;
    @JsonProperty("kilometers_per_hour")
    private String kilometersPerHour;
    @JsonProperty("miles_per_hour")
    private String milesPerHours;

}
