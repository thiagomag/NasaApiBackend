package br.com.thiago.nasaapibackend.entities.neo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@Builder
public class NeosBackendResponse {

    private Integer elementCount;
    private List<NeosByDate> neosByDateList;

    public static NeosBackendResponse adapt(NeosApiResponse responseApi, LocalDate startDate, LocalDate endDate) {
        return NeosBackendResponse.builder()
                .elementCount(responseApi.getElementCount())
                .neosByDateList(buildListByDate(responseApi.getNearEarthObjects(), startDate, endDate))
                .build();
    }


    private static List<NeosByDate> buildListByDate(Map<String, List<Neo>> nearEarthObjects, LocalDate startDate, LocalDate endDate) {
        var neosByDateList = new ArrayList<NeosByDate>();
        if (startDate.equals(endDate)) {
            Optional.ofNullable(nearEarthObjects.get(startDate.toString())).map(neos -> {
                var neosByDate = NeosByDate.builder()
                        .date(startDate)
                        .neos(neos)
                        .build();
                return neosByDateList.add(neosByDate);
            });
        } else {
            var daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
            for (int i = 0; i <= daysBetween; i++) {
                var date = startDate.plusDays(i);
                Optional.ofNullable(nearEarthObjects.get(date.toString())).map(neos -> {
                    var neosByDate = NeosByDate.builder()
                            .date(date)
                            .neos(neos)
                            .build();
                    return neosByDateList.add(neosByDate);
                });
            }
        }
        return neosByDateList;
    }
}
