/* 
    
    TEMA 3
    Ejercicio 13 (14 del documento de ejercicios)

    El sistema de verificación en dos pasos funciona de la siguiente
    manera:
        - Se le pide al usuario que introduzca su nick, su email y la contraseña.
        - Si el email y la contraseña son correctos (definir los dos valores que
        querais), el programa va a generar un número aleatorio de 4 cifras y lo va
        a mostrar por pantalla.
        - A continuación, se vuelve a pedir el email, la contraseña y, esta vez, el
        número aleatorio.
        - Si todo ha ido correctamente, se mostrará el mensaje: “Verificación
        aceptada. Bienvenid@: xxxxxx (siendo xxxxxx el nick del usuario).
        - Si hay algún fallo, se mostrará un mensaje de error.
        Crea un algoritmo que reproduzca el comportamiento antes indicado.

*/

package t3ejercicio13;

import java.util.Scanner;

public class T3ejercicio13 {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.println("REGISTRO");
    System.out.println("-------->");
    System.out.print("Introduce tu nickname: ");
    String nickname = consola.nextLine();
    System.out.print("Introduce tu email: ");
    String emailX = consola.nextLine();
    System.out.print("Introduce tu contrasenia: ");
    String passX = consola.nextLine();
    
    double token1 = Math.floor( Math.random() * 9999 + 1000 + 1);
    int tokenX = (int)token1;
            
    System.out.println("\nTu codigo de verificacion es: " + tokenX);
    
    
    System.out.println("\n\nINICIO DE SESION");
    System.out.println("---------------->");
    System.out.print("Email: ");
    String email = consola.nextLine();
    if(email.equals(emailX)){
        System.out.print("Contrasenia: ");
        String pass = consola.nextLine();
        if(pass.equals(passX)){
            System.out.print("Clave de seguridad: ");
            double token = consola.nextInt();
    
            if(tokenX == token){
                System.out.println("\nVerificacion aceptada. Bienvenid@ " + nickname);
            }else System.out.println("\nVerificacion denegada. Clave de seguridad incorrecta");
        }else System.out.println("ERROR. Contraseña Incorrecta");
    }else System.out.println("ERROR. Email incorrecto");
    }
}
