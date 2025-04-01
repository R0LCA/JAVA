/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package apuntescadenas;

public class ApuntesCadenas {

    public static void main(String[] args) {
        
        // String a array de caracteres
        String texto = "Hola Mundo";
        char cadena[] = texto.toCharArray();
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i]);
        }
        
        // Array de caracteres a String
        char cadena2[] = {'H', 'o', 'l', 'a'};
        String texto2 = new String(cadena2);
        System.out.println();
        System.out.println(texto2);
        
        // Longitud
        String cadena3 = "Hola"; // 4
        String cadena4 = ""; // 0
                
        int l3 = cadena3.length();
        int l4 = cadena4.length();
        System.out.println("Longitud de cadena3: " + l3);
        System.out.println("Longitud de cadena4: " + l4);
        
        // Comparacion de cadenas
        String cadena5 = "Hola mundo";
        String cadena6 = "Hola mundo";
        String cadena7 = "hola Mundo";
        
        System.out.println(cadena5.equals(cadena6)); // true
        System.out.println(cadena5.equals(cadena7)); // false
        System.out.println(cadena5.equalsIgnoreCase(cadena7)); // true
        
        // Comparacion alfabetica
        String cad1 = "Alondra";
        String cad2 = "Nutria";
        String cad3 = "Zorro";
        
        System.out.println(cad2.compareTo(cad1)); // Positivo, porque Nutria es mayor alfabeticamente
        System.out.println(cad2.compareTo(cad3)); // Negativo, porque Nutria es menor alfabeticamente
        
        System.out.println(cad1.compareToIgnoreCase("alondra")); // O
        
        // Concatenar cadenas
        String nombre = "Rodrigo";
        String apellido = "Labajos";
        
        System.out.println(nombre.concat(apellido));
        
        // Ver posiciones de un string individualmente
        System.out.println(nombre.charAt(5));
        
        // Hacer subcadenas
        String cadena10 = "Hola mundo";
        String cadena11 = cadena10.substring(5);
    }

}
