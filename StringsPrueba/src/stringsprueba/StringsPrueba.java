package stringsprueba;

import java.util.Scanner;

public class StringsPrueba {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Ingrese una nota: ");
        double nota1 = consola.nextDouble();
        System.out.print("Ingrese otra nota: ");
        double nota2 = consola.nextDouble();
        
        double media = (nota1+nota2) / 2;
        System.out.println("\n" + media);
        
        consola.nextLine(); // Esta linea es importante para que me deje escribir en la primera cadena y dejar vacia la consola previamente.
        System.out.print("\nIntroduce una cadena: ");
        String cadena1 = consola.nextLine();
        System.out.print("Introduce una cadena: ");
        String cadena2 = consola.nextLine();
        
        System.out.println("\n");
        System.out.println(cadena1 + " y " + cadena2 + "\n");
        
        /*
        if (cadena1.equals(cadena2)){
            System.out.println("Son iguales");
        }else System.out.println("No son iguales");
        */
        
        // Otra forma para hacerlo seria
        
        String resultado = cadena1.equals(cadena2) ? ("Son iguales") : ("Son diferentes");
        System.out.println(resultado);
    }
    
}
