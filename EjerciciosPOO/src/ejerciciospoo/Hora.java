
package ejerciciospoo;

public class Hora {
    int horas;
    int minutos;
    int segundos;
    
    private int validarRango(int valor, int min, int max){
        if(valor < min || valor > max){
            return 0;
        }else{
            return valor;
        }
    }
    
    Hora(int horas, int minutos, int segundos){
        this.horas = validarRango(horas, 0, 23);
        this.minutos = validarRango(minutos, 0, 59);
        this.segundos = validarRango(segundos, 0, 59);
    }
    
    Hora(int horas, int minutos){
        this.horas = validarRango(horas, 0, 23);
        this.minutos = validarRango(minutos, 0, 59);
    }
    
    Hora(int horas){
        this.horas = validarRango(horas, 0, 23);
    }
    
    public void verHora(){
        System.out.println("Hora actual: " + this.horas + " horas, " + this.minutos + " minutos, " + this.segundos + " segundos.");
    }
    
    public void modificarHora(int horas, int minutos, int segundos){
        this.horas = validarRango(horas, 0, 23);
        this.minutos = validarRango(minutos, 0, 59);
        this.segundos = validarRango(segundos, 0, 59);
        System.out.println("La hora ha sido modificada correctamente");
        System.out.println("Hora actual: " + this.horas + " horas, " + this.minutos + " minutos, " + this.segundos + " segundos.");
    }
}
