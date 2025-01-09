package gympal.models;


import gympal.interfaces.AdapterMedicion;

public class SistemaExternoAdapter implements AdapterMedicion {


    @Override
    public double obtenerPorcentajeMusculo(Medicion medicion) {
        return 0;
    }

    @Override
    public double obtenerPorcentajeDeGrasa(Medicion medicion) {
        return 0;
    }
}

