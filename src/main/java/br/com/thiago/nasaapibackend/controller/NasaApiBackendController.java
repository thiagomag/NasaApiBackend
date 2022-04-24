package br.com.thiago.nasaapibackend.controller;

import br.com.thiago.nasaapibackend.dto.RequestDto;
import br.com.thiago.nasaapibackend.entities.neo.NeosApiResponse;
import br.com.thiago.nasaapibackend.service.NasaApiBackendService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Nasa Api", description = "Backend request for Nasa API")
@RequiredArgsConstructor
@RequestMapping("/api")
public class NasaApiBackendController {

    private final NasaApiBackendService nasaApiBackendService;

    @Operation(method = "Near Earth Objects",
            description = "Get all near earth objects in a specific date or dates (dd/mm/yyyy)")
    @GetMapping("/neos")
    public ResponseEntity<NeosApiResponse> getNeos(@RequestBody RequestDto requestDto) {
        return nasaApiBackendService.getNeos(requestDto);
    }
}
