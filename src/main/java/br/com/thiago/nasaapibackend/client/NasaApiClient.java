package br.com.thiago.nasaapibackend.client;

import br.com.thiago.nasaapibackend.entities.NeosApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "NasaAPI", url = "https://api.nasa.gov")
public interface NasaApiClient {

    @GetMapping("/neo/rest/v1/feed")
    ResponseEntity<NeosApiResponse> getNeos(@RequestParam("start_date") String startDate,
                                            @RequestParam("end_date") String endDate,
                                            @RequestParam("api_key") String apiKey);
}
