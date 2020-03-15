package es.vir2al.prestamos.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.vir2al.prestamos.daos.EstadosPrestamoDAO;
import es.vir2al.prestamos.daos.MastersDAO;
import es.vir2al.prestamos.models.EstadoPrestamo;

/**
 * TestController
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

  private static final Logger logger = LoggerFactory.getLogger(TestController.class);
  
  @Autowired
  private EstadosPrestamoDAO estadosPrestamoDAO;

  @GetMapping()
  public ResponseEntity<?> test() {

    logger.info("TEST!");

    List<EstadoPrestamo> lstEstados = this.estadosPrestamoDAO.findAll();

    for (EstadoPrestamo estado : lstEstados) {
      logger.info(estado.getDescripcion());
    }

    return new ResponseEntity<>("OK",HttpStatus.OK);

  }
  
}
