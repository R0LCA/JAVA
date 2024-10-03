/*
    TEMA 3
    Ejercicio 9

    Realiza un algoritmo que indique si un año es bisiesto o no. Un año es
    bisiesto si es divisible entre 4 y no es divisible entre 100 o es divisible 
    entre 400.

*/

package t3ejercicio9;

import java.util.Scanner;

public class T3ejercicio9 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.print("Introduzca un anio para saber si es bisiesto: ");
        int año = consola.nextInt();
        
        System.out.println("\n");
        if ( (año % 4 == 0 && año % 100 !=0) || año % 400 == 0){
            System.out.println("Es bisiesto");
        }else System.out.println("No es bisiesto");
    
    }

}
