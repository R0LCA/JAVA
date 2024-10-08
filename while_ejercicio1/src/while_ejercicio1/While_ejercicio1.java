/*
    Ejercicio 1: Escribe un programa que lea de teclado 2 números enteros y saque
    en pantalla todos los números que estén entre ellos. Importante: El programa NO
    debe asumir que el usuario introducirá primero el número más pequeño.
 */

package while_ejercicio1;

import java.util.Scanner;

public class While_ejercicio1 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.println("Introduce dos valores para sacar todos los numeros comprendidos entre ellos");
    System.out.print("Introduce el primer valor: ");
    int num1 = consola.nextInt();
    System.out.print("Introduce el segundo valor: ");
    int num2 = consola.nextInt();
    int cuenta;
   
   if(num1==num2){
       System.out.println("Los valores no deben ser iguales");
   }else{
        if(num1<num2){
            cuenta = num1;
            while(cuenta <= num2){
                System.out.println(cuenta);
                cuenta++;
            }
        }else{
            cuenta = num1;
            while(cuenta >= num2){
                System.out.println(cuenta);
                cuenta--;
            }
        }
   }
    
    
}
}
