package es.springboot.reuniones.services;

import es.springboot.reuniones.data.PersonaRepository;
import es.springboot.reuniones.models.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

}
