package com.seccion4.respo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seccion4.respo4.repository.personaRepository;
import com.seccion4.respo4.model.Persona;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona){
        return personaRepository.create(persona);
    }
}