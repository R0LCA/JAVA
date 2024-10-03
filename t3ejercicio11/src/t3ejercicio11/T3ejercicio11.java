/* 
    
    TEMA 3
    Ejercicio 11

    Pregunta el nombre de dos jugadores. A continuación, simula una
    partida de tirada de dados: el primer jugador tira un dado de 6 caras y saca una
    puntuación. Luego hace lo mismo el segundo jugador. Al final se indica que
    jugador ha ganado.
    
*/

package t3ejercicio11;

import java.util.Scanner;

public class T3ejercicio11 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    double resultado = 0;    
    
        System.out.println("PARTIDA DE DADOS");
        System.out.println("------------------");
        System.out.println("\nIndique el nombre de los jugadores");
        
        System.out.print("Jugador 1: ");
        String jugador1 = consola.nextLine();
        System.out.print("Jugador 2: ");
        String jugador2 = consola.nextLine();
        
        System.out.println("\nTirando los dados....");
        consola.nextLine();
        
        double tirada1 = Math.floor(Math.random() * 6 + 1);
        double tirada2 = Math.floor(Math.random() * 6 + 1);
        
        
        System.out.println("\n");
        System.out.println(jugador1 + " Ha sacado: " + tirada1);
        System.out.println(jugador2 + " Ha sacado: " + tirada2);
        
        if(tirada1 == tirada2){
            System.out.println("Empate");
        }
        else if (tirada1 > tirada2){
            System.out.println("Ha ganado " + jugador1);
        }else System.out.println("Ha ganado " + jugador2);
    }

}
