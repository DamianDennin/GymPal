package gympal.dto;

import java.util.List;

import gympal.models.Entrenamiento;
import gympal.models.Objetivo;

public class RutinaDTO {
    private double duracion;
    private List<Entrenamiento> entrenamientos;
    private Objetivo objetivo;

    // Constructor
    public RutinaDTO(double duracion, List<Entrenamiento> entrenamientos, Objetivo objetivo) {
        this.duracion = duracion;
        this.entrenamientos = entrenamientos;
        this.objetivo = objetivo;
    }

    // Getters

    public double getDuracion() {
        return duracion;
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

}
