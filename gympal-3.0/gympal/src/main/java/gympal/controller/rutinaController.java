package gympal.controller;



import gympal.models.Entrenamiento;
import gympal.models.Objetivo;
import gympal.models.Rutina;

import java.util.ArrayList;
import java.util.List;

public class rutinaController {

    private static rutinaController INSTANCE=null;
    private List<Rutina> rutinas;

    private rutinaController(){
        rutinas= new ArrayList<>();
    }

    public static rutinaController getInstance(){
        if (INSTANCE==null){
            INSTANCE=new rutinaController();
        }
        return INSTANCE;
    }

    public Rutina crearRutina(Objetivo objetivo, double duracion){


        return new Rutina(duracion, objetivo);
    }
}
