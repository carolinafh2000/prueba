package com.example.demo.controller;

import com.example.demo.dto.EmpleadoDto;
import com.example.demo.dto.PersonaDto;
import com.example.demo.model.entity.Empleado;
import com.example.demo.model.entity.Persona;
import com.example.demo.model.entity.TipoIdentificacion;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin(origins = "")
@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping("/persona")
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDto personaDto){

        Persona persona = new Persona(personaDto.getTipoIdentificacion(), personaDto.getIdentificacion(), personaDto.getNombre(), personaDto.getApellido(), personaDto.getTelefono(), personaDto.getDireccion(), personaDto.getEmail());
        personaService.guardarPersona(persona);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/persona")
    public ResponseEntity<List<Persona>> listarPersonas(){
        List<Persona> list = personaService.obtenerPersonas();
        return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
    }
}
