/*
    TEMA 3
    Ejercicio 8

    Diseña un algoritmo que calcule el mayor de 3 números introducidos
    por el usuario (no usar bucles, se sabe que serán 3 números).
    
    Hay que controlar además, que los valores de introducidos sean correctos:
    números negativos.

*/

package t3ejercicio8;

import java.util.Scanner;

public class T3ejercicio8 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.println("Introduzca 3 numeros negativos");
        System.out.print("\nNumero 1: ");
        double num1 = consola.nextDouble();
        System.out.print("Numero 2: ");
        double num2 = consola.nextDouble();
        System.out.print("Numero 3: ");
        double num3 = consola.nextDouble();
        
        System.out.println("\nLos numeros introducidos son: " + num1 + ", " + num2 + " y " + num3);
    
        if(num1>0 || num2>0 || num3>0){
            System.out.println("Alguno de los valores introducidos es positivo");
            System.out.println("Por favor, vuelva a intentarlo de nuevo");
        }else{
        
        System.out.println("\n");
        if (num1 == num2 || num1 == num3){
            System.out.println("Todos los numeros son iguales");
        }
        else{
            if (num1 > num2 && num1 > num3){
                System.out.println("El numero mayor es: " + num1);
            }
            else if (num2 > num1 && num2 > num3){
                System.out.println("El numero mayor es: " + num2);
            }
            else if (num3 > num1 && num3 > num2){
                System.out.println("El numero mayor es: " + num3);
            }  
        if(num1 < num2 && num1 < num3){
            System.out.println("El numero menor es: " + num1);
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println("El numero menor es: " + num2);
        }else System.out.println("El numero menor es: " + num3);
        }
    }

}
}