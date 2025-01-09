package gympal.models;

import java.util.Date;

public class Medicion {
    private double masaMuscular;
    private double porcentajeGrasa;
    private double peso;
    private Date fecha;

    // Constructor
    public Medicion(double masaMuscular, double porcentajeGrasa,double peso, Date fecha) {
        this.masaMuscular = masaMuscular;
        this.porcentajeGrasa = porcentajeGrasa;
        this.fecha = fecha;
        this.peso=peso;
    }

    // Getters y Setters


    public double getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(double masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public void setPorcentajeGrasa(double porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Métodos de la clase Medicion
    public double obtenerPorcentajeMusculo() {
        return this.masaMuscular;
    }

    public double obtenerPorcentajeDeGrasa() {
        return this.porcentajeGrasa;
    }
}