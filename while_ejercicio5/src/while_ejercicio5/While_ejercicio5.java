/*
    Ejercicio 5: Mejora el ejercicio 3 de condicionales (minuto partido de futbol)
    añadiendo lo siguiente:
        - Impide la entrada de segundos máximos (5400). Si el usuario se pasa, saca
        un mensaje por pantalla indicándolo y vuelve a pedir el número.
        - El programa no termina hasta que el usuario mete un numero negativo.
 */

package while_ejercicio5;

import java.util.Scanner;

public class While_ejercicio5 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);


    System.out.println("Escribe el segundo de juego: ");
    int segundo = consola.nextInt();
    int minuto = segundo / 60 + 1;
    while(segundo > 5400){
        System.out.println("Un partido dura 5400 segundos como maximo");
        segundo = consola.nextInt();
    }
    System.out.println("Teniendo en cuenta que estamos en el segundo " + segundo + ", estamos en el minuto " + minuto + " de juego");
}
    
    
}