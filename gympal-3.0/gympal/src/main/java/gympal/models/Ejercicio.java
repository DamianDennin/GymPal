package gympal.models;

import gympal.dto.EjercicioDTO;
import gympal.enums.ExigenciaMuscular;
import gympal.enums.GrupoMuscular;

public class Ejercicio {
  private String nombre;
  private int series;
  private int repeticiones;
  private double pesoAsignado;
  private GrupoMuscular grupo;
  private ExigenciaMuscular exigencia;
  private boolean ejercicioCompletado;

  public String getNombre() {
    return nombre;
  }

  public int getSeries() {
    return series;
  }

  public int getRepeticiones() {
    return repeticiones;
  }

  public double getPesoAsignado() {
    return pesoAsignado;
  }

  public GrupoMuscular getGrupo() {
    return grupo;
  }

  public ExigenciaMuscular getExigencia() {
    return exigencia;
  }

  public Ejercicio(String nombre, int series, int repeticiones, double pesoAsignado, ExigenciaMuscular exigencia, GrupoMuscular grupo) {
    this.nombre = nombre;
    this.series = series;
    this.repeticiones = repeticiones;
    this.pesoAsignado = pesoAsignado;
    this.exigencia = exigencia;
    this.grupo = grupo;
  }

  // Método para convertir en DTO
  public EjercicioDTO toDTO() {
    return new EjercicioDTO(this.nombre, this.series, this.repeticiones, this.pesoAsignado, this.grupo, this.exigencia);
  }

  public void registrarProgreso(int series, int repeticiones, double peso){
    this.series=series;
    this.repeticiones=repeticiones;
    this.pesoAsignado=peso;
    this.ejercicioCompletado=true;
  }

  public boolean isEjercicioCompletado() {
    return ejercicioCompletado;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSeries(int series) {
    this.series = series;
  }

  public void setRepeticiones(int repeticiones) {
    this.repeticiones = repeticiones;
  }

  public void setPesoAsignado(double pesoAsignado) {
    this.pesoAsignado = pesoAsignado;
  }

  public void setGrupo(GrupoMuscular grupo) {
    this.grupo = grupo;
  }

  public void setExigencia(ExigenciaMuscular exigencia) {
    this.exigencia = exigencia;
  }

  public void setEjercicioCompletado(boolean ejercicioCompletado) {
    this.ejercicioCompletado = ejercicioCompletado;
  }
}

