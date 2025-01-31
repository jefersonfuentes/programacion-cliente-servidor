/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */

// PERRO (HEREDA DE CANINO Y ES UNA MASCOTA)
public class Perro extends Canino implements Mascota {
    public Perro(String nombre, int edad, String tipoPelo) {
        super(nombre, edad, tipoPelo, true);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau Guau!");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega con su dueño.");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre + " mueve la cola felizmente.");
    }
}
