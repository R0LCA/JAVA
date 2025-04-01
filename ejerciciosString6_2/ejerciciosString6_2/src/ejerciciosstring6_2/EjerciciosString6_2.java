
package ejerciciosstring6_2;

import java.util.Scanner;

public class EjerciciosString6_2 {
    
    public static void verArray(char array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    
    public static void verArrayG(char array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
    
    public static boolean compararArray(char array1[], char array2[]){
       int igual = 0;
        
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] == array2[i]) igual++;
            }
        }
        
        if(igual == array1.length && igual == array2.length) return true;
        else return false;
    }

    public static char codificar(char conjunto1[], char conjunto2[], char c){
        String conjunto1S = new String(conjunto1);
        if (conjunto1S.indexOf(Character.toLowerCase(c)) != -1) return conjunto2[conjunto1S.toLowerCase().indexOf(Character.toLowerCase(c))];
        else return Character.toLowerCase(c);
    }
    
    public static String aleatorizar(String x){
        char temp;
        int longitud = x.length();
        int numAleatorio;
        int numAleatorio2;
        
        char arrayX[] = x.toCharArray();
        
        for(int i = 0; i <= longitud; i++){
            numAleatorio = (int) (Math.random() * longitud);
            numAleatorio2 = (int) (Math.random() * longitud);
            temp = arrayX[numAleatorio];
            arrayX[numAleatorio] = arrayX[numAleatorio2];
            arrayX[numAleatorio2] = temp;
        }
        
        x = new String(arrayX);
        return x;
    }
    
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    /*
    // EJERCICIO 1
    String cadena1 = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
    String cadena11 = cadena1.substring(13).toLowerCase();
    String cadena12 = cadena1.substring(0,9).toLowerCase() + cadena1.substring(20).toLowerCase();
    
    System.out.println(cadena1);
    System.out.println(cadena11);
    System.out.println(cadena12);
    */
    /*
    // EJERCICIO 2
    String cadena2 = "Volando, volando... siempre arriba";
        System.out.println(cadena2.indexOf('d', 0, 7));
        System.out.println(cadena2.substring(28).lastIndexOf('d', cadena2.length()-1));
    */
    /*
    // EJERCICIO 3
    System.out.println("Introduce una frase: ");
    String frase3 = consola.nextLine().toLowerCase();
    System.out.println("Introduce una palabra: ");
    String palabra3 = consola.next().toLowerCase();
    
    int cont3 = 0;
    int inicio3 = 0;
    
    while(frase3.indexOf(palabra3, inicio3) != -1){
        inicio3 = frase3.indexOf(palabra3, inicio3);
        if (frase3.indexOf(palabra3, inicio3) != -1){
            cont3++;
            inicio3++;
        }
    }
    
        System.out.println("La palabra \"" + palabra3 + "\" aparece " + cont3 + " veces en la frase" );
    */
    /*
    // EJERCICIO 4
    String muletilla1 = "Javalin, javalon";
    String muletilla2 = "javalen, len, len";
    
    System.out.println("Introduce una frase en el idioma de Javalandia");
    String frase4 = consola.nextLine();
    
    if(!frase4.toLowerCase().contains( muletilla1.toLowerCase() ) && !frase4.toLowerCase().contains( muletilla2.toLowerCase() ) ){
        System.out.println("No esta escrito en el idioma de Javalandia");
    }else{
        if(frase4.toLowerCase().contains( muletilla1.toLowerCase() )){
            System.out.println("Traducción: " + frase4.substring(muletilla1.length()).trim());
        }else{
            System.out.println("Traduccion: " + frase4.substring(0, frase4.indexOf(muletilla2)).trim());
        }
    }
    */
    /*
    // EJERCICIO 5
    char array1 [] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
    char array2 [] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
    
    System.out.print("Introduce una palabra o frase a codificar: ");
    String palabra5 = consola.nextLine();
    char arrayPalabra[] = palabra5.toCharArray();
    
        for (int i = 0; i < arrayPalabra.length; i++) {
            arrayPalabra[i] = codificar(array1, array2, arrayPalabra[i]);
            System.out.print(arrayPalabra[i]);
        }
    */
    /*
    // EJERCICIO 6
    String palabra6;
    String palabra62;
    do{
        System.out.print("Introduce una palabra: ");
        palabra6 = consola.next();
        if(palabra6.isEmpty()) System.out.println("No puede ser una palabra vacia");
    }while(palabra6.isEmpty());
    
        System.out.println("Pista anagrama: " + aleatorizar(palabra6));
    
    do{
        System.out.print("Adivina la palabra original: ");
        palabra62 = consola.next();
        if(!palabra6.equals(palabra62)) System.out.println("No has acertado");
    }while(!palabra6.equals(palabra62));
    
    System.out.println("Has acertado!");
    */
    /*
    // EJERCICIO 7
    int intentos = 10;
    char letra;
    boolean presenciaLetra = false;
        
    System.out.println("Introduce una palabra");
    String palabra = consola.next().toUpperCase();
    char arrayPalabra[] = palabra.toCharArray();
    
    char arrayGuiones[] = new char [arrayPalabra.length];
    
    for (int i = 0; i < arrayGuiones.length; i++) {
        arrayGuiones[i] = '-';
    }
    
    System.out.println("------- JUEGO DEL AHORCADO -------");
    
    while(intentos != 0 && !compararArray(arrayPalabra, arrayGuiones)){
        verArrayG(arrayGuiones);
        System.out.println();
        presenciaLetra = false;
        
        System.out.print("Introduzca una letra: ");
        letra = consola.next().charAt(0);
        letra = Character.toUpperCase(letra);
        
        for (int i = 0; i < arrayPalabra.length; i++) {
            if(Character.toUpperCase(letra) == arrayPalabra[i]){
                arrayGuiones[i] = letra;
                presenciaLetra = true;
            }
        }
        
        if(!presenciaLetra){
            System.out.println("La letra \'" + letra + "\' no esta en la palabra");
            intentos--;
        }
        
        System.out.println("Intentos restantes: " + intentos);
        
    }
    
        System.out.println("La palabra era: " + palabra);
    
        if (intentos == 0) System.out.println("Has perdido...");
        else System.out.println("Lo has logrado!!");
    */        
        
    
    }
}
