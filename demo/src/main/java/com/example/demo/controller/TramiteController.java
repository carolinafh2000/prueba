package com.example.demo.controller;

import com.example.demo.dto.EmpleadoDto;
import com.example.demo.dto.TramiteDto;
import com.example.demo.model.entity.Empleado;
import com.example.demo.model.entity.Persona;
import com.example.demo.model.entity.Tramite;
import com.example.demo.service.TramiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin(origins = "")
@RestController
public class TramiteController {

    @Autowired
    TramiteService tramiteService;

    @PostMapping("/tramite")
    public ResponseEntity<?> crearTramite(@RequestBody TramiteDto tramiteDto){
        Persona persona = new Persona();
        Empleado empleado = new Empleado();

        Tramite tramite = new Tramite(tramiteDto.getNumero(), tramiteDto.getAño(), tramiteDto.getNombre(), tramiteDto.getDescripcion(), tramiteDto.getSolicitante(), tramiteDto.getFuncionario());
        tramiteService.guardarTramite(tramite);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/tramite")
    public ResponseEntity<List<Tramite>> listarTramites(){
        List<Tramite> list = tramiteService.obtenerTramites();
        return new ResponseEntity<List<Tramite>>(list, HttpStatus.OK);
    }
}
