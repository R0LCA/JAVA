// EJERCICIO 2.  Clase Scanner
// Crea un algoritmo que pida al usuario su nombre, suy DNI y fecha de nacimiento 
// y a continuación muestre esa información por pantalla de manera ordenada

package ejercicio2;

// Importamos la libreria que nos permitira hacer el ejercicio
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        
        // Declaramos las variables con la información solicitada al usuario
        System.out.println("Indique su nombre por favor");
        String nombre = consola.nextLine();
        
        System.out.println("Su DNI");
        String dni = consola.nextLine();
        
        System.out.println("Escriba su fecha de nacimiento para finalizar");
        String fechaDeNacimiento = consola.nextLine();
        
        
        // Mostramos el resultado
        System.out.println("---------");
        System.out.println("Los datos del usuario registrado son:");
        System.out.println("---------");

        System.out.println("NOMBRE..................: " + nombre);
        System.out.println("DNI.....................: " + dni);
        System.out.println("Fecha de nacimiento.....: " + fechaDeNacimiento);
        
    }
    
}
