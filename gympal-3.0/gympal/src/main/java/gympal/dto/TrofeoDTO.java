package gympal.dto;

import gympal.models.Socio;

public class TrofeoDTO {
    protected String nombre;
    protected String descripcion;
    protected boolean otorgado;


    public TrofeoDTO(String nombre, String descripcion, boolean otorgado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.otorgado = otorgado;
    }
}
