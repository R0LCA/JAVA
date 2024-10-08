/*
        PRÁCTICA 1 - RODRIGO LABAJOS CASTRO
        07 / 10 / 2024
 */

package práctica1_rodrigo;

import java.util.Scanner;

public class Práctica1_rodrigo {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
     
    
    // Ejercicio 1
        System.out.println("Ejercicio 1\n"); 
    
    // Solicitamos los datos del usuario y declaramos las variables a utilizar
    
    System.out.print("Indique su nombre:");
    String nombre = consola.nextLine();
    System.out.print("Indique su edad: ");
    int edad = consola.nextInt();
    
    // Creamos la condicion que nos dirá si es menor o mayor de edad
    
    if (edad < 18){
        System.out.println(nombre + ", tienes " + edad + " anios y eres menor de edad");
    }
    else System.out.println(nombre + ", tienes " + edad + " anios y eres mayor de edad");
    
        if(edad < 65){ //Aqui creamos la condicion para decirnos si esta jubilado o no y por cuanto tiempo
            System.out.println("Te quedan " + (65-edad) + " anios para jubilarte");
        }else System.out.println("LLevas jubilado " + (edad-65) + " anios");
            
     
        
    // Ejercicio 2
        System.out.println("\nEjercicio 2\n");
    
    // Solicitamos la informacion al usuario y declaramos las variables
    
    System.out.print("Indique su nota: ");
    double nota = consola.nextDouble();
    
    // Creamos la condicion de que la nota debe ser entre 0 y 10 
    
    if(nota<0 || nota>10){
        System.out.println("Introduce un valor para tu nota valido, entre 0 y 10");
    }
    // Creamos tambien la condicion de mostrarnos por escrito que hemso sacado segun la nota
    
    else{
        if(nota>=0 && nota<5) System.out.println("Insuficiente");
        if(nota>=5 && nota<6) System.out.println("Suficiente");
        if(nota>=6 && nota<7) System.out.println("Bien");
        if(nota>=7 && nota<9) System.out.println("Notable");
        if(nota>=9 && nota<=10) System.out.println("Sobresaliente");
    }
    
    
    
    //  Ejercicio 3
        System.out.println("\nEjercicio 3\n");
    
    // Creamos el menú que deseamos que el usuario visualice
    System.out.println("------------------");
    System.out.println("MENU DE CONVERSION");
    System.out.println("------------------");
    System.out.println("Eliga una de ambas opciones.");
    System.out.println("\n1. De Celsius a Fahrenheit");
    System.out.println("2. De Fahrenheit a Celsius");
    System.out.print("\nOpcion: ");
    int num = consola.nextInt();
    
    // Declaramos las variables de los datos solicitados y a calcular
    if(num == 1){
    System.out.println("\nIndique la cantidad de grados Celsius a convertir en Fahrenheit");
    System.out.print("Grados Celsius = ");
    double gradosCelsius = consola.nextDouble(); // Solicitamos el valor a calcular
    double gradosFahrenheit = (gradosCelsius * 9/5) + 32; // Calculo con la conversion
    System.out.println("\n" + gradosCelsius + " grados Celsius equivalen a " + gradosFahrenheit + " grados Fahrenheit"); // Representamos el calculo
    }

    if(num==2){
    System.out.println("\nIndique la cantidad de grados Fahrenheit a convertir a Celsius");
    System.out.print("Grados Fahrenheit = ");
    double gradosFahrenheit = consola.nextDouble(); 
    double gradosCelsius = (gradosFahrenheit - 32) * 5/9;
    System.out.println("\n" + gradosFahrenheit + " grados Fahrenheit equivalen a " + gradosCelsius + " grados Celsius"); // Representamos el calculo
    }
    
    
    // Ejercicio 4
        System.out.println("\nEjercicio 4\n");
    
        
    System.out.println("CARRERA DE 100 METROS");
    consola.nextLine(); // Esta linea esta hecha para que no nos omita la informacion solicitada del siguiente nextLine()
    // Solicitamos los nombres de los participantes
       
