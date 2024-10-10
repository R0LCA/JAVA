/*
    Ejercicio 4: Escriba un programa que pida un número al usuario. Si el número
    introducido no es divisible por 2 y 3 entonces el programa mostrará un mensaje
    de error y volverá a pedir un número al usuario. En caso de que el número sea
    divisible por dichos números se mostrará el resultado de dividirlo por ellos y se
    terminará el programa
 */

package while_ejercicio4;

import java.util.Scanner;

public class While_ejercicio4 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.print("Indique un numero entero divisible por 2 y 3: ");
    int num = consola.nextInt();
    int cuenta = 1;
    
    while (num%2!=0 && num%3!=0){
        System.out.print("ERROR. Indique un nuevo divisible por 2 y 3: ");
        num = consola.nextInt();
    }
    if (num%2==0 && num%3==0){
        System.out.println(num + " / 2 = " + num/2);
        System.out.println(num + " / 3 = " + num/3);
    }
    
    
    
    
}
}
