
package ejerciciospoo;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String pais;
    private static final String PAISDEFECTO = null;
    
    String arrayPaises[] = {
        "España",
        "Bulgaria",
        "Colombia",
        "Venezuela"
    };
    
    // Constructor
    Persona(String nombre, int edad, char sexo, String pais){
        this.nombre = nombre;
        this.edad = edad;
        if(this.edad < 0){
            this.edad = 18;
        }
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }else{
            this.sexo = 'N';
        }
        for (int i = 0; i < arrayPaises.length; i++) {
            if (pais.equalsIgnoreCase(this.arrayPaises[i])) {
                this.pais = pais;
                break;
            }else{
                this.pais = PAISDEFECTO;
            }
        }
    }
    
    // Metodos
    public String saludar(){
        String mensaje = "";
        if(this.pais != null){
            mensaje = "Hola! Me llamo " + this.nombre + " y soy de " + this.pais;
        }else{
            mensaje = "Hola! Me llamo " + this.nombre;
        }
        
        return mensaje;
    }
    
    public boolean esMayorEdad(){
        boolean mayor;
        if (this.edad >= 18) {
            mayor = true;
        }else{
            mayor = false;
        }
        
        return mayor;
    }
    
    // toString
    @Override
    public String toString(){
        String mensaje = "";
        mensaje += "Informacion de la persona:\n";
        mensaje += "\tNombre: " + this.nombre + "\n";
        mensaje += "\tEdad: " + this.edad + "\n";
        mensaje += "\tSexo: " + this.sexo + "\n";
        if(this.pais != null){
            mensaje += "\tPais: " + this.pais + "\n";
        }else{
            mensaje += "\tPais: Desconocido";
        }
        
        return mensaje;
    }
}
