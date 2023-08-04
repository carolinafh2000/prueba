package com.example.demo.dto;

import com.example.demo.model.entity.Empleado;
import com.example.demo.model.entity.Persona;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TramiteDto implements Serializable {

    private String radicado;

    private String año;

    private String nombre;

    private String descripcion;

    private Long solicitante;

    private Long funcionario;
}
