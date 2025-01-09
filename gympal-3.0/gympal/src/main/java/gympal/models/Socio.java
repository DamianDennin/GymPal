package gympal.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import gympal.dto.SocioDTO;
import gympal.dto.TrofeoDTO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private Objetivo objetivo;
    private Rutina rutina;
    private List<Trofeo> trofeos;
    private String usuario;
    private String password;
    private List<Medicion> mediciones;
    private double porcentajeGrasa;
    private double porcentajeMusculo;
    SocioAuth autenticador;

    public Socio(String nombre, int edad, String sexo, double peso, double altura, Objetivo objetivo, String usuario, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
        this.usuario = usuario;
        this.password=password;
        this.rutina=objetivo.crearRutina(objetivo);
        this.mediciones= new ArrayList<>();
        autenticador = new SocioAuth();
        this.porcentajeGrasa=0;
        this.porcentajeMusculo=0;
        this.trofeos=new ArrayList<Trofeo>();
        this.trofeos.add(new Dedicacion(this));
        this.trofeos.add(new Constancia(this));
        this.trofeos.add(new Creido(this));
    }

    public boolean autenticar(String usuario,String password){
        return autenticador.autenticar(usuario,password);
    }

    public void editarObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
        Rutina rutina=nuevoObjetivo.crearRutina(nuevoObjetivo);
        this.setRutina(rutina);
    }


    public void agregarMedicion (Medicion medicion) {
        this.mediciones.add(medicion);
        setPorcentajeMusculo(medicion.getMasaMuscular());
        setPorcentajeGrasa(medicion.getPorcentajeGrasa());
        setPeso(medicion.getPeso());
    }

    // Método para convertir el Socio a SocioDTO
    public SocioDTO toDTO() {
        List<TrofeoDTO> trofeosDTO=new ArrayList<>();
        for (Trofeo t:this.trofeos)
            trofeosDTO.add(t.toTrofeoDTO());
        return new SocioDTO(this.nombre,String.valueOf(this.edad),this.sexo,String.valueOf(this.peso),String.valueOf(this.porcentajeGrasa),String.valueOf(porcentajeMusculo),String.valueOf(this.altura),this.objetivo.nombre,this.usuario,this.password,trofeosDTO);
    }

    // Metodo para notifacr observers
    public void notificarObservers(){
        for (Trofeo trofeo : this.trofeos){
            trofeo.update();
        }
    }
    //Metodo para saber si el usuario completa su rutina
    public boolean verificarCuplimientoRutinas(){
        return rutina.verificarCumplimiento();
    }
    //metodo para ver mediciones maximas por mes
    public int medicionesMaxMes(){
         return 0; //Agregar logica
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }



    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public List<Trofeo> getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(List<Trofeo> trofeos) {
        this.trofeos = trofeos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(List<Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public void setPorcentajeGrasa(double porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }

    public double getPorcentajeMusculo() {
        return porcentajeMusculo;
    }

    public void setPorcentajeMusculo(double porcentajeMusculo) {
        this.porcentajeMusculo = porcentajeMusculo;
    }



}
