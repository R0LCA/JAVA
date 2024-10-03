/* 
    
    TEMA 2
    Ejercicio 7

    Se necesita un algoritmo que calcule el coste total de baldosas
    cuadradas necesarias para cubrir el suelo de una habitación rectangular. El
    programa solicitará como datos las dimensiones de la habitación en metros
    (ancho y largo), el lado de cada baldosa expresado en centímetros y el precio por
    baldosa expresado en euros.
    Con esos datos calculará el número de baldosas necesarias que hay que colocar
    en la habitación (redondeando hacia arriba si el resultado no es un numero
    entero) y el precio total a invertir.
*/

package t2ejercicio7;

import java.util.Scanner;

public class T2ejercicio7 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        // Declaramos las variables a solicitar al usuario
        System.out.print("Indica el ancho de la sala en metros: ");
        double wSala = consola.nextDouble();
        System.out.print("Indica el largo de la sala en metros: ");
        double hSala = consola.nextDouble();
        System.out.print("Indica el lado de las baldosas en centimetros: ");
        double ladoBaldosa = consola.nextDouble() / 100;
        System.out.print("Indica el precio por baldosas en euros: ");
        double precioBaldosa = consola.nextDouble();
        
        // Programamos la calculadora que nos dara las baldosas necesarias y su preio total
        double areaSala = wSala * hSala; // Sacamos el area de la sala
        double areaBaldosa = Math.pow(ladoBaldosa, 2); // El area de cada baldosa
        
        double numBaldosas = areaSala / areaBaldosa; // El numero de baldosas
                
        double precioTotal =  numBaldosas * precioBaldosa; // El precio total de baldosas.
        
        System.out.println("\n");
        System.out.println("Teniendo en cuenta que necesitaremos " + numBaldosas + " baldosas");
        System.out.println("Para cubrir los " + areaSala + " metros cuadrados de la sala");
        System.out.println("El coste total sera de " + precioTotal + " euros");
    }
    
    
}