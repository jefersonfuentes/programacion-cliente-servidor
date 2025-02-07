/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author DOCENTE - 106
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorPersonalizado {
        // TODO code application logic here
        
        while (true){
            // Mensaje de bienvenida al usuario
            System.out.println("Bienvenido al sistema de validacion de vocabulario");
            System.out.println("Escribe una palabra y demuestranos tu lexico");
            Scanner scanner = new Scanner(System.in);
            String palabra = scanner.nextLine();
             
        if ("mae".equals(palabra)) {
            throw new ErrorPersonalizado("No debes decir eso....");
        }
          System.out.println("Todo un caballero");
        }
        
    }
    
}
