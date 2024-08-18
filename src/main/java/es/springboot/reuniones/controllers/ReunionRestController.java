package es.springboot.reuniones.controllers;

import es.springboot.reuniones.models.Reunion;
import es.springboot.reuniones.services.ReunionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionRestController {

    private ReunionService reunionService;

    public ReunionRestController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }

    @GetMapping
    public List<Reunion> getAllReuniones() {
        return reunionService.getAllReuniones();
    }

}
