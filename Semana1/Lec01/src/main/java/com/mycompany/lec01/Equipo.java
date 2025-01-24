package com.mycompany.lec01;

// Declaracion de clase.
public class Equipo {
    
    // Atributos de la clase.
    private String nombre;
    private String ciudad;
    private int fundacion;
    private String estadio;
    private int cantidadTitulos;
    
    // Metodos de la clase.

    // Constructores
    public Equipo(String nombre, String ciudad, int fundacion, String estadio, int cantidadTitulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.cantidadTitulos = cantidadTitulos;
    }

    public Equipo(String nombre, String ciudad, int fundacion, String estadio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.cantidadTitulos = 5;
    }
    
    // Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getCantidadTitulos() {
        return cantidadTitulos;
    }

    public void setCantidadTitulos(int cantidadTitulos) {
        this.cantidadTitulos = cantidadTitulos;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", ciudad= " + ciudad + ", fundacion= " + fundacion +
                ", estadio= " + estadio + ", cantidadTitulos= " + cantidadTitulos;
    }

}
