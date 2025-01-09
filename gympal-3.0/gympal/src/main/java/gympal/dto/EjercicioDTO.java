package gympal.dto;

import gympal.enums.ExigenciaMuscular;
import gympal.enums.GrupoMuscular;

public class EjercicioDTO {
    private String nombre;
    private String series;
    private String repeticiones;
    private String pesoAsignado;
    private GrupoMuscular grupoMuscular;
    private ExigenciaMuscular exigenciaMuscular;

    // Constructor
    public EjercicioDTO(String nombre, int series, int repeticiones, double pesoAsignado, GrupoMuscular grupoMuscular, ExigenciaMuscular exigenciaMuscular) {
        this.nombre = nombre;
        this.series = String.valueOf(series);
        this.repeticiones = String.valueOf(repeticiones);
        this.pesoAsignado = String.valueOf(pesoAsignado);
        this.grupoMuscular = grupoMuscular;
        this.exigenciaMuscular = exigenciaMuscular;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getSeries() {
        return series;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public String getPesoAsignado() {
        return pesoAsignado;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public ExigenciaMuscular getExigenciaMuscular() {
        return exigenciaMuscular;
    }
}


