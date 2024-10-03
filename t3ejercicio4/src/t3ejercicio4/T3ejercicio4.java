/* 
    
    TEMA 3
    Ejercicio 4

    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
    Recordamos que existen meses con 28, 30 y 31 días. No consideramos los años
    bisiestos
    
    Nota: debe leerse por teclado un número entero NO una cadena.
*/

package t3ejercicio4;

import java.util.Scanner;

public class T3ejercicio4 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        System.out.println("Indica una fecha para comprobar si es correcta");
        int fechaCorrecta = 0;
        
        System.out.print("\nDia: ");
        int dia = consola.nextInt();
        System.out.print("Mes: ");
        int mes = consola.nextInt();
        System.out.print("Anio: ");
        int año = consola.nextInt(); 
        System.out.println("\n");
        
        switch(mes){
            case 2:
                if(dia > 28){
                    System.out.println("La fecha es incorrecta, febrero solo tiene 28 dias");
                }else fechaCorrecta++; break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(dia > 31){
                    System.out.println("La fecha es incorrecta, el mes indicado solo tiene 31 dias");
                }else fechaCorrecta++; break;
            case 4: case 6: case 9: case 11:
                if(dia > 30){
                    System.out.println("La fecha es incorrecta, el mes indicado solo tiene 30 dias");
                }else fechaCorrecta++; break;
            default:
                if(mes > 12 || mes < 1){
                    System.out.println("Introduce un valor para el mes correcto, entre 1 y 12");
                }
                break;
        }
        if (dia < 1){
            System.out.println("Introduzca un valor para el dia correcto");
        }else fechaCorrecta++;
        
        if (año > 2024 || año < 0){
            System.out.println("Introduce un valor para el anio desde d.C. hasta dia de hoy");
        }else fechaCorrecta++;
        
        if(fechaCorrecta == 3){
            System.out.println("Tu fecha es: " + dia + "/" + mes + "/" + año);
        }
    }
}