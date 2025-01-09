package fit.gympal.models;


import gympal.controller.EjercicioController;
import gympal.controller.rutinaController;
import gympal.interfaces.EstadoObjetivo;
import gympal.models.Objetivo;
import gympal.models.Rutina;
import gympal.models.Trofeo;
import gympal.states.EnProgreso;

import java.util.ArrayList;

public class TonificarCuerpo extends Objetivo {
    private rutinaController rutController = rutinaController.getInstance();
    private EjercicioController ejerController = EjercicioController.getInstancia();
    public TonificarCuerpo() {
        this.nombre="TONIFICAR CUERPO";
        this.descripcion="Rutina hecha para tonificar el cuerpo";
        this.estado= new EnProgreso();
        this.duracionEntrenamiento=2.5;
        this.observers= new ArrayList<>();
    }

    @Override
    public Rutina crearRutina(Objetivo objetivo) {
        Rutina rutina=rutController.crearRutina(objetivo,2.5);
        rutina.crearEntrenamiento(ejerController.ejerciciosTonificarCuerpo());
        return rutina;
    }
    @Override
    public void addObserver(Trofeo observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Trofeo observer : observers) {
            observer.update();
        }
    }


    @Override
    public void setEstado(EstadoObjetivo estado) {


    }
}

