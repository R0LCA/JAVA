/*
    Ejercicio 7: Desarrolla un algoritmo que pida 5 elementos por teclado y
    continuación muestre la suma de todos los elementos, la suma de aquellos
    números mayores a 36 y la suma de aquellos números menores a 10. Nota: no
    puedes usar 5 variables.

*/

package while_ejercicio7;

import java.util.Scanner;

public class While_ejercicio7 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    double sumaGlobal = 0;
    double sumaMayores36 = 0;
    double sumaMenores10 = 0;
    double num = 0;
    double contador = 0;
    
    while(contador != 5){
        System.out.print("Numero: ");
        num = consola.nextDouble();
        if (num>36) sumaMayores36 += num;
        if (num<10) sumaMenores10 += num;
        sumaGlobal += num;
        contador++;
    }    
        System.out.println("\nRESULTADOS:");
        System.out.println("-------------");
        System.out.println("Suma total = " + sumaGlobal);
        System.out.println("Suma mayores de 36 = " + sumaMayores36);
        System.out.println("Suma menores de 10 = " + sumaMenores10);
    
}
}
