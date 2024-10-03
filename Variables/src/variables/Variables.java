package variables;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        // Declaro una variable de tipo entero y lo aisgno un valor
        int miVariableEntera = 10;
            System.out.println(miVariableEntera);
        
        // No vuelvo a declarar el tipo (int)
        miVariableEntera = 4;
            System.out.println(miVariableEntera);
            
        // Declaro una variable de tipo real y le asigno un valor
        double numero1 = 1.5;
        double numero2 = 3.5;
            System.out.println(numero1 + numero2);
            
        // Declaro una constante de tipo real
        final double piReal = 3.1416;
            System.out.println(piReal);
            
        // Declaro una cadena de caracteres
        String miVariableCadena = "Saludos";
            System.out.println(miVariableCadena);
            
        String miVariableCadena2 = "Adios";
            System.out.println(miVariableCadena + " y " + miVariableCadena2);
            
        
        // 23/09/2024
        System.out.println("\n---------------");   
        
        // Caracteres de escape
        // Como escribir caracteres especiales. Con el uso de "\".
        
        // EJERCICIO: Representar la cadena de caracteres "Mi primo dijo: "Al final era yo" "
        String frase = "Mi primo dijo: \"Al final era yo\"";
        System.out.println(frase);
        
        
        String saltoDeLinea = "Esto es \n un salto de linea";
        System.out.println(saltoDeLinea);
        
        String tabulacion = "\t Asi meto tabulacion";
        System.out.println(tabulacion);
        
        String barraInversa = "Y de esta forma puedo poner barras inversas: \\";
        System.out.println(barraInversa);
                
        
        // Declaración de valores booleanos
        System.out.println("\n---------------");   
        boolean valor1 = true;
        boolean valor2 = true;
        boolean valor3 = false;
        
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        
        // MODO DEBUG que nos permitira fragmentar el codigo para comprobarlo de forma mas cómoda
        
        // Clase SCANNER
        Scanner consola = new Scanner (System.in);
    }   
}