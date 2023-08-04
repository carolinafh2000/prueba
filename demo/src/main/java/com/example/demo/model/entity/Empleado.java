package com.example.demo.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Empleado")
@NoArgsConstructor
public class Empleado {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="identificacion")
        private String identificacion;

        @Column(name="nombre")
        private String nombre;

        @Column(name="apellido")
        private String apellido;

        @Column(name="dependencia")
        private String dependencia;

        @Column(name="ingreso")
        private String ingreso;

    public Empleado(String identificacion, String nombre, String apellido, String dependencia, String ingreso) {
            this.identificacion = identificacion;
            this.nombre = nombre;
            this.apellido = apellido;
            this.dependencia = dependencia;
            this.ingreso = ingreso;
    }
}
