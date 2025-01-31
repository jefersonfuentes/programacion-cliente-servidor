/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author Laboratorios
 */
public class Triangulo extends Forma {
    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

   

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    @Override
    public void getPerimetro(){
        System.out.println("El perimetro del triangulo es: " + (base + lado2 + lado2));   
    }
    
    @Override
    public void getArea(){
        System.out.println("El area de triangulo es: " + ((base * altura) / 2));   
    }
}
