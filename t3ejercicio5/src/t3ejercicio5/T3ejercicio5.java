/*
    TEMA 3
    Ejercicio 5

    Se necesita un algoritmo que calcule la media de tres notas
    introducidas por teclado y en caso de que esa media sea superior a 6.5, se
    muestre por pantalla
    ‘Promocionado con una media de XX’. En caso contrario, mostrar ‘No
    promocionas’.

*/
package t3ejercicio5;

import java.util.Scanner;

public class T3ejercicio5 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.println("Introduzca tres notas.");
        System.out.print("\nNota 1: ");
        double nota1 = consola.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = consola.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = consola.nextDouble();
    
        double media = (nota1+nota2+nota3) / 3;
        
        String resultado = (media > 6.5) ? ("\nPromocionas con media de " + media) : ("\nNo promocionas");
        System.out.println(resultado);
    }
    
}
