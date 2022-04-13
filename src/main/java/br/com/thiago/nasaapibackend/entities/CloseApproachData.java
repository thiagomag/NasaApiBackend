package br.com.thiago.nasaapibackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CloseApproachData {

    @JsonProperty("close_approach_date")
    private String closeApproachDate;
    @JsonProperty("close_approach_date_full")
    private String closeApproachDateFull;
    @JsonProperty("epoch_date_close_approach")
    private String epochAateCloseApproach;

}
