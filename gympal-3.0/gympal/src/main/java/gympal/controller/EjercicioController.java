package gympal.controller;



import gympal.dto.EjercicioDTO;
import gympal.enums.ExigenciaMuscular;
import gympal.enums.GrupoMuscular;
import gympal.models.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioController {

    private static EjercicioController instancia;
    private List<Ejercicio> ejercicios;
    private EjercicioController() {
    }


    public static EjercicioController getInstancia() {
        if (instancia == null) {
            instancia = new EjercicioController();
        }
        return instancia;
    }

    public void crearEjercicio(EjercicioDTO dto){
        Ejercicio ejercicio = new Ejercicio(dto.getNombre(), Integer.parseInt(dto.getSeries() ), Integer.parseInt(dto.getRepeticiones()), Double.parseDouble(dto.getPesoAsignado()),dto.getExigenciaMuscular(),dto.getGrupoMuscular());
        ejercicios.add(ejercicio);
    }

    public List<Ejercicio> ejerciciosBajarPeso(){
        ejercicios= new ArrayList<>();
        Ejercicio sentadilla = new Ejercicio("Sentadilla", 3, 15, 20.0, ExigenciaMuscular.MEDIO, GrupoMuscular.PIERNAS);
        Ejercicio zancadas = new Ejercicio("Zancadas", 3, 20, 10.0, ExigenciaMuscular.ALTO, GrupoMuscular.PIERNAS);
        Ejercicio pressHombros = new Ejercicio("Press de Hombros", 3, 10, 15.0, ExigenciaMuscular.MEDIO, GrupoMuscular.HOMBROS);
        Ejercicio pesoMuerto = new Ejercicio("Peso Muerto", 3, 12, 30.0, ExigenciaMuscular.MEDIO, GrupoMuscular.ESPALDA);
        ejercicios.add(sentadilla);
        ejercicios.add(zancadas);
        ejercicios.add(pressHombros);
        ejercicios.add(pesoMuerto);
        return ejercicios;
    }

    public List<Ejercicio> ejerciciosMantenerFigura(){
        ejercicios= new ArrayList<>();

        Ejercicio sentadilla = new Ejercicio("Sentadilla", 3, 15, 20.0, ExigenciaMuscular.MEDIO, GrupoMuscular.PIERNAS);
        Ejercicio pesoMuerto = new Ejercicio("Peso Muerto", 3, 12, 30.0, ExigenciaMuscular.MEDIO, GrupoMuscular.ESPALDA);
        Ejercicio pressHombros = new Ejercicio("Press de Hombros", 3, 10, 15.0, ExigenciaMuscular.MEDIO, GrupoMuscular.HOMBROS);
        Ejercicio curlBiceps = new Ejercicio("Curl de Bíceps", 3, 12, 10.0, ExigenciaMuscular.MEDIO, GrupoMuscular.BRAZOS);



        ejercicios.add(sentadilla);
        ejercicios.add(pesoMuerto);
        ejercicios.add(pressHombros);
        ejercicios.add(curlBiceps);
        return ejercicios;
    }
    public List<Ejercicio> ejerciciosTonificarCuerpo(){
        ejercicios= new ArrayList<>();
        Ejercicio curlBiceps = new Ejercicio("Curl de Bíceps", 3, 12, 10.0, ExigenciaMuscular.MEDIO, GrupoMuscular.BRAZOS);
        Ejercicio pressBanca = new Ejercicio("Press de Banca", 4, 10, 25.0, ExigenciaMuscular.MEDIO, GrupoMuscular.PECHO);
        Ejercicio remoMancuernas = new Ejercicio("Remo con Mancuernas", 3, 12, 20.0, ExigenciaMuscular.MEDIO, GrupoMuscular.ESPALDA);
        Ejercicio elevacionLaterales = new Ejercicio("Elevaciones Laterales", 3, 15, 5.0, ExigenciaMuscular.BAJO, GrupoMuscular.HOMBROS);
        ejercicios.add(curlBiceps);
        ejercicios.add(pressBanca);
        ejercicios.add(remoMancuernas);
        ejercicios.add(elevacionLaterales);

        return ejercicios;
    }


}
