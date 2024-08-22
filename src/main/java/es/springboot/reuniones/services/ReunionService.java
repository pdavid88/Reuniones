package es.springboot.reuniones.services;

import es.springboot.reuniones.data.ReunionRepository;
import es.springboot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionRepository.findAll();
    }

}
