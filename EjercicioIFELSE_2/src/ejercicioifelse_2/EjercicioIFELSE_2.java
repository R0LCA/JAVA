/* 

    Practica de IFELSE.
     Programa que te saluda segun la hora del día que sea.

*/


package ejercicioifelse_2;

import java.util.Scanner;

public class EjercicioIFELSE_2 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
        // Solicitamos la hora
        System.out.print("Hora: ");
        int hora = consola.nextInt();
        
        // Utilizamos IF para saludar al usuario solo en caso correcto
        if (hora >= 6 && hora < 12 ){
            System.out.println("Buenos dias");
        }
        else if (hora >= 12 && hora < 20){
            System.out.println("Buenas tardes");
        }
        else if (hora >= 20 && hora < 24 || hora >= 0 && hora < 6){
            System.out.println("Buenas noches");
        }
        else System.out.println("Introduzca una hora correcta por favor.");
            
    }
    
}
