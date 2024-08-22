package es.springboot.reuniones.data;

import es.springboot.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReunionRepository extends JpaRepository<Reunion, Long> {
}
