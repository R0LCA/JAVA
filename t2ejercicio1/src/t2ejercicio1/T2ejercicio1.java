/* 
    
    TEMA 2
    Ejercicio 1

        Diseña un algoritmo que pida por teclado un tiempo expresado en
        segundos y muestre por pantalla ese valor expresado en horas, minutos y
        segundos.

*/

package t2ejercicio1;

import java.util.Scanner;

public class T2ejercicio1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Exprese un tiempo en segundos, este sera expresado en horas, minutos y segundos");
        double total = consola.nextDouble();
        int totalTruncado = (int)total;
        
        int segundos = totalTruncado % 60;
        int minutos = (totalTruncado / 60) % 60;
        int horas = totalTruncado / 3600;
        
        System.out.println("\n\n");
        
        System.out.println(total + " segundos son: ");
        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }
    
}
