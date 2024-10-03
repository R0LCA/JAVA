/* 
    
    TEMA 3
    Ejercicio 16

    Realiza un programa que dada una cantidad de dinero en Euros,
    realice un desglose en billetes y monedas
    Los billetes disponibles son de 500,200,10,50,20,10 y 5€ y las monedas de 2 y 1€
*/

package t3ejercicio16;

import java.util.Scanner;

public class T3ejercicio16 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.print("Indique una cantidad a desglosar en EUROS: ");
    int euros = consola.nextInt();
        
    System.out.println("El desglose obtenido es...");
    if(euros>=500){
        int bill500 = euros/500;
        System.out.println(bill500 + " billetes de 500€");
        euros = euros - bill500 * 500;
    }    
    if(euros>=200){
        int bill200 = euros/200;
        System.out.println(bill200 + " billetes de 200€");
        euros = euros - bill200 * 200;
    }        
    if(euros>=50){
        int bill50 = euros/50;
        System.out.println(bill50 + " billetes de 50€");
        euros = euros - bill50 * 50;
    }            
    if(euros>=20){
        int bill20 = euros/20;
        System.out.println(bill20 + " billetes de 20€");
        euros = euros - bill20 * 20;
    }            
    if(euros>=10){
        int bill10 = euros/10;
        System.out.println(bill10 + " billetes de 10€");
        euros = euros - bill10 * 10;
    }                    
    if(euros>=5){
        int bill5 = euros/5;
        System.out.println(bill5 + " billetes de 5€");
        euros = euros - bill5 * 5;
    }                        
    if(euros>=2){
        int mon2 = euros/2;
        System.out.println(mon2 + " monedas de 2€");
        euros = euros - mon2 * 2;
    }                            
    if(euros>=1){
        int mon1 = euros/1;
        System.out.println(mon1 + " monedas de 1€");
    }
    
    
    
    
}
}
