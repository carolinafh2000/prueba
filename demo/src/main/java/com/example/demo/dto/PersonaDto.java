package com.example.demo.dto;

import com.example.demo.model.entity.TipoIdentificacion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDto implements Serializable {

    private Long tipoidentificacion;

    private String identificacion;

    private String nombre;

    private String apellido;

    private String telefono;

    private String direccion;

    private String email;
}
