
package ejerciciospoo;

public class EjerciciosPOO {

    public static void main(String[] args) {
    
//        // Rectangulo
//        Rectangulo rect = new Rectangulo(5, 2);
//        
//        System.out.println(rect);
//        
//        // Aritmetica
//        Aritmetica numeros = new Aritmetica(4.23, 12.54);
//        
//        System.out.println(numeros.sumar());
//        System.out.println(numeros.restar());
//        System.out.println(numeros.multiplicar());
//        System.out.println(numeros.dividir());
//        System.out.println(numeros.potencia());
        
        // Persona
        
        // Estudiante
        Estudiante persona1 = new Estudiante("Rodrigo", "Labajos Castro", 4);
        
        persona1.insertarNota(1);
        persona1.insertarNota(5);
        persona1.insertarNota(7);
        persona1.insertarNota(9);
        persona1.insertarNota(1);
        System.out.println(persona1);
        
    }

}
