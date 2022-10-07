package br.com.thiago.nasaapibackend.entities.neo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class NeosByDate {

    private LocalDate date;
    private List<Neo> neos;
}
