package gympal.models;

import gympal.interfaces.EstadoObjetivo;
import gympal.states.Cumplido;

public class Dedicacion extends Trofeo {

    public Dedicacion(Socio usuarioSocio) {
        super("Dedicación", "se otorga este trofeo a aquellos socios que cumplen con su objetivo.", usuarioSocio);
    }

    @Override
    public void update() {
        if(usuarioSocio.getObjetivo().estado instanceof Cumplido)
            this.otorgado=true;
    }

    @Override
    public boolean verificarCondicion() {
        return false;
    }
}


