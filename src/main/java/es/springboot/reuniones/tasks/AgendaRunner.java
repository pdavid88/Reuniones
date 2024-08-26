package es.springboot.reuniones.tasks;

import es.springboot.reuniones.services.ReunionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AgendaRunner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(AgendaRunner.class);

   @Autowired
   private ReunionService reunionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Lista de reuniones:");
        reunionService.getAllReuniones().forEach(reunion -> {
            log.info(reunion.toString());
        });
        log.info("Fin del listado");
    }
}
