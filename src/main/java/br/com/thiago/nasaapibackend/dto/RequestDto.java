package br.com.thiago.nasaapibackend.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RequestDto {

    @Schema(example = "yyyy-MM-dd", description = "start date for the search")
    @DateTimeFormat
    private LocalDate startDate;
    @Schema(example = "yyyy-MM-dd", description = "finish date for the search")
    @DateTimeFormat
    private LocalDate endDate;
}
