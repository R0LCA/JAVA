/*
    TEMA 3
    Ejercicio 6

    Solicitar que el usuario introduzca una clave dos veces. Mostrar un
    mensaje indicando si las claves son iguales o si son diferentes.

*/

package t3ejercicio6;

import java.util.Scanner;

public class T3ejercicio6 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.print("Introduza una clave de acceso: ");
        String pass1 = consola.nextLine();
        System.out.print("Repita la clave de acceso: ");
        String pass2 = consola.nextLine();
    
        if(pass1.equals(pass2)){
            System.out.println("\nLas claves coinciden");
        }else System.out.println("\nLas claves no coinciden");
    }

}
