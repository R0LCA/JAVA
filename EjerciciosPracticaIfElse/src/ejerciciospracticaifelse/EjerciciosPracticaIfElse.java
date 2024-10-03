package ejerciciospracticaifelse;

import java.util.Scanner;

public class EjerciciosPracticaIfElse {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    // Ejercicio 1
    
        System.out.print("Indique si es fin de semana: ");
        boolean finde = consola.nextBoolean();
        System.out.print("Indique si esta de vacaciones: ");
        boolean vacaciones = consola.nextBoolean();
        
        if (finde || vacaciones){
            System.out.println("Puede asistir al partido de su hijo");           
        }
        else {
            System.out.println("No puede asistir al partido de su hijo.");
        }
        
    
    // Ejercicio 2
        
        System.out.println("\n");
        System.out.print("Indique el numero del mes: ");
        int mes = consola.nextInt();
        
        if(mes == 1 || mes == 2 || mes == 12){
            System.out.println("Estamos en invierno.");
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            System.out.println("Estamos en primavera.");
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            System.out.println("Estamos en otoño.");
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            System.out.println("Estamos en invierno.");
        }
        else System.out.println("Introduce un numero correcto.");
    
        /*
            Una forma mas compleja de hacerlo seria:
        
            switch (mes) {
            case 1:
            case 2:
            case 12:
                System.out.println("Estamos en invierno.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Estamos en primavera.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estamos en otoño.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Estamos en invierno.");
                break;
            default:
                System.out.println("Introduce un numero correcto.");
                break;
        }
        */
    
    // Ejercicio 3
        
        System.out.println("\n");
        System.out.print("Indique un numero N: ");
        double n = consola.nextDouble();
        System.out.print("Indique otro numero M: ");
        double m = consola.nextDouble();
        
        if(m>n){
            System.out.println("M es mayor que N");
        }
        if(m<n){
            System.out.println("N es mayor que M");
        }
        if(m==n){
        System.out.println("N y M son iguales");
    }
    
    
        
    // Ejercicio 4
        
        System.out.println("\n");
        System.out.print("Introduce un numero entero: ");
        n = consola.nextInt();
        
        if (n >= 0){
            System.out.println("Tu numero " + n + " es positivo");
        }
        else System.out.println("Tu numero " + n + " es negativo");
        
        if (n % 2 != 0){
            System.out.println("Tu numero " + n + " es impar");
        }
        else System.out.println("Tu numero " + n + " es par");
    
        
    // Ejercicio 5
        
        System.out.println("\n");
        System.out.print("Introduce un numero comprendido entre 0 y 99.999: ");
        int cifras = 0;
        int num = consola.nextInt();
        
        while (num!=0){
            num = num/10;
            cifras++;
        }
        
        System.out.println("El numero tiene " + cifras + " cifras");
    }
    
}
