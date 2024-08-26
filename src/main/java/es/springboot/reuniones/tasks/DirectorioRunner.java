package es.springboot.reuniones.tasks;

import es.springboot.reuniones.services.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DirectorioRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DirectorioRunner.class);

    @Autowired
    private PersonaService personaService;

    @Override
    public void run(String... args) throws Exception {
        log.info("Directorio de personas:");
        personaService.getAllPersonas().forEach(persona -> {
            log.info(persona.toString());
        });
        log.info("Fin del directorio");
    }
}
