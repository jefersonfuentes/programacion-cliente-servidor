/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author Laboratorios
 */
public class Circulo extends Forma implements Dibujo{
    private double radio;
    private final double PI = 3.14;
    
    
    public double getRadio() {
        return radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void getPerimetro(){
        System.out.println("El perimetro del circulo es: " + this.radio * this.PI);   
    }
    
    @Override
    public void getArea(){
        System.out.println("El area de circulo es: "+ (this.PI * (this.radio * this.radio)));   
    }
    
    @Override
    public void dibujar(){
        System.out.println("O");
    }
}
