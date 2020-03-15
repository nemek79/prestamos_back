package es.vir2al.prestamos.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import es.vir2al.prestamos.models.Master;


/**
 * MastersDAO
 */
@NoRepositoryBean
public interface MastersDAO <T extends Master> extends JpaRepository<T ,Long> {

  
}
