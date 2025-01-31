/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */

// LEÓN (HEREDA DE FELINO, NO ES MASCOTA)
public class Leon extends Felino {
    public Leon(String nombre, int edad, String tipoPelo) {
        super(nombre, edad, tipoPelo, false);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge: ¡ROOOOAR!");
    }

    public void cazar() {
        System.out.println(nombre + " está cazando en la sabana.");
    }
}