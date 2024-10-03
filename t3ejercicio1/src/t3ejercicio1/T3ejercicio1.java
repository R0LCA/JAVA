/* 
    
    TEMA 3
    Ejercicio 1

        Del Ejercicio 4 del Tema 2
        Comprueba si el determinante es negativo para avisar de 
        que no tiene solución dentro de los números reales.

*/


package t3ejercicio1;

import java.util.Scanner;

public class T3ejercicio1 {


    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.println("------------------------------------------");
        System.out.println("CALCULADORA DE ECUCACIONES DE SEGUNDO GRADO");
        System.out.println("------------------------------------------");
        System.out.println("\nax+b=0");
        System.out.println("Por favor introduzca los valores de a, b y c");
        
        System.out.print("\na = ");
        double a = consola.nextDouble();
        System.out.print("b = ");
        double b = consola.nextDouble();
        System.out.print("c = ");
        double c = consola.nextDouble();
        
        double discriminante = Math.pow(b,2) - 4*a*c;
        double raiz = Math.sqrt(discriminante);
        
        double x1 = (-b+raiz)/(2*a);
        double x2 = (-b-raiz)/(2*a);
        
        if(discriminante < 0){
            System.out.println("No tiene solucion con numeros reales");
        }
        else{
        System.out.println("\nLas soluciones de la ecuacion son");
        System.out.println("x1= " + x1);
        System.out.println("x2= " + x2);
        }
    
    }
    
}
