/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejerciciochar;

import java.util.Scanner;

public class EjercicioChar {
    
    static boolean esVocal(char c){
        c = Character.toLowerCase(c);
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int n;
        int contadorVocales = 0;
        
        System.out.print("Introduce el numero de caracteres que desee introducir: ");
        do{
        n = consola.nextInt();
        if(n < 0)System.out.println("Debe ser positivo");
        }while(n < 0);
        
        char array[] = new char[n];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Caracter " + (i+1) + ": ");
            array[i] = consola.next().charAt(0);
        }
        
        for(int i = 0; i < array.length; i++){
            if(esVocal(array[i])) contadorVocales++;
        }
        
        System.out.println("Hay " + contadorVocales + " vocales");
        
    }

}
