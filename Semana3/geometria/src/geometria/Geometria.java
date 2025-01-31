/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometria;

/**
 *
 * @author Jeferson
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el objeto formaGeometrica del tipo Forma puede instanciar a las subclases.
        Forma formaGeometrica = new Circulo(23);
        formaGeometrica.getPerimetro();
        formaGeometrica.getArea();
        
        formaGeometrica = new Cuadrado(40);
        
        formaGeometrica.getPerimetro();
        formaGeometrica.getArea();
        formaGeometrica.dibujar();
        
        formaGeometrica = new Triangulo(40, 5, 6, 8);
        
        formaGeometrica.getPerimetro();
        formaGeometrica.getArea();
        
        
                
    }
    
}
