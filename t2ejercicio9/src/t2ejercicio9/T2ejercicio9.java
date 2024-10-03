/* 
    
    TEMA 2
    Ejercicio 9

    Pedir por teclado un número entero de 4 cifras.
        a) Mostrar cada una de sus cifras (una debajo de otra)
        b) Crear un nuevo número con las cifras del primero, pero al revés.
    Nota: debe leerse por teclado un número entero NO una cadena.
*/

package t2ejercicio9;

import java.util.Scanner;

public class T2ejercicio9 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        System.out.print("Indica un numero de 4 cifras: ");
        int n = consola.nextInt();
        
        
        int n1 = n / 1000;
        int n2 = n / 100 - n1*10;
        int n3 = n / 10 - n/100*10;
        int n4 = n - (n/10 * 10);
        
        
        // Otra forma de hacerlo seria:
        
        /*
        int n1 = n / 1000;
        int n2 = n / 100 - n1*10;
        int n3 = n / 10 - n1*100 - n2*10;
        int n4 = n - n1*1000 - n2*100 - n3*10;
        
        */
        
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        
        System.out.println("\nEl numero al reves seria");
        System.out.println(n4*1000+n3*100+n2*10+n1);
    }
    
    
}