/*
    TEMA 3
    Ejercicio 6.2

    Realizar un algoritmo que pida por teclado dos números. Si el primero
    es mayor al segundo, mostrar la resta y la división de ambos. Si el segundo es
    mayor o igual al primero, mostrar la suma y el producto de ambos.

*/

package t3ejercicio6_2;

import java.util.Scanner;

public class T3ejercicio6_2 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.println("Introduzca dos numeros.");
        System.out.print("\nNumero 1: ");
        double num1 = consola.nextDouble();
        System.out.print("Numero 2: ");
        double num2 = consola.nextDouble();
        
        System.out.println("\n");
        if (num1 > num2){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else{
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
    }

}
