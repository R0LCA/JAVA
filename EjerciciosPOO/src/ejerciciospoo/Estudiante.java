
package ejerciciospoo;
import java.util.Scanner;


public class Estudiante {
    Scanner consola = new Scanner(System.in);
    private String nombre;
    private String apellidos;
    private double calificaciones[];
    private int indice;
    
    Estudiante(String name, String name2, int numNotas){
        this.nombre = name;
        this.apellidos = name2;
        this.calificaciones = new double[numNotas];
        this.indice = 0;
        for (int i = 0; i < this.calificaciones.length; i++) {
            this.calificaciones[i] = -1;
        }
    }
    
    @Override
    public String toString(){
        String mensaje = "";
        mensaje += "Estudiante: " + this.nombre + " " + this.apellidos + "\n";
        mensaje += "Notas: " + verArray(this.calificaciones) + "\n";
        mensaje += "Rangos: " + indicarRangos() + "\n";
        mensaje += "Media: " + calcularMedia() + "\n";
        
        return mensaje;
    }
    
    String verArray(double array[]){
        String arraynotas = "";
        for (int i = 0; i < array.length; i++) {
            if(this.calificaciones[i] != -1){
                arraynotas += this.calificaciones[i] + " ";
            }
        }
        return arraynotas;
    }
    
    void insertarNota(double nota){
        if(nota < 0 || nota > 10){
            System.out.println("Introduce una nota valida");
        }else{
            if(this.indice < this.calificaciones.length){
                this.calificaciones[this.indice] = nota;
                this.indice++;
            }else{
                System.out.println("A este estudiante no se le pueden insertar mas notas");
            }
        }
    }
    
    void mostrarNotas(){
        System.out.println("Notas de " + this.nombre + ":");
        for (int i = 0; i < this.calificaciones.length; i++) {
            if(this.calificaciones[i] != -1){
                System.out.println("Nota " + i + ": " + this.calificaciones[i]);
            }
        }
    }
    
    double calcularMedia(){
        double media = 0;
        int indiceMedia = 0;
        for (int i = 0; i < this.calificaciones.length; i++) {
            if(this.calificaciones[i] != -1){
                media += this.calificaciones[i];
                indiceMedia++;
            }
        }
        media /= indiceMedia;
        return media;
    }
    
    String indicarRangos(){
        String mensajeRangos = "";
        int insuficientes = 0;
        int suficientes = 0;
        int notables = 0;
        int sobresalientes = 0;
        for (int i = 0; i < this.calificaciones.length; i++) {
            if(this.calificaciones[i] != -1){
                if(this.calificaciones[i] >= 0 && this.calificaciones[i] < 5){
                    insuficientes++;
                }
                if(this.calificaciones[i] >= 5 && this.calificaciones[i] < 7){
                    suficientes++;
                }
                if(this.calificaciones[i] >= 7 && this.calificaciones[i] < 9){
                    notables++;
                }
                if(this.calificaciones[i] >= 9 && this.calificaciones[i] <= 10){
                    sobresalientes++;
                }
            }
        }
        mensajeRangos += "\n\tInsuficientes: " + insuficientes + "\n";
        mensajeRangos += "\tSuficientes: " + suficientes + "\n";
        mensajeRangos += "\tNotables: " + notables + "\n";
        mensajeRangos += "\tSobresalientes: " + sobresalientes;
        return mensajeRangos;
    }
    
    
}
