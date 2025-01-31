/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */

// SEGUNDO NIVEL
public abstract class Mamifero extends Animal {
    protected String tipoPelo;

    public Mamifero(String nombre, int edad, String tipoPelo) {
        super(nombre, edad);
        this.tipoPelo = tipoPelo;
    }

    public abstract void amamantar(); // Método abstracto
}
