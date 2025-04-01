/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package practica3;

import java.util.Scanner; // Importamos el Scanner para poder leer los datos introducidos por el usuario

public class Practica3 {
    
    // Funcion para visualizar los arrays
    static void verArray(int x[]){ 
        for (int i = 0; i < x.length; i++) {
            if(i == x.length - 1) System.out.println(x[i]);
            else System.out.print(x[i] + ", ");
        }
    }
    
    // Funcion para ver la matriz de caracteres
    static void verMatrizChar(char x[][]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in); // Declaramos el scanner como "consola"
    
    /*
    // EJERCICIO 1 ................................................
    
        //Declaramos las variables así como los arrays a utilizar.
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        // Recorreremos el array valor por valor para introducir los valores deseados
        for(int i = 0; i < numero.length; i++){
            numero[i] = (int)(Math.random() * 101); // Introducirá valores entre 0 y 100    
        }

        // Igual pero asignando a cada valor el cuadrado de los valores del array "numero"
        for(int i = 0; i < cuadrado.length; i++){
            cuadrado[i] = (int)(Math.pow(numero[i], 2));
        }

        // De la misma forma para los cubos de dichos valores del array "numero"
        for(int i = 0; i < cuadrado.length; i++){
            cubo[i] = (int)(Math.pow(numero[i], 3));
        }

        // Imprimimos por consola los arrays
        System.out.println("Numero:");
        verArray(numero);
        System.out.println("Cuadrado:");
        verArray(cuadrado);
        System.out.println("Cubo:");
        verArray(cubo);
    */
    
    
    // EJERCICIO 2 ................................................
    
        // Declaramos las variables a utilizar asi como los arrays
        int lista[] = new int[10];
        int num;
        int huecoVacio = 0;
        boolean repetido = false;
        int longitud = 0;

        // Recorremos el array valor por valor para introducir los numeros deseados por el usuario
        for(int i = 0; i < lista.length; i++){
            do { // Pediremos al usuario el numero de cada posicion del array mientras este no sea positivo
                System.out.println("Introduza un numero positivo (" + (i+1) + ")");
                num = consola.nextInt(); // Solicitamos los valores al usuario
                if(num < 0){
                   System.out.println("El numero debe ser positivo!");
                }
            }while (num < 0);
            lista[i] = num;
        }

        verArray(lista); // Visualizamos el primer array con numeros repetidos para comparar

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] == lista[j]) { // Comprobamos el primer valor con todos los demas, luego el segundo...
                    if(i != j){ // Teniendo en cuenta de que no se compare con si mismo
                        repetido = true; // Marcamos si es repetido
                    }
                }
            }
            if(repetido == false){
                longitud++; // Y aumentamos en caso de haber metido uno para meterlos en orden
            }
            repetido = false; // Volvemos a dejar la variable en false para comprobar los siguientes numeros
        }
        
        int listaCopia[] = new int[longitud]; // En este array mostraremos los no repetidos
        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] == lista[j]) { // Comprobamos el primer valor con todos los demas, luego el segundo...
                    if(i != j){ // Teniendo en cuenta de que no se compare con si mismo
                        repetido = true; // Marcamos si es repetido
                    }
                }
            }
            if(repetido == false){
                listaCopia[huecoVacio] = lista[i]; // Si no es repetido lo metemos en el primer espacio del array de no repetidos
                huecoVacio++; // Y aumentamos en caso de haber metido uno para meterlos en orden
            }
            repetido = false; // Volvemos a dejar la variable en false para comprobar los siguientes numeros
        }

        // Visualizamos el array de numeros no repetidos
        verArray(listaCopia);
    
    
    /*
    // EJERCICIO 3 ................................................
        
        // Declaramos las variables a utilizar asi como los arrays
        char tablero[][] = new char[5][5];
        char tableroOculto[][] = new char[5][5]; // El tablero oculto es el que mostraremos mientra la partida siga en curso
        int fila;
        int columna;
        boolean fin = false;
        boolean ganar = false;

        // Posicion del tesoro
        int randomPos1 = (int) (Math.random() * 5);
        int randomPos2 = (int) (Math.random() * 5);
        
        // Posicion de la mina
        int randomPos3 = (int) (Math.random() * 5);
        int randomPos4 = (int) (Math.random() * 5);
        
        // Repetimos una posicion aleatoria de la mina en caso de ser la misma que el tesoro
        while(randomPos1 == randomPos3 || randomPos2 == randomPos4){
            randomPos3 = (int) (Math.random() * 5);
            randomPos4 = (int) (Math.random() * 5);
        }

        // Dibujamos el tablero asi como el tablero con las posiciones ocultas de la mina y del tesoro
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
                tableroOculto[i][j] = '-';
            }
        }

        // Marcamos el Tesoro y la Mina en el tablero que mostraremos cuando termine la partida
        tablero[randomPos1][randomPos2] = 'T';
        tablero[randomPos3][randomPos4] = 'M';

        System.out.println("Busqueda de Tesoro");
        System.out.println("----------");

        verMatrizChar(tableroOculto);

        while(fin == false){
            
            // Le pediremos al usuario la fila y la columna mientras esta sean distintas de los valores a poder marcar dento del tablero
            do {
                System.out.println("Introduce la fila (Entre 0 y 4)");
                fila = consola.nextInt();
            } while (fila < 0 || fila > 4);

            do {
                System.out.println("Introduce la columna (Entre 0 y 4)");
                columna = consola.nextInt();
            } while (columna < 0 || columna > 4);
            
            // Si no ha dado con el tesoro ni la mina se marcara una X en la posicion 
            if (tablero[fila][columna] != 'T' && tablero[fila][columna] != 'M') {
                if (tablero[fila][columna] == 'X') {
                    System.out.println("Aqui ya has tirado, prueba otro lado!");
                    continue; // Si ya ha tirado en ese lugar volvera a pedirle una fila y columna
                } else {
                    System.out.println("Sigue intentandolo!");
                    tableroOculto[fila][columna] = 'X';
                    tablero[fila][columna] = 'X';
                }
                verMatrizChar(tableroOculto);
            } 
            else if(tablero[fila][columna] == 'M'){ // Si encuentra la mina terminara el juego y marcará como derrota
                System.out.println("EXPLOSION!");
                fin = true;
            }
            else{ // Si encuentra el tesoro terminara el juego y marcará como victoria
                System.out.println("HAS ENCONTRADO EL TESORO!");
                verMatrizChar(tablero); // Mostrará tambien la posicion de la Mina
                ganar = true;
                fin = true;
            }

        }
        
        // Si al terminar la partida ha perdido, se le mostrara que ha perdido y la posicion del Tesoro
        if (ganar == false) {
            System.out.println("HAS PERDIDO...");
            verMatrizChar(tablero);
        }
    */
    }
}
