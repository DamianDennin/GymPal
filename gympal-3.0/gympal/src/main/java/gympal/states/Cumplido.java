package gympal.states;

import gympal.interfaces.EstadoObjetivo;
import gympal.models.Socio;

public class Cumplido implements EstadoObjetivo {

    private  boolean cumplido= true;

    @Override
    public void cumplirObjetivo(Socio socio) {
        System.out.println("El objetivo fue cumplido");
    }

    @Override
    public void verProgreso(Socio socio) {
    }

    public boolean getCumplido(){
        return cumplido;
    }
}
