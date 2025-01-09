package gympal.dto;


import gympal.models.Trofeo;

import java.util.List;

public class SocioDTO {
    private String nombre;
    private String edad;
    private String sexo;
    private String peso;
    private String altura;
    private String objetivo;
    private String usuario;
    private String password;
    private  String grasa;
    private String musculo;
    private List<TrofeoDTO> trofeos;
    public String getNombre() {
        return nombre;
    }

    public String getGrasa() {
        return grasa;
    }

    public String getMusculo() {
        return musculo;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPeso() {
        return peso;
    }

    public String getAltura() {
        return altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public SocioDTO(String nombre, String edad, String sexo, String peso,String grasa,String musculo, String altura, String objetivo, String usuario, String password,List<TrofeoDTO> trofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.grasa=grasa;
        this.musculo=musculo;
        this.altura = altura;
        this.objetivo = objetivo;
        this.usuario = usuario;
        this.password = password;
        this.trofeos = trofeos;
    }
    public SocioDTO(String nombre, String edad, String sexo, String peso,String grasa,String musculo, String altura, String objetivo, String usuario, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.grasa=grasa;
        this.musculo=musculo;
        this.altura = altura;
        this.objetivo = objetivo;
        this.usuario = usuario;
        this.password = password;
    }


}
