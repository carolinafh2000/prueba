package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "Tramite")
public class Tramite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "año")
    private String año;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JsonIgnoreProperties(value = "Tramite", allowSetters = true)
    @JoinColumn(name = "solicitante")
    private Persona solicitante;

    @ManyToOne
    @JsonIgnoreProperties(value = "Tramite", allowSetters = true)
    @JoinColumn(name = "funcionario")
    private Empleado funcionario;

    public Tramite(String numero, String año, String nombre, String descripcion, Persona solicitante, Empleado funcionario) {
        this.numero = numero;
        this.año = año;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.solicitante = solicitante;
        this.funcionario = funcionario;
    }
}
