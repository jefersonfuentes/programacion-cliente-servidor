/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkgabstract.interfaces;

/**
 *
 * @author Laboratorios
 */
public class Canino extends Mamifero {
    protected boolean olfatoDesarrollado;

    public Canino(String nombre, int edad, String tipoPelo, boolean olfatoDesarrollado) {
        super(nombre, edad, tipoPelo);
        this.olfatoDesarrollado = olfatoDesarrollado;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra o aúlla.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre en manadas.");
    }

    @Override
    public void amamantar() {
        System.out.println(nombre + " amamanta a sus crías.");
    }
}
