package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    // 1. Mostrar números del 1 al 50
    int numero = 1;
    while(numero <= 50){
        System.out.println(numero);
        numero++;
    }
    
    // 2. Contar de 5 a 1
    numero = 5;
    while(numero >= 1){
        System.out.println(numero);
        numero--;
    }
    
    // 3. Contar acumulativamente hasta 10
    int contador = 1;
    numero = 0;
    while(contador <=10){
        System.out.println(numero);
        numero = numero + contador;
        contador++;
    }

    // 4. Menu de 3 opciones
    System.out.println("Eliga una opcion: 1, 2 o 3");
    int opcion = consola.nextInt();
    while(opcion < 1 || opcion > 3){
        System.out.println("Valor introducido incorrecto");
        System.out.println("Por favor, vuelva a intentarlo");
        opcion = consola.nextInt();
    }
   
   // 5. Sumar todos los numero introducidos por el usuario
   int suma = 0;
    System.out.print("Introduce un numero: ");
   int n = consola.nextInt();
   while(n>=0){
       suma = suma + n;
       System.out.print("Otro: ");
       n = consola.nextInt();
               
   }
   System.out.println(suma);
    
    
}
}
