
package practica5;

public class Mascota {
    // Atributos
    private String nombre;
    private int nivelEnergia;
    private int nivelFelicidad;
    private int nivelHigiene;
    private boolean estadoSalud; // True sera sano, false sera enfermo 
    private boolean estadoGeneral; // True sera vivo, false sera muerto
    
    private static final int ENERGIADEFECTO = 10;
    private static final int FELICIDADDEFECTO = 10;
    private static final int HIGIENEDEFECTO = 10;
    
    // Constructor
    Mascota(String nombre){
        this.nombre = nombre;
        this.nivelEnergia = ENERGIADEFECTO;
        this.nivelFelicidad = FELICIDADDEFECTO;
        this.nivelHigiene = HIGIENEDEFECTO;
        this.estadoSalud = true;
        this.estadoGeneral = true;
    }
    
    // toString
    @Override
    public String toString(){ // Modificamos el metodo toString para ver la informacion de la mascota
        String mensaje = "";
        mensaje += "INFORMACION DE LA MASCOTA\n";
        mensaje += "-------------------------\n";
        mensaje += "\tNombre: " + this.nombre + "\n";
        mensaje += "\tEnergia: " + this.nivelEnergia + "\n";
        mensaje += "\tFelicidad: " + this.nivelFelicidad + "\n";
        mensaje += "\tHigiene: " + this.nivelHigiene + "\n";
        // Para no ver un "True" o un "Falso" observamos el valor de los booleanos para mostrarlo en español
        if (estadoSalud){
            mensaje += "\tSalud: Sano\n";
        }else {
            mensaje += "\tSalud: Enfermo\n";
        }
        if (estadoGeneral) {
            mensaje += "\tEstado: Vivo\n";
        }else{
            mensaje += "\tEstado: Muerto\n";
        }
        
        return mensaje;
    }
    
    // Metodos
    public void comprobar(){ // Metodo para comprobar que se respeten las restricciones
        if(estadoGeneral){ // En caso de que este viva...
            // Comprobamos que todos los valores no exceden su limite.
            if(this.nivelEnergia > ENERGIADEFECTO) this.nivelEnergia = ENERGIADEFECTO;
            if(this.nivelFelicidad > FELICIDADDEFECTO) this.nivelFelicidad = FELICIDADDEFECTO;
            if(this.nivelHigiene > HIGIENEDEFECTO) this.nivelHigiene = HIGIENEDEFECTO;
            // Comprobamos que no puedan ser valores negativos
            if(this.nivelEnergia < 0) this.nivelEnergia = 0;
            if(this.nivelFelicidad < 0) this.nivelFelicidad = 0;
            if(this.nivelHigiene < 0) this.nivelHigiene = 0;
            // Controlamos que la mascota enferme en caso de que no tenga valores suficientes
            if(this.nivelEnergia < 5 || this.nivelFelicidad < 5 || this.nivelHigiene < 5){
                if(estadoSalud){ // Si estaba sano que indique que acaba de enfermar
                    System.out.println(this.nombre + " ha enfermado");
                }
                this.estadoSalud = false;
            }
            // Si la mascota tienes todos sus niveles mayores a 5 sanará
            if(this.nivelEnergia >= 5 && this.nivelFelicidad >= 5 && this.nivelHigiene >= 5){
                if (!estadoSalud) { // Si estaba enfermo que indique que ya ha sanado
                    System.out.println(this.nombre + " ha sanado");
                }
                this.estadoSalud = true;
            }
        }
        // Si alguno de los valores es 0, la mascota morira.
        if(this.nivelEnergia == 0 || this.nivelFelicidad == 0 || this.nivelHigiene == 0){
            this.estadoGeneral = false;
            this.nivelEnergia = -1;
            this.nivelFelicidad = -1;
            this.nivelHigiene = -1;
            System.out.println(this.nombre + " ha fallecido");
        }
    }
    
    public void jugar(){
        if(!estadoGeneral){ // En caso de que este muerta la mascota no realizara ninguna acción.
            System.out.println(this.nombre + " esta muerto/a");
            return;
        }
        
        if(!estadoSalud){
            this.nivelEnergia -= 1;
        }
        this.nivelEnergia -= 3;
        this.nivelHigiene -= 2;
        this.nivelFelicidad += 5;
        System.out.println(this.nombre + " ha jugado un rato a la pelota");
        comprobar();
    }
    
    public void comer(){
        if(!estadoGeneral){ // En caso de que este muerta la mascota no realizara ninguna acción.
            System.out.println(this.nombre + " esta muerto/a");
            return;
        }
        
        this.nivelEnergia += 3;
        this.nivelHigiene -= 1;
        System.out.println(this.nombre + " se ha puesto las botas de comer");
        comprobar();
    }
    
    public void bañarse(){
        if(!estadoGeneral){ // En caso de que este muerta la mascota no realizara ninguna acción.
            System.out.println(this.nombre + " esta muerto/a");
            return;
        }
        
        if(!estadoSalud){
            this.nivelEnergia -= 1;
        }
        this.nivelEnergia -= 2;
        this.nivelHigiene = HIGIENEDEFECTO;
        System.out.println(this.nombre + " se ha dado una buena ducha");
        comprobar();
    }
    
    public void dormir(){
        if(!estadoGeneral){ // En caso de que este muerta la mascota no realizara ninguna acción.
            System.out.println(this.nombre + " esta muerto/a");
            return;
        }
        
        this.nivelEnergia += 5;
        this.nivelFelicidad -= 2;
        System.out.println(this.nombre + " ha echado una cabezadita");
        comprobar();
    }
}
