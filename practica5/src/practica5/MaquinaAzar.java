
package practica5;

public class MaquinaAzar {
    // Atributos de la tragaperra
    private int numIzquierda;
    private int numCentro;
    private int numDerecha;
    private double peso;
    private double altura;
    private double anchura;
    private double largo;
    private int dinero;
    
    private static final int DINEROINICIAL = 10000;
    
    //Constructor
    MaquinaAzar(double peso, double altura, double anchura, double largo){
        this.numIzquierda = (int) (Math.random() * 9 + 1);
        this.numCentro = (int) (Math.random() * 9 + 1);
        this.numDerecha = (int) (Math.random() * 9 + 1);
        this.peso = peso;
        this.altura = altura;
        this.anchura = anchura;
        this.largo = largo;
        this.dinero = DINEROINICIAL;
    }
    
    // Getters
    public int getCantidadDinero(){
        return this.dinero;
    }
    
    // Metodos    
    public void jugar(){
        this.dinero += 25; // Aumentamos el dinero de la apuesta a la maquina
        // Creamos los tres numeros aleatorios
        this.numIzquierda = (int) (Math.random() * 9 + 1);
        this.numCentro = (int) (Math.random() * 9 + 1);
        this.numDerecha = (int) (Math.random() * 9 + 1);
        // Mostramos el resultado de la jugada
        System.out.println("La jugada ha sido: " + this.numIzquierda + ", " + this.numCentro + ", " + this.numDerecha);
        // Comprobamos si ha ganado o no
        if(this.numIzquierda == this.numCentro && this.numIzquierda == this.numDerecha){ // Si los tres numeros son iguales...
            int premio = 100 * this.numIzquierda; // Calculamos el premio
            this.dinero -= premio; // Restamos el premio del dinero que tiene la maquina
            System.out.println("ENHORABUENA! Has ganado " + premio + " euros<"); // Mostramos el premio
        }else{
            System.out.println("Lo siento, no ha habido suerte"); // En caso de que no se gane lo indicamos tambien
        }
    }
}
