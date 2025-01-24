/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosoo;

/**
 *
 * @author Mario
 */
public class Vehiculo {
    
  protected String  Marca;
  protected String Modelo;
  protected String Anno;
  protected String Matricula;
  protected String Color;
  protected String tipoCombustible;
  protected double potencia;
  protected double maxVelocidad;
  protected String tipodefreno;
  protected int cantidadPas;
  protected double pesoMaximo;

    public Vehiculo(String Marca, String Modelo, String Anno, String Matricula, String Color, String tipoCombustible, double potencia, double maxVelocidad, String tipodefreno, int cantidadPas, double pesoMaximo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Anno = Anno;
        this.Matricula = Matricula;
        this.Color = Color;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
        this.maxVelocidad = maxVelocidad;
        this.tipodefreno = tipodefreno;
        this.cantidadPas = cantidadPas;
        this.pesoMaximo = pesoMaximo;
    }
    public void Acelerar()
    {
           System.out.println("Rum Rum!");
    }
   public void Frenar()
   {
        System.out.println("Quieto ahi!");
   }
   public void girar()
   {
        System.out.println("girando....!");
   }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Anno=" + Anno + ", Matricula=" + Matricula + ", Color=" + Color + ", tipoCombustible=" + tipoCombustible + ", potencia=" + potencia + ", maxVelocidad=" + maxVelocidad + ", tipodefreno=" + tipodefreno + ", cantidadPas=" + cantidadPas + ", pesoMaximo=" + pesoMaximo + '}';
    }
}
