package br.com.thiago.nasaapibackend.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestDto {

    private LocalDate startDate;
    private LocalDate endDate;
}
