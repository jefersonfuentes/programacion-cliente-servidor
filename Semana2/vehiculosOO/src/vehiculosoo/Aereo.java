/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosoo;

/**
 *
 * @author Mario
 */
public class Aereo extends Vehiculo {
    
  protected double  altitudMaxima;
protected boolean tieneTurbina;
protected int cantidadRuedas;

    public Aereo(double altitudMaxima, boolean tieneTurbina, int cantidadRuedas, String Marca, String Modelo, String Anno, String Matricula, String Color, String tipoCombustible, double potencia, double maxVelocidad, String tipodefreno, int cantidadPas, double pesoMaximo) {
        super(Marca, Modelo, Anno, Matricula, Color, tipoCombustible, potencia, maxVelocidad, tipodefreno, cantidadPas, pesoMaximo);
        this.altitudMaxima = altitudMaxima;
        this.tieneTurbina = tieneTurbina;
        this.cantidadRuedas = cantidadRuedas;
    }
public void despegar()
{
      System.out.println("que miedo!");
}
public void  aterrizar()
{
  System.out.println("sano y salvo!");

}
}
