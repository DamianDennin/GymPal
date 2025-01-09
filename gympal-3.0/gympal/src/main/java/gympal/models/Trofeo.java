package gympal.models;

import gympal.dto.TrofeoDTO;

import java.util.List;

public abstract class Trofeo {
    protected String nombre;
    protected String descripcion;
    protected boolean otorgado;
    protected Socio usuarioSocio;


    public Trofeo(String nombre, String descripcion, Socio usuarioSocio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuarioSocio = usuarioSocio;
        this.otorgado = false;
    }

    public abstract void update(); //para cada trofeo que necesite observar


    // Método abstracto para verificar si se cumple la condición del trofeo
    public abstract boolean verificarCondicion();

    // Método para otorgar el trofeo si se cumple la condición
    public void otorgarTrofeo() {
        if (verificarCondicion()) {
            this.otorgado = true;
            System.out.println("El trofeo '" + nombre + "' ha sido otorgado al socio con usuario: " + usuarioSocio.getUsuario());
        } else {
            System.out.println("El socio con usuario: " + usuarioSocio.getUsuario() + " aún no cumple con los requisitos para el trofeo '" + nombre + "'.");
        }
    }

    // Método para mostrar la información del trofeo
    public void mostrarInfo() {
        System.out.println("Trofeo: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Otorgado: " + (otorgado ? "Sí" : "No"));
    }
    //metodo para crear DTO
    public TrofeoDTO toTrofeoDTO(){
        return new TrofeoDTO(this.nombre,this.descripcion,this.otorgado);
    }

}

