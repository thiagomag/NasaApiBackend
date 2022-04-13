package br.com.thiago.nasaapibackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class Units {

    @JsonProperty("estimated_diameter_min")
    Double diamMin;
    @JsonProperty("estimated_diameter_max")
    Double diamMax;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class Kilometer extends Units{
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class Meter extends Units{
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class Miles extends Units{
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class Foot extends Units{
    }

}
