package br.com.thiago.nasaapibackend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestDto {

    @Schema(example = "dd/mm/yyyy", description = "start date for the search")
    private LocalDate startDate;
    @Schema(example = "dd/mm/yyyy", description = "finish date for the search")
    private LocalDate endDate;
}
