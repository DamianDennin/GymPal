package gympal.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gympal.dto.RutinaDTO;

public class Rutina {
    private double duracion;
    private List<Entrenamiento> entrenamientos;
    private Objetivo objetivo;



    public Rutina(double duracion, Objetivo objetivo) {
        this.duracion = duracion;
        this.entrenamientos = new ArrayList<>();
        this.objetivo = objetivo;
    }

    public void crearEntrenamiento(List<Ejercicio> ejercicios) {
        Date fecha = new Date(); // Fecha actual
        Entrenamiento entrenamientoSemana1 = new Entrenamiento(fecha, ejercicios);
        Entrenamiento entrenamientoSemana2 = new Entrenamiento(fecha, ejercicios);
        Entrenamiento entrenamientoSemana3 = new Entrenamiento(fecha, ejercicios);
        Entrenamiento entrenamientoSemana4 = new Entrenamiento(fecha, ejercicios);
       entrenamientos.add(entrenamientoSemana1);
        entrenamientos.add(entrenamientoSemana2);

        entrenamientos.add(entrenamientoSemana3);
        entrenamientos.add(entrenamientoSemana4);


    }

    // Método para verificar si la rutina se ha cumplido
    public boolean verificarCumplimiento() {
        boolean cumplio=false;
        int contador=0;
        for (Entrenamiento entrenamiento:entrenamientos){
            if (entrenamiento.verificarSiTodoFueHecho()){
                contador++;
            }
        }
        if (contador==entrenamientos.size()){
            cumplio=true;
        }
        return cumplio;
    }

    // Método para convertir en DTO
    public RutinaDTO toDTO() {
        return new RutinaDTO(this.duracion, this.entrenamientos, this.objetivo);
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }
}
