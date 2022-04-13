package br.com.thiago.nasaapibackend.entities.neo;

import lombok.Data;

@Data
public class MissDistance {

    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;

}
