package es.springboot.reuniones.data;

import es.springboot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
