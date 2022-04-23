package br.com.thiago.nasaapibackend.entities;

import lombok.Data;

@Data
public final class Links {

    private String next;
    private String prev;
    private String self;
}