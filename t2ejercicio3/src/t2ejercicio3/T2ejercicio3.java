/* 
    
    TEMA 2
    Ejercicio 3

        Crea un algoritmo que sirva para resolver ecuaciones de primer grado
        del tipo: ax+b=0
        Vamos a suponer que a y b no van a ser cero nunca

*/

package t2ejercicio3;

import java.util.Scanner;

public class T2ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        System.out.println("------------------------------------------");
        System.out.println("CALCULADORA DE ECUCACIONES DE PRIMER GRADO");
        System.out.println("------------------------------------------");
        System.out.println("\nax+b=0");
        System.out.println("Por favor introduzca los valores de a y b");
        
        System.out.print("\na = ");
        double a = consola.nextDouble();
        System.out.print("b = ");
        double b = consola.nextDouble();
        
        double x = -b/a;
        
        System.out.println("\nEl resultado de " + a + "x+" + b + "=0 es: ");
        System.out.println("x= " + x);
        
        
    
    }
    
}

