/* 
    
    TEMA 3
    Ejercicio 3

    Controla que el número de segundos introducidos no exceda los 90 minutos de
    partido. Si es así informa al usuario de que el número de segundos introducidos excede
    la duración del partido

*/

package t3ejercicio3;

import java.util.Scanner;

public class T3ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        
        System.out.println("Escribe el segundo de juego: ");
        int segundo = consola.nextInt();
        int minuto = segundo / 60 + 1;
        
        if(minuto <= 90){
        System.out.println("Teniendo en cuenta que estamos en el segundo " + segundo + ", estamos en el minuto " + minuto + " de juego");
        }
        else System.out.println("Has introducido un valor superior a 90 minutos");
    }
    
    
}