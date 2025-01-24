/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosoo;

/**
 *
 * @author Mario
 */
public class Terrestre extends Vehiculo {
 protected int   cantidadRuedas;
protected String tipoTraccion;
protected String sistemaDireccion;
protected String tipoTransmision;

    public Terrestre(int cantidadRuedas, String tipoTraccion, String sistemaDireccion, String tipoTransmision, String Marca, String Modelo, String Anno, String Matricula, String Color, String tipoCombustible, double potencia, double maxVelocidad, String tipodefreno, int cantidadPas, double pesoMaximo) {
        super(Marca, Modelo, Anno, Matricula, Color, tipoCombustible, potencia, maxVelocidad, tipodefreno, cantidadPas, pesoMaximo);
        this.cantidadRuedas = cantidadRuedas;
        this.tipoTraccion = tipoTraccion;
        this.sistemaDireccion = sistemaDireccion;
        this.tipoTransmision = tipoTransmision;
    }
    public void derrapar()
    {
      System.out.println("chichichi!");
    
    }

}
