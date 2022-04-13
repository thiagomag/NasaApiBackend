package br.com.thiago.nasaapibackend.controller;

import br.com.thiago.nasaapibackend.dto.RequestDto;
import br.com.thiago.nasaapibackend.entities.neo.NeosResponse;
import br.com.thiago.nasaapibackend.service.NasaApiBackendService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class NasaApiBackendController {

    private final NasaApiBackendService nasaApiBackendService;

    @GetMapping("/neos")
    public ResponseEntity<NeosResponse> getNeos(@RequestBody RequestDto requestDto) {
        return nasaApiBackendService.getNeos(requestDto);
    }
}
