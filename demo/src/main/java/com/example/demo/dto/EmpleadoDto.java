package com.example.demo.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class EmpleadoDto implements Serializable {

    private String identificacion;

    private String nombre;

    private String apellido;

    private String dependencia;

    private String ingreso;
}
