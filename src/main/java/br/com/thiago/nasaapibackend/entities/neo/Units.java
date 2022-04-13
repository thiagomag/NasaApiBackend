package br.com.thiago.nasaapibackend.entities.neo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class Units {

    @JsonProperty("estimated_diameter_min")
    Double diamMin;
    @JsonProperty("estimated_diameter_max")
    Double diamMax;

    public static class Kilometer extends Units{}

    public static class Meter extends Units{}

    public static class Miles extends Units{}

    public static class Foot extends Units{}

}
