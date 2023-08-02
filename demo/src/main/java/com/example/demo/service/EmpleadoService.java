package com.example.demo.service;

import com.example.demo.model.entity.Empleado;
import com.example.demo.model.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> obtenerEmpleados(){
        return empleadoRepository.findAll();
    }

    public void guardarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);

    }

}
