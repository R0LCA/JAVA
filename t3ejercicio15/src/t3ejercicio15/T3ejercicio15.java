/* 
    
    TEMA 3
    Ejercicio 15

    Una empresa maneja números enteros positivos de 4 dígitos para
    controlar sus productos. Estos números se denominan POOC:
        - P representa una de 8 provincias.
        - OO un tipo de operación.
        - C es un dígito de control.

    Escribe un programa que lea por teclado un número entero y escriba en pantalla
    los dígitos desglosados si es un número POOC válido, o un mensaje de error si no
    es un número POOC válido. Para ser válido se debe cumplir las 3 condiciones
    siguientes:
        - El número debe ser exactamente de 4 cifras.
        - El número de provincia debe ser un número entre 1 y 8 (ambos incluidos).
        - El dígito de control tiene que ser igual al resto de la división entera del tipo
          de operación entre el número de provincia.
*/

package t3ejercicio15;

import java.util.Scanner;

public class T3ejercicio15 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.print("Indique un numero POOC valido: ");
    int n = consola.nextInt();
        
        if(n>=1000 && n<=9999){
            int p = n / 1000;
            int n2 = n / 100 - p*10;
            int n3 = n / 10 - n/100*10;
            int c = n - (n/10 * 10);
        
            int oo = n2 * 10 + n3;
            
            if(p>=1 && p<=8){
                if(oo%p==c){
                    System.out.println("Es un numero POOC valido");
                }else System.out.println("El numero de control (C) es erroneo");
            }else System.out.println("Introduce un numero de provincia (P) entre 1 y 8");
        }else System.out.println("Introduce un numero POOC valido de 4 cifras");
    
    }

}
