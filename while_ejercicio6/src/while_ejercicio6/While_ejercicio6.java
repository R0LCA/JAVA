/*
    Ejercicio 6: Realizar un programa que calcule el resultado de elevar un número a
    otro. Para ello, leerá dos números enteros, la base y el exponente, y calculará el
    resultado, mostrándolo en pantalla. No se pueden utilizar las funciones que te
    calculen automáticamente el resultado como, por ejemplo, la función Math.pow.
 */

package while_ejercicio6;

import java.util.Scanner;

public class While_ejercicio6 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.print("Indique un numero entero que será la base: ");
        int base = consola.nextInt();
        System.out.print("Indique un numero entero que será el exponente: ");
        int exponente = consola.nextInt();
        int resultado = 1;
        int i = 0;
        
        while(i<exponente){
            resultado *= base;
            i++;
        }
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
}
}
