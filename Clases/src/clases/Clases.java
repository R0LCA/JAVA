package clases;

public class Clases {

    public static void main(String[] args) {
        // Probar, crear, utilizar las clases y los objetos
        // Creamos un objeto de tipo persona
        
        
//        Persona p1 = new Persona("Pepa", "Martin", 18, 1.87);
//        /*
//        p1.nombre = "Pepa";
//        p1.apellido = "Martin";
//        p1.edad = 18;
//        p1.estatura = 1.87;
//        */
//        /*
//        System.out.println(p1.nombre);
//        System.out.println(p1.apellido);
//        System.out.println(p1.edad);
//        System.out.println(p1.estatura);
//        */
//        
//        System.out.println(p1);
//        
//        Persona p2 = new Persona("Mariceli", "Paredess", 48, 1.65);
//        /*
//        p2.nombre = "Mariceli";
//        p2.apellido = "Paredes";
//        p2.edad = 48;
//        p2.estatura = 1.65;
//        */
//        /*
//        System.out.println(p2.nombre);
//        System.out.println(p2.apellido);
//        System.out.println(p2.edad);
//        System.out.println(p2.estatura);
//        */
//        
//        System.out.println(p2);
//        
//        p1.trabajar();
//        p1.saludar();
//        p1.descansar();
//        p1.saludar();
//        
//        Persona p3 = new Persona("Rocio", "Castillo", 140, 1.98);
//        
//        System.out.println(p3);
        
        Superheroe facha = new Superheroe("Facha", "Derechazo abierto", 100);
        Superheroe rojo = new Superheroe("Rojo", "Robo descarado", 100);
        
        /*    Pruebas ejercicios final      */
        rojo.usarSuperpoder();
        rojo.iniciarMision();
        rojo.terminarMision();
        rojo.cambiarSuperpoder("Llorar bajo un puente");
        System.out.println(rojo);
        facha.atacar(rojo);
        Superheroe arraySuperheroes[] = new Superheroe[2];
        arraySuperheroes[0] = facha;
        arraySuperheroes[1] = rojo;
        
        for (int i = 0; i < arraySuperheroes.length; i++) {
            System.out.println(arraySuperheroes[i]);
        }
    }

}
