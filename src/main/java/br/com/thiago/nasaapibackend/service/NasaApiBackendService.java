package br.com.thiago.nasaapibackend.service;

import br.com.thiago.nasaapibackend.client.NasaApiClient;
import br.com.thiago.nasaapibackend.dto.RequestDto;
import br.com.thiago.nasaapibackend.entities.neo.NeosApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class NasaApiBackendService {

    private final NasaApiClient nasaApiClient;
    @Value("${nasa.api.key}")
    private String apiKey;

    public ResponseEntity<NeosApiResponse> getNeos(RequestDto requestDto) {

        var startDate = requestDto.getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        var endDate = requestDto.getEndDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        var responseApi = nasaApiClient.getNeos(startDate, endDate, apiKey);

        return ResponseEntity.ok().body(responseApi);
    }
}
