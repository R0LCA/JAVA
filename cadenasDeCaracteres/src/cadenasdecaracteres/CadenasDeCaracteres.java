
package cadenasdecaracteres;

public class CadenasDeCaracteres {

    public static void main(String[] args) {
        
        String texto = "Hola mundo";
        char cadena[] = texto.toCharArray();
        
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i]);
        }
    }

}
