/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author Laboratorios
 */
public class Cuadrado extends Forma implements Dibujo {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void getPerimetro(){
        System.out.println("El perimetro del cuadrado es: " + (lado* 4));   
    }
    
    @Override
    public void getArea(){
        System.out.println("El area de cuadrado es: " + (lado * lado));   
    }
    
    
    @Override
    public void dibujar(){
        System.out.println("|_|");
    }
}
