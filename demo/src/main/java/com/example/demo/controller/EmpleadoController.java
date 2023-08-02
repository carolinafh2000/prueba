package com.example.demo.controller;


import com.example.demo.dto.EmpleadoDto;
import com.example.demo.model.entity.Empleado;
import com.example.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin(origins = "")
@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("/empleado")
    public ResponseEntity<?> crearEmpleado(@RequestBody EmpleadoDto empleadoDto){

        Empleado empleado = new Empleado(empleadoDto.getIdentificacion(), empleadoDto.getNombre(), empleadoDto.getApellido(), empleadoDto.getDependencia(), empleadoDto.getIngreso());
        empleadoService.guardarEmpleado(empleado);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/empleado")
    public ResponseEntity<List<Empleado>> listarEmpleados(){
        List<Empleado> list = empleadoService.obtenerEmpleados();
        return new ResponseEntity<List<Empleado>>(list, HttpStatus.OK);
    }

}
