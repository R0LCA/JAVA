/* 
    
    TEMA 2
    Ejercicio 5

        Crea un programa que, tomando como dato por teclado la cantidad de Mbps 
        que tiene una línea, calcule cual será la descarga máxima de esa línea 
        en MiB por segundo.

*/

package t2ejercicio5;

import java.util.Scanner;

public class T2ejercicio5 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        // Declaramos la variable de la relacion entre ambas cantidades
        
        // 1 MegaByte = 10^6 Bytes
        // 1 Mebibyte = 2^20 Bytes
        
        double rel = (Math.pow(10,6)/Math.pow(2,20));
        
        
        // Declaramos las variables de los datos solicitados y a calcular
        System.out.println("Indique la cantidad de MB/s de la linea");
        double megas = consola.nextDouble();
        double mebis = megas * rel;
        
        // Representamos la calculadora
        
        System.out.println(megas + " MB/s son " + mebis + " MIB/s");
    
    }
    
}

