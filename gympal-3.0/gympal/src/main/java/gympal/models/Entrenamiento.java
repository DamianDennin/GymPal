package gympal.models;

import java.util.Date;
import java.util.List;

import gympal.dto.EntrenamientoDTO;

public class Entrenamiento {
    private Date fecha;
    private List<Ejercicio> ejercicios;

    public Entrenamiento(Date fecha, List<Ejercicio> ejercicios) {
        this.fecha = fecha;
        this.ejercicios = ejercicios;
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        // Añadir ejercicio al entrenamiento
        ejercicios.add(ejercicio);
    }

    // Método para convertir en DTO
    public EntrenamientoDTO toDTO() {
        return new EntrenamientoDTO(this.fecha, this.ejercicios);
    }

    public void comenzarEntrenamiento() {
        System.out.println("Entrenamiento iniciado.");
        System.out.println("Ejercicios del día:");
        for (Ejercicio ejercicio : ejercicios) {
            System.out.println(" - " + ejercicio.getNombre() +
                    ": " + ejercicio.getSeries() + " series, " +
                    ejercicio.getRepeticiones() + " repeticiones, " +
                    ejercicio.getPesoAsignado() + " kg");

        }
    }

    public boolean verificarSiTodoFueHecho(){
            int contador=0;
            boolean cumplio= false;

           for (Ejercicio ejercicio:ejercicios){
               if (ejercicio.isEjercicioCompletado()){
                   contador++;
               }

           }
        if (ejercicios.size()==contador){
            cumplio=true;
        }
        return cumplio;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
}