    System.out.print("Indique el nombre del primer corredor: ");
    String corredor1 = consola.nextLine();
    System.out.print("Indique el nombre del segundo corredor: ");
    String corredor2 = consola.nextLine();
    System.out.print("Indique el nombre del tercer corredor: ");
    String corredor3 = consola.nextLine();

    // Declaramos las variables de cada jugador
    
    double vel1 = Math.floor( Math.random() * 10 + 5 + 1);
    double vel2 = Math.floor( Math.random() * 10 + 5 + 1);
    double vel3 = Math.floor( Math.random() * 10 + 5 + 1);
    
    double tiempo1 = 100 / vel1;
    double tiempo2 = 100 / vel2;
    double tiempo3 = 100 / vel3;
    
    // Mostramos la informacion de cada corredor
    System.out.println("\n");
    
    System.out.println("Corredor 1 -> " + corredor1 + ": Velocidad: " + vel1 + " m/seg, Tiempo: " + tiempo1 + " seg.");
    System.out.println("Corredor 2 -> " + corredor2 + ": Velocidad: " + vel2 + " m/seg, Tiempo: " + tiempo2 + " seg.");
    System.out.println("Corredor 3 -> " + corredor3 + ": Velocidad: " + vel3 + " m/seg, Tiempo: " + tiempo3 + " seg.");
    
    // Mostramos el ganador en pantalla
    System.out.println("\n");
    
    if(tiempo1 == tiempo2 || tiempo1 == tiempo3){
        System.out.println("Parece que no hay un claro ganador. Repita la carrera");
    }else{
        if(tiempo1 < tiempo2 && tiempo1 < tiempo3){
            System.out.println("El ganador es " + corredor1);
        }
        if(tiempo2 < tiempo1 && tiempo2 < tiempo3){
            System.out.println("El ganador es " + corredor2);
        }
        if(tiempo3 < tiempo1 && tiempo3 < tiempo2){
            System.out.println("El ganador es " + corredor3);
        }
    }
    
    
    // Ejercicio 5
    System.out.println("\nEjercicio5\n");
    
    //  Solicitamos el numero al usuario a analizar
    
    System.out.print("Indique un numero entero entre 0 y 99999: ");
    int numero = consola.nextInt();
    int numero2 = 0;
    
    // Creamos la condicion para averiguar si el numero introducido es válido
    
    if (numero < 0 || numero > 99999){
        System.out.println("El numero introducido no es válido, este debe estar comprendido entre 0 y 99999");
    }else{
        if (numero > 9999){ // Si es de 5 cifras
            int n1 = numero / 10000;
            int n2 = numero / 1000 - n1*10;
            int n3 = numero / 100 - n1*100 - n2*10;
            int n4 = numero / 10 - n1*1000 - n2*100 - n3*10;
            int n5 = numero - n1*10000 - n2*1000 - n3*100 - n4*10;

            numero2 = n5*10000+n4*1000+n3*100+n2*10+n1;
        }
        else if (numero > 999 && numero <= 9999){ // Si es de 4 cifras
            int n1 = numero / 1000;
            int n2 = numero / 100 - n1*10;
            int n3 = numero / 10 - n1*100 - n2*10;
            int n4 = numero / 1 - n1*1000 - n2*100 - n3*10;

            numero2 = n4*1000+n3*100+n2*10+n1;
        }
        else if (numero > 99 && numero <= 999){ // Si es de 3 cifras
            int n1 = numero / 100;
            int n2 = numero / 10 - n1*10;
            int n3 = numero - n1*100 - n2*10;

            numero2 = n3*100+n2*10+n1;
        }
        else if (numero > 9 && numero <= 99){ // Si es de 2 cifras
            int n1 = numero / 10;
            int n2 = numero - n1*10;

            numero2 = n2*10+n1;
        }else numero2 = numero; // Si es de una cifra siempre sera capicua
        
        
        if (numero == numero2){
            System.out.println("Es capicua");
        }else System.out.println("No es capicua");
    }
    
    
    
    }
}
