/* 
    
    TEMA 3
    Ejercicio 10

    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
    Recordamos que existen meses con 28, 30 y 31 días. No consideramos los años
    bisiestos
    
*/

package t3ejercicio10;

import java.util.Scanner;

public class T3ejercicio10 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        System.out.println("Indica un mes y anio para indicar cuantos dias tiene");
        
        System.out.print("Mes: ");
        int mes = consola.nextInt();
        System.out.print("Anio: ");
        int año = consola.nextInt(); 
        System.out.println("\n");
        
       
        switch(mes){
            case 2:
                if ((año % 4 == 0 && año % 100 !=0) || año % 400 == 0){
                System.out.println("El mes seleccionado en el anio " + año + " tiene 29 dias");
                }else System.out.println("El mes seleccionado en el anio " + año + " tiene 28 dias");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes seleccionado en el anio " + año + " tiene 31 dias");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes seleccionado en el anio " + año + " tiene 30 dias");
                break;
            default:
                if(mes > 12 || mes < 1){
                    System.out.println("Introduce un valor para el mes correcto, entre 1 y 12");
                }
                break;
        } 
    }
}