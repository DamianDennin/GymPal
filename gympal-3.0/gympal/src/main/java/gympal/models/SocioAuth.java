package gympal.models;

import gympal.controller.SocioController;
import gympal.interfaces.AdapterAuth;

public class SocioAuth implements AdapterAuth {
    SocioController controller= SocioController.getInstance();
    @Override
    public boolean autenticar(String usuario, String password) {
        Socio socio = controller.obtenerSocioPorUsuario(usuario);
        return socio.getPassword().equals(password);
    }
}
