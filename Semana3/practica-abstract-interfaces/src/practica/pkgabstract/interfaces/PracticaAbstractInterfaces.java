/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */
public class PracticaAbstractInterfaces {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Gato gato = new Gato("Milo", 3, "Corto");
        Perro perro = new Perro("Rex", 5, "Medio");
        Leon leon = new Leon("Simba", 7, "Largo");

        System.out.println("=== Información del Gato ===");
        gato.mostrarInfo();
        gato.hacerSonido();
        gato.jugar();
        gato.mostrarCarino();
        gato.ronronear();

        System.out.println("\n=== Información del Perro ===");
        perro.mostrarInfo();
        perro.hacerSonido();
        perro.jugar();
        perro.mostrarCarino();

        System.out.println("\n=== Información del León ===");
        leon.mostrarInfo();
        leon.hacerSonido();
        leon.moverse();
        leon.cazar();
    }
    
}
