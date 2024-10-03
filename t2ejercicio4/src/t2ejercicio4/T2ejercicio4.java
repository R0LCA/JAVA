/* 
    
    TEMA 2
    Ejercicio 4

        Crea un algoritmo que sirva para resolver ecuaciones de segundo grado
        del tipo: ax2+bx+c=0
        Vamos a suponer que a, b y c no van a ser cero nunca

*/

package t2ejercicio4;

import java.util.Scanner;

public class T2ejercicio4 {

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

