/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */
// GATO (HEREDA DE FELINO Y ES UNA MASCOTA)
public class Gato extends Felino implements Mascota {
    public Gato(String nombre, int edad, String tipoPelo) {
        super(nombre, edad, tipoPelo, true);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maulla: ¡Miau!");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega con una bola de lana.");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre + " se frota contra tu pierna.");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando...");
    }
}
