package es.vir2al.prestamos.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Audit
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"usuAlta", "usuModif", "fechaAlta", "fechaModif"},
        allowGetters = true
)
public class Audit implements Serializable {

  private static final long serialVersionUID = 1L;

  @CreatedDate
  @Column(nullable = false, updatable = false)
  private Instant fechaAlta;

  @LastModifiedDate
  @Column(nullable = false)
  private Instant fechaModif;

  @CreatedBy
  @Column(updatable = false)
  private String usuAlta;
  
  @LastModifiedBy
  private String usuModif;

  public Instant getFechaAlta() {
    return fechaAlta;
  }

  public void setFechaAlta(Instant fechaAlta) {
    this.fechaAlta = fechaAlta;
  }

  public Instant getFechaModif() {
    return fechaModif;
  }

  public void setFechaModif(Instant fechaModif) {
    this.fechaModif = fechaModif;
  }

  public String getUsuAlta() {
    return usuAlta;
  }

  public void setUsuAlta(String usuAlta) {
    this.usuAlta = usuAlta;
  }

  public String getUsuModif() {
    return usuModif;
  }

  public void setUsuModif(String usuModif) {
    this.usuModif = usuModif;
  }
  
}
