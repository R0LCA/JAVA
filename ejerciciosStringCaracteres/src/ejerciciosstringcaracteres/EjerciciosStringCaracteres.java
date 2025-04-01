package ejerciciosstringcaracteres;

import java.util.Scanner;

public class EjerciciosStringCaracteres {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        /*
        // EJERCICIO 1
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = consola.next();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = consola.next();
        
        char palabra1Array[] = palabra1.toCharArray();
        char palabra2Array[] = palabra2.toCharArray();
        
        if(palabra1Array.length > palabra2Array.length) System.out.println("La primera palabra \"" + palabra1 + "\" es mas larga que la segunda \"" + palabra2 + "\"");
        else System.out.println("La segunda palabra \"" + palabra2 + "\" es mas larga que la primera \"" + palabra1 + "\"");
        */
        /*
        // EJERCICIO 2
        int opc;
        String contraseña;
        String intento;
        
        System.out.println("**** JUEGO: Acierta la contraseña ****");
        
        do {
            System.out.print("Selecciona opcion: 1 (dificil) / 2 (facil)");
            opc = consola.nextInt();
            if(opc < 1 || opc > 2) System.out.println("Por favor, eliga dentro del rango establecido");
        } while (opc < 1 || opc > 2);
        
        System.out.println("Jugador 1: Introduzca la contraseña");
        contraseña = consola.next();
        
        char contraseñaArray[] = contraseña.toCharArray();
        
        if(opc == 1){
            System.out.println("Pistas:");
            System.out.println("Letras: " + contraseñaArray.length);
            System.out.println("Primera letra: " + contraseñaArray[0]);
            System.out.println("Ultima letra: " + contraseñaArray[contraseñaArray.length - 1]);
            do {
                System.out.println("Jugador 2: Adivina la contraseña");
                intento = consola.next();
                if(!contraseña.equalsIgnoreCase(intento)) System.out.println("Incorrecta, pruebe de nuevo");
            } while(!contraseña.equalsIgnoreCase(intento));
        }else{
            System.out.println("Pistas:");
            System.out.println("Letras: " + contraseñaArray.length);
            System.out.println("Primera letra: " + contraseñaArray[0]);
            System.out.println("Ultima letra: " + contraseñaArray[contraseñaArray.length - 1]);
            do {
                System.out.println("Jugador 2: Adivina la contraseña");
                intento = consola.next();
                if(!contraseña.equalsIgnoreCase(intento)){
                    System.out.println("Incorrecta, pruebe de nuevo");
                    if(contraseña.compareToIgnoreCase(intento) < 0) System.out.println("Tu palabra es alfabeticamente mayor a la contraseña");
                    else if(contraseña.compareToIgnoreCase(intento) > 0) System.out.println("Tu palabra es alfabeticamente menor a la contraseña");
                }
            } while(!contraseña.equalsIgnoreCase(intento));
        }
        
        System.out.println("Acertaste!!");
        */
        
        /*
        // EJERCICIO 3
        String palabra3;
        String frase = "";
        
        do {
            System.out.println("Escriba una palabra:");
            palabra3 = consola.next();
            if(!palabra3.equalsIgnoreCase("fin")){
                frase += " " + palabra3;
            }
        } while (!palabra3.equalsIgnoreCase("fin"));
        
        System.out.println("Resultado: " + frase);
        */
        
        /*
        // EJERCICIO 4
        int indiceInvertido = 0;
        System.out.print("Ingrese una palanbra o frase: ");
        String cadena4 = consola.nextLine();
        
        char cadena4Array[] = cadena4.toCharArray();
        char cadena4Invertida[] = new char[cadena4Array.length];
        
        for (int i = cadena4Array.length - 1; i >= 0; i--) {
            cadena4Invertida[indiceInvertido] = cadena4Array[i];
            indiceInvertido++;
        }
        
        for (int i = 0; i < cadena4Invertida.length; i++) {
            System.out.print(cadena4Invertida[i]);
        }
        */
    }

}
