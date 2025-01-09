package gympal.models;

public class Creido extends Trofeo {


    public Creido( Socio usuarioSocio) {

        super("Creído", "Se otorga este trofeo a quien se pese más de 3 veces al mes.", usuarioSocio);
    }

    @Override
    public void update() {
        if(usuarioSocio.medicionesMaxMes()>3)
            this.otorgado=true;
    }

    @Override
    public boolean verificarCondicion() {
        return false;
    }
}

