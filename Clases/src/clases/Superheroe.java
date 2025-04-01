/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author MEDAC_T
 */
public class Superheroe {
    
    // Atributos
    
    private String nombre;
    private String superpoder;
    private int energia;
    
    
    // Atributos de estado
    
    private boolean enMision;
    private final int MAXENERGIA = 100;
    private final int MINENERGIA = 0;
    
    
    // Constructor
    
    Superheroe(String nombre, String superpoder, int energia){
        this.nombre = nombre;
        this.superpoder = superpoder;
        if(energia > this.MAXENERGIA){
            this.energia = MAXENERGIA;
        }
        else if(energia < this.MINENERGIA){
            this.energia = MINENERGIA;
        }
        else{
            this.energia = energia;
        }
        this.enMision = false;
    }
    
    
    // Informacion del superheroe
    
    @Override
    public String toString(){
        String mensaje;
        mensaje = "Datos del superheroe: \n";
        mensaje += "\tNombre: " + this.nombre + "\n";
        mensaje += "\tSuperpoder: " + this.superpoder + "\n";
        mensaje += "\tEnergia: " + this.energia + "\n";
        
        return mensaje;
    }
    
    
    // Metodos
    
    public void iniciarMision(){
        if(!this.enMision){
            if(this.energia >= 20){
                this.energia -= 20;
                System.out.println(this.nombre + " ha empezado la mision");
                this.enMision = true;
            }
            else System.out.println(this.nombre + " no tiene energia suficiente para empezar la mision");
        }else System.out.println(this.nombre + " ya esta en una mision");
    }
    
    public void terminarMision(){
        if(this.enMision){
            System.out.println(this.nombre + " ha terminado la mision con exito");
        }else System.out.println(this.nombre + " no esta en ninguna mision actualmente");
        
        this.enMision = false;
    }
    
    public void entrenar(int energiaAdquirida){
        if(this.energia != MAXENERGIA){
            this.energia += energiaAdquirida;
            if(this.energia > this.MAXENERGIA){
                this.energia = this.MAXENERGIA;
            }
            System.out.println(this.nombre + " ha terminado el entrenamiento con exito");
            System.out.println(this.nombre + " tiene una nueva energia: " + this.energia);
        }else System.out.println(this.nombre + " ya tiene la energia maxima posible");
    }
    
    public void usarSuperpoder(){
        System.out.println("***** SUPERPODER *****");
        if(this.energia >= 10){
            this.energia -= 10;
            System.out.println(this.nombre + " esta usando el superpoder " + this.superpoder + " y le queda " + this.energia + " energia");
        }else{
            System.out.println(this.nombre + " no puede usar " + this.superpoder + " porque no tiene energia suficiente");
        }
    }
    
    public void chequearEnergia(){
        if(this.energia > 0){
            System.out.println(this.nombre + " tiene " + this.energia + " de energia");
        }else {
            System.out.println(this.nombre + " no tiene energia disponible");
        }
    }
    
    public void cambiarSuperpoder(String superpoderNuevo){
        this.superpoder = superpoderNuevo;
    }
    
    public void atacar(Superheroe receptor){
        System.out.println(this.nombre + " ataca a " + receptor.nombre + " con " + this.superpoder);
        if(this.energia > receptor.energia){
            System.out.println(this.nombre + " ha vencido a " + receptor.nombre);
            receptor.energia -= 20;
            if(receptor.energia < this.MINENERGIA){
                receptor.energia = this.MINENERGIA;
            }
            System.out.println(receptor.nombre + " ha quedado debilitado y tiene " + receptor.energia + " de energia");
        }
        else if(this.energia < receptor.energia){
            System.out.println(receptor.nombre + " ha vencido a " + this.nombre);
            this.energia -= 20;
            if(this.energia < this.MINENERGIA){
                this.energia = this.MINENERGIA;
            }
            System.out.println(this.nombre + " ha quedado debilitado y tiene " + this.energia + " de energia");
        }
        else{
            System.out.println("El ataque no ha surgido efecto");
        }
        
    }
        
    // Getters
    public String getNombre(){
        return this.nombre;
    }

    public String getSuperpoder(){
        return (this.superpoder);
    }

    public int getEnergia(){
        return this.energia;
    }
    
    // Setters
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public void setSuperpoder(String nuevoSuperpoder){
        this.superpoder = nuevoSuperpoder;
    }
    
    public void setEnergia(int nuevaEnergia){
        this.energia = nuevaEnergia;
        if (this.energia > this.MAXENERGIA) {
            this.energia = this.MAXENERGIA;
        }
        else if (this.energia < this.MINENERGIA){
            this.energia = this.MINENERGIA;
        }
    }
}
