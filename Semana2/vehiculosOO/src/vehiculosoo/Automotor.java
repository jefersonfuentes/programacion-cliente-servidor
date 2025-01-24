/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosoo;

/**
 *
 * @author Mario
 */
public class Automotor extends Terrestre {
    protected String Motor;
    
 protected int  cantidadPuertas;
 protected String tipoFrenoEmer;
 protected double Kilometraje;
 protected String permisoCirculacion;

    public Automotor(String Motor, int cantidadPuertas, String tipoFrenoEmer, double Kilometraje, String permisoCirculacion, int cantidadRuedas, String tipoTraccion, String sistemaDireccion, String tipoTransmision, String Marca, String Modelo, String Anno, String Matricula, String Color, String tipoCombustible, double potencia, double maxVelocidad, String tipodefreno, int cantidadPas, double pesoMaximo) {
        super(cantidadRuedas, tipoTraccion, sistemaDireccion, tipoTransmision, Marca, Modelo, Anno, Matricula, Color, tipoCombustible, potencia, maxVelocidad, tipodefreno, cantidadPas, pesoMaximo);
        this.Motor = Motor;
        this.cantidadPuertas = cantidadPuertas;
        this.tipoFrenoEmer = tipoFrenoEmer;
        this.Kilometraje = Kilometraje;
        this.permisoCirculacion = permisoCirculacion;
    }

    @Override
    public String toString() {
        return super.toString() +  " Automotor{" + "Motor=" + Motor + ", cantidadPuertas=" + cantidadPuertas + ", tipoFrenoEmer=" + tipoFrenoEmer + ", Kilometraje=" + Kilometraje + ", permisoCirculacion=" + permisoCirculacion + '}';
    }
    
}
