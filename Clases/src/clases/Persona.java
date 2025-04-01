
package clases;

public class Persona {
   
    // ATRIBUTOS
    String nombre;
    String apellido;
    int edad;
    double estatura;
    boolean ocupado = false;
    final int MAXEDAD = 100;
    
    
    Persona(String nombre, String apellido, int edad, double estatura){
        this.nombre = nombre;
        if(
                edad>this.MAXEDAD){
            this.edad = MAXEDAD;
        }
        else{
            this.edad = edad;
        }
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    // METODOS
    @Override
    public String toString(){
        String mensaje;
        mensaje = "Datos de la persona: \n";
        mensaje += "\tNombre: " + this.nombre + "\n";
        mensaje += "\tApellido: " + this.apellido + "\n";
        mensaje += "\tEdad: " + this.edad + "\n";
        mensaje += "\tEstatura: " + this.estatura + "\n";
        
        return mensaje;
    }
    
    public void cumplirAños(){
        if(!(this.edad >= this.MAXEDAD)){
            this.edad++;
        }
    }
    
    
    public void saludar(){
        if(!this.ocupado){
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Encantada de saludarte");
        }
        else{
            System.out.println(this.nombre + " no puede saludar");
        }
    }
    
    public void trabajar(){
        this.ocupado = true;
    }
    
    public void descansar(){
        this.ocupado = false;
    }
    
}
