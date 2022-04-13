package br.com.thiago.nasaapibackend.entities.neo;

import lombok.Data;

@Data
public class Diameter {

    private Units.Kilometer kilometers;
    private Units.Meter meters;
    private Units.Miles miles;
    private Units.Foot feet;
}
