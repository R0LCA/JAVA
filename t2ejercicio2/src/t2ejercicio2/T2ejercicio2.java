/* 
    
    TEMA 2
    Ejercicio 2

        Crea un algoritmo que simule el lanzamiento de un dado de N caras.
        El número de caras del dado se solicitará por teclado.

*/

package t2ejercicio2;

import java.util.Scanner;

public class T2ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        // Solicitamos el valor "n" que inidica el numero de caras
        System.out.println("Indica el numero de caras que desee del dado: ");
        double n = consola.nextDouble();
        
        // Creamos el algoritmo que selecciona un valor aleatorio de nuestro rango
        double cara = Math.random()* n + 1; // Se pone el +1 ya que empieza en 0
        int caraFinal = (int)cara;
        
        // Proyecto el resultado
        System.out.println("\nHa salido el numero " + caraFinal);
        
    }
    
}
