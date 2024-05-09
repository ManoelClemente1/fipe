package com.api.fipe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Data
@NoArgsConstructor
public class Interesse {

    @Id
    @SequenceGenerator(
            name="interesse_sequence",
            sequenceName = "interesse_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "interesse_generator"
    )
    private Long id;

    private String nome;

    private Boolean status;

    public Interesse(String nome) {
        this.nome = nome;
        this.status = true;
    }
}