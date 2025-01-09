package gympal.interfaces;

import java.util.Date;

import gympal.models.Medicion;

public interface AdapterMedicion {



    // Método para obtener el porcentaje de masa muscular adaptado
    public double obtenerPorcentajeMusculo(Medicion medicion);

    // Método para obtener el porcentaje de grasa corporal adaptado
    public double obtenerPorcentajeDeGrasa(Medicion medicion);
}
