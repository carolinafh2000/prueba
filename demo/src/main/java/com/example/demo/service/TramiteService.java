package com.example.demo.service;

import com.example.demo.model.entity.Tramite;
import com.example.demo.model.repository.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TramiteService {

    @Autowired
    TramiteRepository tramiteRepository;

    public List<Tramite> obtenerTramites(){
        return tramiteRepository.findAll();
    }

    public void guardarTramite(Tramite tramite){
        tramiteRepository.save(tramite);

    }

}
