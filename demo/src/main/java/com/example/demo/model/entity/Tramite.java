package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Tramite")
public class Tramite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "radicado")
    private String radicado;

    @Column(name = "año")
    private String año;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @JoinColumn(name = "solicitante")
    private Long solicitante;

    @JoinColumn(name = "funcionario")
    private Long funcionario;

    public Tramite(String radicado, String año, String nombre, String descripcion, Long solicitante, Long funcionario) {
        this.radicado = radicado;
        this.año = año;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.solicitante = solicitante;
        this.funcionario = funcionario;
    }
}
