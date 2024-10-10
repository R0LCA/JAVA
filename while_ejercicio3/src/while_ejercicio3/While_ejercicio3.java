/*
    Ejercicio 3: Realizar un algoritmo que pida por teclado un numero entero y a
    continuación muestre todos los divisores de ese número. (Un divisor es aquel que
    nos da resto 0)
 */

package while_ejercicio3;

import java.util.Scanner;

public class While_ejercicio3 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.println("Indique un numero entero para mostrar sus divisores: ");
    int num = consola.nextInt();
    int cuenta = 1;
    
        System.out.println("Los divisores de " + num + " son:");
    while(cuenta <= num){
        if(num % cuenta == 0){
            System.out.println(cuenta);
        }
        cuenta++;
    }
    
    
    
    
}
}
