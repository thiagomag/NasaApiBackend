package br.com.thiago.nasaapibackend.entities;

import lombok.Data;

@Data
public class Diameter {

    Units.Kilometer kilometers;
    Units.Meter meters;
    Units.Miles miles;
    Units.Foot feet;
}
