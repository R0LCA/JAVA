package operadores;

public class Operadores {

    public static void main(String[] args) {
        double a = 3 , b = 2, c = 1.5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("--------");

    // OPERADORES BÁSICOS
        System.out.println("------------- OPERADORES BASICOS -------------");
        
        // Operador suma
        double suma = a + b;
        System.out.println("La suma de ambos numeros da: " + suma);

        // Operador resta
        double resta = a - b;
        System.out.println("La resta de ambos numeros da: " + resta);

        // Operador multiplicacion
        double multiplicacion = a * b;
        System.out.println("La multiplicacion de ambos numeros da: " + multiplicacion);

        // Operador division
        double division = a / b;
        System.out.println("La divison de ambos numeros da: " + division);
        
        // Operador resto
        double resto = a % b;
        System.out.println("El resto de la division de ambos numeros da: " + resto);
        
    // OPERADORES MATH
        System.out.println("--------------- OPERADORES MATH ---------------");
        
        // Operador raiz cuadrada
        double raiz = Math.sqrt(a);
        System.out.println("La raiz cuadrada de " + a + " es: " + raiz);
        
        // Operador de redondeo 
        double redondeo = Math.round(c);
        System.out.println("Al redondear el numero " + c + " nos da: " + redondeo);
            // Operador de redondeo arriba -> (Math.ceil)
            // Operador de redondeo abajo  -> (Math.floor)
        
        // Operador de potencia (pow)
        double pot = Math.pow(a, b);
        System.out.println("La potencia de " + b + " sobre " + a + " nos da como resultado: " + pot);
        
    }
}