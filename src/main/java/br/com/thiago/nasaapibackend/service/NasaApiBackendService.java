package br.com.thiago.nasaapibackend.service;

import br.com.thiago.nasaapibackend.client.NasaApiClient;
import br.com.thiago.nasaapibackend.dto.RequestDto;
import br.com.thiago.nasaapibackend.entities.neo.Neo;
import br.com.thiago.nasaapibackend.entities.neo.NeosResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
@RequiredArgsConstructor
public class NasaApiBackendService {

    private final NasaApiClient nasaApiClient;
    @Value("${nasa.api.key}")
    private String apiKey;

    public ResponseEntity<NeosResponse> getNeos(RequestDto requestDto) {

        ObjectMapper mapper = new ObjectMapper();

        var startDate = requestDto.getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        var endDate = requestDto.getEndDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        var responseApi = nasaApiClient.getNeos(startDate, endDate, apiKey);
        var response = responseApi.getNearEarthObjects();
        var neoResponse = new NeosResponse();
        neoResponse.setElementCount(responseApi.getElementCount());

        List<Neo> neoList = new ArrayList<>();
        for (int i = 0; i < response.size(); i++) {
            var getData = requestDto.getStartDate().plusDays(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            var neoString = response.get(getData).toString().replace("[", "").replace("]", "");
            var neo = mapper.convertValue(neoString, Neo.class);
            neoList.add(neo);
        }

        neoResponse.setNearEarthObjects(neoList);
        return ResponseEntity.ok().body(neoResponse);
    }
}
