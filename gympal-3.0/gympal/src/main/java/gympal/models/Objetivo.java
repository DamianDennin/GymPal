package gympal.models;

import gympal.interfaces.EstadoObjetivo;
import gympal.states.EnProgreso;

import java.util.ArrayList;
import java.util.List;

public abstract class Objetivo {
    protected String nombre;
    protected String descripcion;
    protected double duracionEntrenamiento;
    protected EstadoObjetivo estado;
    protected List<Trofeo> observers;

    public Objetivo() {}

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

    // Agregar observadores
    public abstract void addObserver(Trofeo observer);


    // Notificar a los observadores
    public abstract void notifyObservers();


    public abstract Rutina crearRutina(Objetivo objetivo);

    public void setEstado(EstadoObjetivo nuevoEstado) {
        this.estado = nuevoEstado;
        notifyObservers(); // Notificar observadores cuando cambia el estado
    }

}
