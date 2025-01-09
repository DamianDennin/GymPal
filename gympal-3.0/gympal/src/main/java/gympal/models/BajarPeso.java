package fit.gympal.models;



import gympal.controller.EjercicioController;
import gympal.controller.rutinaController;
import gympal.interfaces.EstadoObjetivo;
import gympal.models.Objetivo;
import gympal.models.Rutina;
import gympal.models.Trofeo;
import gympal.states.Cumplido;
import gympal.states.EnProgreso;

import java.util.ArrayList;
import java.util.List;

public class BajarPeso extends Objetivo {
    private rutinaController rutController = rutinaController.getInstance();
    private EjercicioController ejerController = EjercicioController.getInstancia();
    public BajarPeso() {
        this.nombre="BAJAR PESO";
        this.descripcion="Rutina hecha para que el usuario baje de peso";
        this.estado= new EnProgreso();
        this.duracionEntrenamiento=1.5;
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
        Rutina rutina=rutController.crearRutina(objetivo,1.5);
        rutina.crearEntrenamiento(ejerController.ejerciciosBajarPeso());
        return rutina;
    }

    @Override
    public void setEstado(EstadoObjetivo estado) {
        this.estado=estado;
        notifyObservers();
    }




}


