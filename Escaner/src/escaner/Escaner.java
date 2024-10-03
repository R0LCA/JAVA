package escaner;

import java.util.Scanner;

public class Escaner {

    public static void main(String[] args) {
        
        // Creamos el objeto consola de la clase Scanner
        Scanner consola = new Scanner (System.in);
        
        // Creamos las variables que va a solicitar una cadena, un numero... escrito por el usuario
        System.out.println("Escribe tu nombre por favor.");
        String nombre = consola.nextLine();
        
        System.out.println("Dinos tu edad");
        int edad = consola.nextInt();
        
        System.out.println("Introduce tu nota");
        double nota = consola.nextDouble();
        
        
        // Mostramos el resultado
        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es de " + edad);
        System.out.println("Tu nota es " + nota);
 
    }    
}