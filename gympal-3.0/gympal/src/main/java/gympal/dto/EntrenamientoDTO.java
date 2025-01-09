package gympal.dto;

import java.util.Date;
import java.util.List;

import gympal.models.Ejercicio;

public class EntrenamientoDTO {
  private Date fecha;
  private List<Ejercicio> ejercicios;

  // Constructor
  public EntrenamientoDTO(Date fecha, List<Ejercicio> ejercicios){
    this.fecha = fecha;
    this.ejercicios = ejercicios;
  }

  // Getters

  public Date getFecha() {
    return fecha;
  }

  public List<Ejercicio> getEjercicios() {
    return ejercicios;
  }
}
