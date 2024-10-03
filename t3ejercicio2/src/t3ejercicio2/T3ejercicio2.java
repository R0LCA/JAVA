/* 
    
    TEMA 3
    Ejercicio 2

        Del Ejercicio 6 del Tema 2
        Muestra las dos opciones de conversión al usuario para que por teclado escoja la
        conversión que quiere realizar y en función de eso solicita los MegaBytes (MB) ó los
        MebiBytes para hacer la conversión adecuada
*/

package t3ejercicio2;

import java.util.Scanner;

public class T3ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        // Declaramos la variable de la relacion entre ambas cantidades
        
        // 1 MegaByte = 10^6 Bytes
        // 1 Mebibyte = 2^20 Bytes
        // 1 Megabit = 1,25*(10^5)
        
        double rel1 = (Math.pow(10,6)/Math.pow(2,20));
        double rel2 = (Math.pow(2,20)/(1.25*(Math.pow(10, 5))));
        
        // Solicitamos la convesion que desee hacer el usuario
        System.out.println("------------------");
        System.out.println("MENU DE CONVERSION");
        System.out.println("------------------");
        System.out.println("Eliga una de ambas opciones.");
        System.out.println("\n1. De MegaBytes a MebiBytes");
        System.out.println("2. De MebiBytes a Megabits");
        System.out.print("\nOpcion: ");
        int num = consola.nextInt();
        
        // Declaramos las variables de los datos solicitados y a calcular
        if(num == 1){
        System.out.println("\nIndique la cantidad de MegaBytes a convertir a MebiBytes");
        System.out.print("MegaBytes = ");
        double megas = consola.nextDouble(); // Solicitamos el valor a calcular
        double mebis = megas * rel1; // Calculo con la relacion
        System.out.println("\n" + megas + " MB son " + mebis + " MIB"); // Representamos el calculo
        }
        
        if(num==2){
        System.out.println("\nIndique la cantidad de MebiBytes a convertir a Megabits");
        System.out.print("MebiBytes = ");
        double mebis = consola.nextDouble(); 
        double megabits = mebis * rel2;
        System.out.println("\n" + mebis + " MIB son " + megabits + " Mbit");
        }  
    
    }
    
}