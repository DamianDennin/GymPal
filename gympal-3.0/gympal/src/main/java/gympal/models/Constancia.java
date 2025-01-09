package gympal.models;

public class Constancia extends Trofeo {

    public Constancia(Socio usuarioSocio) {
        super("Constacia", "se otorga este trofeo a aquellos socios que cumplen a la perfección con las rutinas", usuarioSocio);
    }

    @Override
    public void update() {
    if (usuarioSocio.verificarCuplimientoRutinas()){
        this.otorgado = true;
        }
    }

    @Override
    public boolean verificarCondicion() {
        return false;
    }
}
