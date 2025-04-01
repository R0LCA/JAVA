
package practica4;

import java.util.Scanner;

public class Practica4 {

    static void mostrarArrayMayus(char array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(Character.toUpperCase(array[i]));
        }
        System.out.println("");
    }
    
    static void mostrarArraySinVocales(char array[]){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'a' || array[i] == 'A' ) array[i] = ' ';
            else if(array[i] == 'e' || array[i] == 'E' ) array[i] = ' ';
            else if(array[i] == 'i' || array[i] == 'I' ) array[i] = ' ';
            else if(array[i] == 'o' || array[i] == 'O' ) array[i] = ' ';
            else if(array[i] == 'u' || array[i] == 'U' ) array[i] = ' ';
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
    static void traducirC(String cadena){
        int c1;
        int c2;
        
        do{
            c1 = cadena.indexOf("/*");
            c2 = cadena.indexOf("*/") + 1;

            if (c1 != -1) cadena = cadena.substring(0, c1).concat(cadena.substring(c2+1)); // En caso de que encuentre "/*" une lo anterior a eso y lo posterior a "*/"
        }while(c1 != -1);
        
        System.out.println(cadena);
    }
    
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    /*
    // EJERCICIO 1
    // Declaramos las variables que vayamos a utilizar en el ejercicio
    String frase1;
    String frase2;
    int opc = 0;
    int blancos1 = 0;
    int blancos2 = 0;
    
    // Solicitamos al usuario las dos frases con las que vamos a trabajar
    System.out.println("Introduce la primera frase:");
    frase1 = consola.nextLine();
    System.out.println("Introduce la segunda frase:");
    frase2 = consola.nextLine();
    
    // Mostramos las longitudes de ambas frases
    System.out.println("La longitud de la primera frase es " + frase1.length());
    System.out.println("La longitud de la segunda frase es " + frase2.length());
    
    // Convertimos ambas frases en arrays de caracteres para poder trabajar con las letras
    char arrayFrase1 [] = frase1.toCharArray();
    char arrayFrase2 [] = frase2.toCharArray();
    
    for (int i = 0; i < arrayFrase1.length; i++) {
        if(Character.isWhitespace(arrayFrase1[i])) blancos1++;
    }
    for (int i = 0; i < arrayFrase2.length; i++) {
        if(Character.isWhitespace(arrayFrase2[i])) blancos2++;
    }
    
    // Mostramos la cantidad de huecos en blanco de ambas de frases
    System.out.println("Numero de espacios de la primera frase es: " + blancos1);
    System.out.println("Numero de espacios de la segunda frase es: " + blancos2);
    
    // Asignamos cual va a ser la frase larga y cual la corta
    if(frase1.length() > frase2.length()){
        opc = 1;
    }else if(frase1.length() == frase2.length()){ // En caso de ser iguales mostramos directamente en mayus y sin vocales las dos
        System.out.println("Ambas frases en mayusculas:");
        mostrarArrayMayus(arrayFrase1);
        mostrarArrayMayus(arrayFrase2);
        System.out.println("Ambas frases sin vocales:");
        mostrarArraySinVocales(arrayFrase1);
        mostrarArraySinVocales(arrayFrase1);
    }else{
        opc = 2;
    }
    
    // En caso de ser de distinta longitud mostramos el resultado final
    if(opc == 1){
        System.out.println("Frase mas corta en mayusculas:");
        mostrarArrayMayus(arrayFrase2);
        System.out.println("Frase mas larga sin vocales:");
        mostrarArraySinVocales(arrayFrase1);
    }
    else if(opc == 2){
        System.out.println("Frase mas corta en mayusculas:");
        mostrarArrayMayus(arrayFrase1);
        System.out.println("Frase mas larga sin vocales:");
        mostrarArraySinVocales(arrayFrase2);
    }
    */
    
    /*
    // EJERCICIO 2
    // Declaramos las variables
    String cadena;
    
    // Solicitamos al usuario la sentencia en C
    System.out.println("Introduzca una sentencia en C");
    cadena = consola.nextLine();
    
    // Con la funcion traducimos cualquier sentencia
    traducirC(cadena);
    */
    
    // EJERCICIO 3
    // Declaramos las variables a utilizar
    char numeroProhChar;
    int numeroProh;
    String palabra;
    boolean norma; 
    String texto;
    boolean encriptado = false;


    
    System.out.println("***** ENCRIPTADOR *****");
    // Solicitamos al usuario el numero de palabras prohibidas que desea introducir
    do{
        System.out.println("¿Cuantas palabras prohibidas quieres introducir?");
        numeroProhChar = consola.next().charAt(0);
        if(!Character.isDigit(numeroProhChar) && Character.digit(numeroProhChar, 10) <= 0){
            System.out.println("Introduce un valor correcto");
        } // En caso de no ser digito o ser igual o menor de 0 volver a preguntar
    }while(!Character.isDigit(numeroProhChar) && Character.digit(numeroProhChar, 10) <= 0);
    
    numeroProh = Character.digit(numeroProhChar, 10); // Convertimos a numero el numero(char) solicitado
    
    String palabrasProh [] = new String[numeroProh]; // Creamos una lista para meter tantas palabras prohibidas como ha solicitado el usuario
    
    // Solicitamos al usuario las palabras
    System.out.println("Introduzca las palabras prohibidas. Estas no deben tener espacios ni numeros");
    for (int i = 0; i < palabrasProh.length; i++) {
        do{
            norma = false;
            System.out.println("Introduzca la palabra " + (i+1) + ":");
            palabra = consola.next();
            char arrayPalabra [] = palabra.toCharArray();
            for (int j = 0; j < arrayPalabra.length; j++) {
                if(Character.isDigit(arrayPalabra[i])) norma = true; // Si contiene digitos sera true la variable booleana
            }
            if(norma) System.out.println("No puede contener digitos");
        }while(norma);
        palabrasProh[i] = palabra.toLowerCase(); // En caso de que la palabra cumpla los requisitos sera aceptada y añadida en la lista de palabras prohibidas
    }

    // Solicitamos el texto a enctriptar
    consola.nextLine();
    System.out.println("Introduzca el texto a encriptar");
    texto = consola.nextLine();
    
    // Pasamos todo a minusculas
    texto = texto.toLowerCase();
    
    // Cambiamos todas las palabras prohibidas por asteriscos
    for (int i = 0; i < numeroProh; i++) {
        texto = texto.replace(palabrasProh[i], "*");
    }
    
    // Convertimos a array para verificar si hay asteriscos
    char arrayTexto[] = texto.toCharArray();

    for (int i = 0; i < arrayTexto.length; i++) {
        if(arrayTexto[i] == '*') {
            encriptado = true;
        }
    }

    // Resultado final

    if (!encriptado) {
        System.out.println("No hay palabras prohibidas");
        System.out.println("Salida: " + texto);
    }else System.out.println("Texto encriptado: " + texto);
        
        
        
    
    
    }
        
    
    
    
    
    
    
    }


