// EJERCICIOS 3 

package ejercicio3;

// Importamos la libreria que nos permitira hacer el ejercicio
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        String lineaSeparacion = "-------------------------------------------------------------------";
        
        // EJERCICIO 3.1
        // Solicita dos numeros por teclado. Muestra por pantalla la suma, resta, mult,
        // potencia, resto y division de ambos numeros
        
        // Declaramos las variables con la información solicitada al usuario
        System.out.println("Indique un numero");
        double a = consola.nextDouble();
        
        System.out.println("Otro numero");
        double b = consola.nextDouble();
        
        // Programamos las operaciones
        double suma = a + b;
        double resta = a - b;
        double multi = a * b;
        double div = a / b;
        double pot = Math.pow(a,b);
        double rest = a % b;
        
        // Mostramos el resultado final
        System.out.println(lineaSeparacion);
        System.out.println("RESULTADOS:");
        System.out.println(lineaSeparacion);
        
        System.out.println("El resultado de la SUMA es:......................... " + suma);
        System.out.println("El resultado de la RESTA es:........................ " + resta);
        System.out.println("El resultado de la MULTIPLICACION es:............... " + multi);
        System.out.println("El resultado de la DIVISION es:..................... " + div);
        System.out.println("El resultado de la POTENCIA es:..................... " + pot);
        System.out.println("El resultado del RESTO es:.......................... " + rest);

        
        
        // EJERCICIO 3.2
        // Crea un algoritmo que calcule la media de 5 números que se le pasan
        // por teclado y muestre el resultado
        
        System.out.println("\n");
        System.out.println(lineaSeparacion);
        
        // Declaramos las variables de cada numero solicitado
        System.out.println("Indique cinco numeros para realizar la media");
        double num1 = consola.nextDouble();
        double num2 = consola.nextDouble();
        double num3 = consola.nextDouble();
        double num4 = consola.nextDouble();
        double num5 = consola.nextDouble();
        
        // Operamos con los numeros para sacar la media
        suma = num1 + num2 + num3 + num4 + num5;
        double med = suma / 5;
        
        System.out.println(med);
        
        
        // EJERCICIO 3.3
        // Diseña un algoritmo que pida dos números por teclado (m y n) y calcule
        // las siguientes expresiones. Muestra el resultado de cada una de ella.
        
        System.out.println("\n");
        System.out.println(lineaSeparacion);
        
        System.out.println("Indique dos numeros para realizar las operaciones:");
        double m = consola.nextDouble();
        double n = consola.nextDouble();
        
        System.out.println(m / n*(m-n));
        System.out.println(12.3/m + 5 - n*9);
        System.out.println(m*2048 / n*1024 - Math.pow(m, n));
        System.out.println( Math.pow((3203 / m-n),n) % ( (Math.pow(n,2)) * (Math.pow(m,3)) ));
        
    }
    
}

