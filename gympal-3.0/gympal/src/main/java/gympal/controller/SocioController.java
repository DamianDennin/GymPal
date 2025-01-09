package gympal.controller;

import fit.gympal.models.BajarPeso;
import fit.gympal.models.MantenerFigura;
import fit.gympal.models.TonificarCuerpo;
import gympal.dto.SocioDTO;
import gympal.models.Objetivo;
import gympal.models.Socio;

import java.util.ArrayList;
import java.util.List;

public class SocioController {
    private static SocioController INSTANCE = null;
    private static List<Socio> socios;

        private SocioController() {
            socios = new ArrayList<>();
        }

        public static SocioController getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new SocioController();
            }
            return INSTANCE;
        }

    public void crearSocio(SocioDTO dto){
        Objetivo objetivo =obtenerObjetivoPorNombre(dto.getObjetivo());
        Socio socio= new Socio(dto.getNombre(),Integer.parseInt(dto.getEdad()),dto.getSexo(),Double.parseDouble(dto.getPeso()),Double.parseDouble(dto.getAltura()),objetivo , dto.getUsuario(),dto.getPassword());
        socios.add(socio);
    }

        public Socio obtenerSocioPorUsuario(String usuario) {
            for (Socio socio : socios) {
            if (socio.getUsuario().equals(usuario)) {
                return socio;
            }
        }
        return null;
    }

    private Objetivo obtenerObjetivoPorNombre(String nombreObjetivo) {
        Objetivo objetivo;
        if (nombreObjetivo=="Tonificar Cuerpo"){
            objetivo= new TonificarCuerpo();

        } else if (nombreObjetivo=="Mantener Figura") {
            objetivo= new MantenerFigura();

        }else {
            objetivo= new BajarPeso();
        }
        return objetivo; // Código de ejemplo, devuelve el Objetivo adecuado.
    }
}
