package com.example.demo.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class EmpleadoDto {

    private String identificacion;

    private String nombre;

    private String apellido;

    private String dependencia;

    private String ingreso;
}
