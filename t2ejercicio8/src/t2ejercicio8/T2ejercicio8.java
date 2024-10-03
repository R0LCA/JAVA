/* 
    
    TEMA 2
    Ejercicio 8

    Se necesita un algoritmo que calcule el coste total de baldosas
    cuadradas necesarias para cubrir el suelo de una habitación rectangular. El
    programa solicitará como datos las dimensiones de la habitación en metros
    (ancho y largo), el lado de cada baldosa expresado en centímetros y el precio por
    baldosa expresado en euros.
    Con esos datos calculará el número de baldosas necesarias que hay que colocar
    en la habitación (redondeando hacia arriba si el resultado no es un numero
    entero) y el precio total a invertir.
*/

package t2ejercicio8;

import java.util.Scanner;

public class T2ejercicio8 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        
        System.out.println("Escribe el segundo de juego: ");
        int segundo = consola.nextInt();
        int minuto = segundo / 60 + 1;
        
        System.out.println("Teniendo en cuenta que estamos en el segundo " + segundo + ", estamos en el minuto " + minuto + " de juego");
    }
    
    
}