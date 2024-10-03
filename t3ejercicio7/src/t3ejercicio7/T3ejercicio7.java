/*
    TEMA 3
    Ejercicio 7

    Diseña un algoritmo que calcule el mayor de 5 números introducidos
    por el usuario (no usar bucles, se sabe que serán 5 números).
    
    Hay que controlar además, que los valores de introducidos sean correctos:
    números positivos.

*/

package t3ejercicio7;

import java.util.Scanner;

public class T3ejercicio7 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.println("Introduzca 5 numeros positivos");
        System.out.print("\nNumero 1: ");
        double num1 = consola.nextDouble();
        System.out.print("Numero 2: ");
        double num2 = consola.nextDouble();
        System.out.print("Numero 3: ");
        double num3 = consola.nextDouble();
        System.out.print("Numero 4: ");
        double num4 = consola.nextDouble();
        System.out.print("Numero 5: ");
        double num5 = consola.nextDouble();
    
        if(num1<0 || num2<0 || num3<0 || num4<0 || num5<0){
            System.out.println("Alguno de los valores introducidos son negativos");
            System.out.println("Por favor, vuelva a intentarlo de nuevo");
        }else{
        
        System.out.println("\n");
        if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5){
            System.out.println("Todos los numeros son iguales");
        }
        else{
            if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
                System.out.println("El numero mayor es: " + num1);
            }
            else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
                System.out.println("El numero mayor es: " + num2);
            }
            else if (num3 > num1 && num3 > num2 && num2 > num4 && num2 > num5){
                System.out.println("El numero mayor es: " + num3);
            }
            else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
                System.out.println("El numero mayor es: " + num4);
            }else System.out.println("El numero mayor es: " + num5);   
        }
        }
    }

}
