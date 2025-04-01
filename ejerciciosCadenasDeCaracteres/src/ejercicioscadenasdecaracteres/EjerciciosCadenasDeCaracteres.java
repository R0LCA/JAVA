/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioscadenasdecaracteres;

import java.util.Scanner;

public class EjerciciosCadenasDeCaracteres {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        /*
        // EJERCICIO 1
        int mayus1 = 0;
        int minus1 = 0;
        int digitos1 = 0;
        int blancos1 = 0;
        int otros1 = 0;
        
        System.out.print("Escribe una frase, palabra... : ");
        String cadena1 = consola.nextLine();
        
        char cadena1Char[] = cadena1.toCharArray();
        
        for (int i = 0; i < cadena1Char.length; i++) {
            if(Character.isUpperCase(cadena1Char[i])) mayus1++;
            else if(Character.isLowerCase(cadena1Char[i])) minus1++;
            else if(Character.isDigit(cadena1Char[i])) digitos1++;
            else if(Character.isWhitespace(cadena1Char[i])) blancos1++;
            else otros1++;
        }
        
        System.out.println(mayus1 + " caracteres en mayúscula");
        System.out.println(minus1 + " caracteres en minúscula");
        System.out.println(digitos1 + " digitos");
        System.out.println(blancos1 + " espacios en blanco, tabuladores o saltos");
        System.out.println(otros1 + " otros caracteres");
        */
        
        
        /*
        // EJERCICIO 2
        boolean fin = false;
        do{
            boolean digito2 = false;
            boolean mayus2 = false;
            boolean minus2 = false;
            boolean blancos2 = false;
        
            System.out.println("Introduce una contrasenia: ");
            String contraseña = consola.nextLine();

            char contraseñaChar[] = contraseña.toCharArray();
            for (int i = 0; i < contraseñaChar.length; i++) {
                if(Character.isDigit(contraseñaChar[i])) digito2 = true;
                if(Character.isUpperCase(contraseñaChar[i])) mayus2 = true;
                if(Character.isLowerCase(contraseñaChar[i])) minus2 = true;
                if(Character.isWhitespace(contraseñaChar[i])) blancos2 = true;
            }
            if(digito2 == true && mayus2 == true && minus2 == true && blancos2 == false) fin = true;
            else System.out.println("La contrasenia debe contener una mayuscula, una minuscula, un digito y no contener espacios en blanco!");
        }while(fin == false);
        
        System.out.println("\nContrasenia introducida con exito!");
        */
        
        
        /*
        // EJERCICIO 3
        int blancos3 = 0;
        System.out.print("Introduce un breve texto: ");
        String texto3 = consola.nextLine();
        
        char texto3C[] = texto3.toCharArray();
        char texto32[] = new char[texto3C.length];
        for (int i = 0; i < texto32.length; i++) {
            if(Character.isUpperCase(texto3C[i])){
                texto32[blancos3] = Character.toLowerCase(texto3C[i]);
                blancos3++;
            }
            else if(Character.isDigit(texto3C[i])){
                texto32[blancos3] = '*';
                blancos3++;
            }
            else if(!Character.isWhitespace(texto3C[i])){
                texto32[blancos3] = texto3C[i];
                blancos3++;
            }
            
        }
        
        for (int i = 0; i < texto32.length; i++) {
            System.out.print(texto32[i]);
        }
        */
        
        
        
        // EJERCICIO 4
        char arrayL[] = {'A','B','C','D','E','F','G','H','I','J'};
        
        System.out.print("Introduce tu mensaje cifrado: ");
        String mensaje = consola.nextLine();
        
        char array[] = mensaje.toCharArray();
        
        for (int i = 0; i < array.length; i++) {
            switch(array[i]){
                case '0': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '1': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '2': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '3': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '4': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '5': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '6': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '7': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '8': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                case '9': array[i] = arrayL[Character.digit(array[i], 10)]; break;
                default: array[i] = '\u0000'; break;
            } 
            if(Character.isLowerCase(array[i])) array[i] = Character.toUpperCase(array[i]);
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        
    }

}
