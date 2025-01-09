package gympal.states;

import gympal.dto.SocioDTO;
import gympal.interfaces.EstadoObjetivo;
import gympal.models.Socio;

public class EnProgreso implements EstadoObjetivo {
    private  boolean cumplido= false;


    @Override
    public void cumplirObjetivo(Socio socio) {
        socio.getObjetivo().setEstado(new Cumplido());

    }

    @Override
    public void verProgreso(Socio socio) {
    }

    public boolean isCumplido() {
        return cumplido;
    }
}

