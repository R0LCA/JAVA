package ejercicioifelse;

import java.util.Scanner;

public class EjercicioIFELSE {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        // Solitamos al usuario la información
        System.out.print("Indica tu edad: ");
        int edad = consola.nextInt();
        
        // Programo que en caso de que sea mayor de edad o no, quede especificado
        if (edad>18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("No eres mayor de edad");
        }
                
                
    }
    
}
