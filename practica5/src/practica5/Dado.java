
package practica5;

public class Dado {
    // Atributos
    private int numCaras;
    private double peso;
    private String color;
    
    private static final int NUMCARASDEFECTO = 6; // Numero de caras por defecto
    
    // Constructor
    Dado(double peso, String color){
        this.numCaras = NUMCARASDEFECTO;
        this.peso = peso;
        this.color = color;
    }
    
    // Getters
    public int getNumCaras(){ // Devuelve el numero de caras del dado
        return this.numCaras;
    }
    
    public double getPeso(){ // Devuelve el peso del dado
        return this.peso;
    }
    
    public String getColor(){ // Devuelve el color del dado
        return this.color;
    }
    
    // Setters
    public void setNumCaras(int nuevoNumCaras){ // Asigna un nuevo numero de caras al dado
        this.numCaras = nuevoNumCaras;
    }
    
    public void setColor(String nuevoColor){ // Asigna un nuevo color al dado
        this.color = nuevoColor;
    }
    
    public void setPeso(double nuevoPeso){ // Asigna un nuevo peso al dado
        this.peso = nuevoPeso;
    }
    
    // Metodos
    public void lanzar(){
        int numero = (int) (Math.random() * this.numCaras + 1); // Dara un numero aleatorio entre 1 y el numero de caras que tenga el dado
        System.out.println("Ha salido un: " + numero);
    }

}
