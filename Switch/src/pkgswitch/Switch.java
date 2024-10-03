package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.println("Numero del dia de la semana:");
    int n = consola.nextInt();
    String text = "Valor desconocido";
    switch (n){
        case 1:
            text = "Lunes";
            break;
        case 2:
            text = "Martes";
            break;
        case 3:
            text = "Miercoles";
            break;
        case 4:
            text = "Jueves";
            break;
        case 5:
            text = "Viernes";
            break;
        case 6:
            text = "Sabado";
            break;
        case 7:
            text = "Domingo";
            break;
    }
        System.out.println(text);
    
    
    }
    
}
