package com.example.demo.service;

import com.example.demo.model.entity.Persona;
import com.example.demo.model.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> obtenerPersonas(){
        return  personaRepository.findAll();
    }

    public void guardarPersona(Persona persona){
        personaRepository.save(persona);

    }
}
