package es.springboot.reuniones.controllers;

import es.springboot.reuniones.models.Reunion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/reuniones")
public class ReunionController {

    private static final List<Reunion> reuniones = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i ++) {
            reuniones.add(new Reunion(i, "Reunion " + i,
                    ZonedDateTime.now().plusDays(i)));
        }
    }

    @GetMapping
    public String getAllReuniones(Model model) {
        model.addAttribute("reuniones", reuniones);
        return "reuniones";
    }

}
