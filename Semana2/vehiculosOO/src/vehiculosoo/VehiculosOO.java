/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculosoo;

/**
 *
 * @author Mario
 */
public class VehiculosOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // public Motocicleta(String tipoMarco, 
        Motocicleta miMoto = new Motocicleta("cuadrado",0,"1000",0,"No tiene",5000,"No",2,"Trasera","Manual","Automatica","Honda","Navi","2000","MOT 900","Roja","Gasolina",900.9,150,"ABS",2,100);
   miMoto.setMarca("BMW");
   miMoto.Acelerar();
   miMoto.Frenar();
   miMoto.derrapar();
   miMoto.levantarRuedaDelantera();
   miMoto.levantarRuedaTrasera();
    System.out.println(miMoto.toString());
    }
    
}
