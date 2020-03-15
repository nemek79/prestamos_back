package es.vir2al.prestamos.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.vir2al.prestamos.models.EstadoPrestamo;

/**
 * EstadosPrestamoDAO
 */
@Repository
public interface EstadosPrestamoDAO extends JpaRepository<EstadoPrestamo ,Long> {

  
}
