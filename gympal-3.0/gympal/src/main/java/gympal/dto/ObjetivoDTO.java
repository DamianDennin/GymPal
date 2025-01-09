package gympal.dto;

import gympal.interfaces.EstadoObjetivo;

public class ObjetivoDTO {
    private String nombre;
    private String descripcion;
    private double duracionEntrenamiento;
    private EstadoObjetivo estado;

    public ObjetivoDTO(String nombre, String descripcion, double duracionEntrenamiento, EstadoObjetivo estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracionEntrenamiento = duracionEntrenamiento;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getDuracionEntrenamiento() {
        return duracionEntrenamiento;
    }

    public EstadoObjetivo getEstado() {
        return estado;
    }
}
