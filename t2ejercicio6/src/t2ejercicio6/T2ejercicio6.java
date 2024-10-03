/* 
    
    TEMA 2
    Ejercicio 6

        Codifica un programa que calcule la conversión de:
            a) MegaBytes (MB) a MebiBytes (MiB)
            b) MebiBytes (MiB) a Megabits (Mb)
*/

package t2ejercicio6;

import java.util.Scanner;

public class T2ejercicio6 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        // Declaramos la variable de la relacion entre ambas cantidades
        
        // 1 MegaByte = 10^6 Bytes
        // 1 Mebibyte = 2^20 Bytes
        // 1 Megabit = 1,25*(10^5)
        
        double rel1 = (Math.pow(10,6)/Math.pow(2,20));
        double rel2 = (Math.pow(2,20)/(1.25*(Math.pow(10, 5))));
        
        // Declaramos las variables de los datos solicitados y a calcular
        System.out.println("Indique la cantidad de MegaBytes a convertir a MebiBytes");
        System.out.print("MegaBytes = ");
        double megas = consola.nextDouble(); // Solicitamos el valor a calcular
        double mebis = megas * rel1; // Calculo con la relacion
        System.out.println(megas + " MB son " + mebis + " MIB"); // Representamos el calculo
        
        System.out.println("\nIndique la cantidad de MebiBytes a convertir a Megabits");
        System.out.print("MebiBytes = ");
        mebis = consola.nextDouble(); 
        double megabits = mebis * rel2;
        System.out.println(mebis + " MIB son " + megabits + " Mbit");
                
    
    }
    
}
