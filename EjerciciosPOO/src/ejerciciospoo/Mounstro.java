
package ejerciciospoo;

public class Mounstro {
    // Atributos
    String nombre;
    int puntosEsfuerzo;
    int vidas;
    int puntosHambre;
    boolean estado;
    
    final int MAXPUNTOSESFUERZO = 10;
    final int MAXPUNTOSHAMBRE = 3;
    final int MAXVIDAS = 7;
    
    // Constructor
    Mounstro(String nombre){
        this.nombre = nombre;
        this.puntosEsfuerzo = MAXPUNTOSESFUERZO;
        this.puntosHambre = MAXPUNTOSHAMBRE;
        this.vidas = MAXVIDAS;
        this.estado = true;
    }
    
    //toString
    @Override
    public String toString(){
        String mensaje = "";
        mensaje += "Informacion del monstruo:\n";
        mensaje += "\tNombre: " + this.nombre + "\n";
        mensaje += "\tPuntos de esfuerzo: " + this.puntosEsfuerzo + "\n";
        mensaje += "\tVidas: " + this.vidas + "\n";
        mensaje += "\tPuntos de hambre: " + this.puntosHambre + "\n";
        
        return mensaje;
    }
    
    // Metodos
    void jugar(){
        if(!estado){
            System.out.println(this.nombre + " esta muerto");
            return;
        }
        
        if(this.puntosEsfuerzo >= 3){
            if(this.puntosHambre >= 1){
                this.puntosEsfuerzo -= 3;
                this.puntosHambre -= 1;
            }else{
                System.out.println(this.nombre + " no tiene suficientes puntos de hambre");
            }
        }else{
            System.out.println(this.nombre + " no tiene suficientes puntos de esfuerzo");
        }
        comprobarEstado();
    }
    
    void comunicarse(){
        if(!estado){
            System.out.println(this.nombre + " esta muerto");
            return;
        }
                
        if(this.puntosEsfuerzo >= 1){            
            this.puntosEsfuerzo -= 1;
        }else{
            System.out.println(this.nombre + " no tiene puntos de esfuerzo suficientes");
        }
        comprobarEstado();
    }
    
    void comer(boolean comidaFav){
        if(!estado){
            System.out.println(this.nombre + " esta muerto");
            return;
        }
        
        if(this.puntosEsfuerzo >= 2){
            this.puntosEsfuerzo -= 2;
            if(!comidaFav){
                this.puntosHambre += 2;
            }else{
                this.puntosHambre += 3;
            }
            if(this.puntosHambre > MAXPUNTOSHAMBRE){
                    this.puntosHambre = MAXPUNTOSHAMBRE;
            }
        }else{
            System.out.println(this.nombre + " no tiene suficientes puntos de esfuerzo");
        }
    }
    
    void dormir(){
        if(!estado){
            System.out.println(this.nombre + " esta muerto");
            return;
        }
        
        this.puntosEsfuerzo += 5;
        if(this.puntosEsfuerzo > MAXPUNTOSESFUERZO){
                    this.puntosEsfuerzo = MAXPUNTOSESFUERZO;
                }
        System.out.println(this.nombre + " ha dormido como un rey");
    }
    
    void comprobarEstado(){
        if(this.vidas > 0){
            if(this.puntosEsfuerzo <= 0 || this.puntosHambre <= 0){
                this.vidas -= 1;
                System.out.println(this.nombre + " ha perdido una vida");
                this.puntosEsfuerzo = MAXPUNTOSESFUERZO;
                this.puntosHambre = MAXPUNTOSHAMBRE;
            }
        }
        if(this.vidas <= 0) {
            System.out.println(this.nombre + " ha fallecido");
            this.puntosEsfuerzo = -1;
            this.puntosHambre = -1;
            this.vidas = -1;
            estado = false;
        }
    }
}
