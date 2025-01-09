package fit.gympal.models;


import gympal.controller.EjercicioController;
import gympal.controller.rutinaController;
import gympal.interfaces.EstadoObjetivo;
import gympal.models.Objetivo;
import gympal.models.Rutina;
import gympal.models.Trofeo;
import gympal.states.EnProgreso;

import java.util.ArrayList;

public class MantenerFigura extends Objetivo {
    private final rutinaController rutController = rutinaController.getInstance();
    private final EjercicioController ejerController = EjercicioController.getInstancia();
    public MantenerFigura() {
        this.nombre="MANTENER FIGURA";
        this.descripcion="Rutina hecha para que el usuario no baje ni suba de peso";
        this.estado= new EnProgreso();
        this.duracionEntrenamiento=1.2;
        this.observers= new ArrayList<>();
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
    public Rutina crearRutina(Objetivo objetivo) {
        Rutina rutina=rutController.crearRutina(objetivo,1.20);
        rutina.crearEntrenamiento(ejerController.ejerciciosMantenerFigura());
        return rutina;
    }



    @Override
    public void setEstado(EstadoObjetivo estado) {
        this.estado=estado;
    }
}
