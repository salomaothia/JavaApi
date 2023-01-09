package com.petshop.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Pet {
    @Id
    private String id;
    private String nome;
    private String raca;
    private int anoNascimento;
    private boolean vacinado;
    private List<String> procedimentos;
}
