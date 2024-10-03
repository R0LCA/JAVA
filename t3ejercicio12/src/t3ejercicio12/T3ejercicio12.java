/* 
    
    TEMA 3
    Ejercicio 12

    Realiza un programa que indique si un numero introducido por
    teclado es de 5 cifras y además es par.
    
*/

package t3ejercicio12;

import java.util.Scanner;

public class T3ejercicio12 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        System.out.print("Indica un numero de 5 cifras: ");
        int num = consola.nextInt();
        
        if(num >= 10000 && num <= 99999){
            System.out.println("El numero introducido tiene 5 cifras");
            if(num%2==0){
                System.out.println("Ademas el numero es par");
            }else System.out.println("Ademas el numero es impar");
        }else System.out.println("El numero introducido no es de 5 cifras");
    }

}
