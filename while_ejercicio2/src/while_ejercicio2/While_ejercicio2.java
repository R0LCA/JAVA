/*
    Ejercicio 2: Repetir el ejercicio anterior pero solo puede mostrar numeros pares
 */

package while_ejercicio2;

import java.util.Scanner;

public class While_ejercicio2 {

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
                if(cuenta%2==0) System.out.println(cuenta);
                cuenta++;
            }
        }else{
            cuenta = num1;
            while(cuenta >= num2){
                if(cuenta%2==0) System.out.println(cuenta);
                cuenta--;
            }
        }
   }
    
}
}
