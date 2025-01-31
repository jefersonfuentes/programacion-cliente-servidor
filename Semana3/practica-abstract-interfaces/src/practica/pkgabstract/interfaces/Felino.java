/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */

// TERCER NIVEL - CLASES CONCRETAS
public class Felino extends Mamifero {
    protected boolean garrasRetractiles;

    public Felino(String nombre, int edad, String tipoPelo, boolean garrasRetractiles) {
        super(nombre, edad, tipoPelo);
        this.garrasRetractiles = garrasRetractiles;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido felino.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve sigilosamente.");
    }

    @Override
    public void amamantar() {
        System.out.println(nombre + " amamanta a sus crías.");
    }
}
