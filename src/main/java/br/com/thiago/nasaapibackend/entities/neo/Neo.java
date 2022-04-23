package br.com.thiago.nasaapibackend.entities.neo;

import br.com.thiago.nasaapibackend.entities.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Neo {

    private Links links;
    @JsonProperty("id")
    private String id;
    @JsonProperty("neo_reference_id")
    private String neoReferenceId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nasa_jpl_url")
    private String nasaJplUrl;
    @JsonProperty("absolute_magnitude_h")
    private double absoluteMagnitudeH;
    @JsonProperty("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;
    @JsonProperty("is_potentially_hazardous_asteroid")
    private boolean potentiallyHazardousAsteroid;
    @JsonProperty("close_approach_data")
    private List<CloseApproach> coloseApproachData;
    @JsonProperty("is_sentry_object")
    private boolean isSentryObject;

    @Data
    private static final class EstimatedDiameter {

        private EstimatedDiameterUnit kilometers;
        private EstimatedDiameterUnit meters;
        private EstimatedDiameterUnit miles;
        private EstimatedDiameterUnit feet;

        @Data
        private static final class EstimatedDiameterUnit {

            @JsonProperty("estimated_diameter_min")
            private String estimatedDiameterMin;
            @JsonProperty("estimated_diameter_max")
            private String estimatedDiameterMax;
        }
    }

    @Data
    private static final class CloseApproach {

        @JsonProperty("close_approach_date")
        private String closeApproachDate;
        @JsonProperty("close_approach_date_full")
        private String closeApproachDateFull;
        @JsonProperty("epoch_date_close_approach")
        private long epochDateCloseApproach;
        @JsonProperty("relative_velocity")
        private RelativeVelocity relativeVelocity;
        @JsonProperty("miss_distance")
        private MissDistance missDistance;
        @JsonProperty("orbiting_body")
        private String orbitingBody;
    }

    @Data
    private static class RelativeVelocity {

        @JsonProperty("kilometers_per_second")
        private String kilometersPerSecond;
        @JsonProperty("kilometers_per_hour")
        private String kilometersPerHour;
        @JsonProperty("miles_per_hour")
        private String milesPerHours;
    }

    @Data
    private static class MissDistance {

        private String astronomical;
        private String lunar;
        private String kilometers;
        private String miles;
    }
}
