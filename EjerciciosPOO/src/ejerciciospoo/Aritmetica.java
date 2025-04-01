
package ejerciciospoo;

public class Aritmetica {
    private double valor1;
    private double valor2;
    
    Aritmetica(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public double sumar(){
        return (this.valor1 + this.valor2);
    }
    
    public double restar(){
        return (this.valor1 - this.valor2);
    }
    
    public double multiplicar(){
        return (this.valor1 * this.valor2);
    }
    
    public double dividir(){
        return (this.valor1 / this.valor2);
    }
    
    public double potencia(){
        return Math.pow(this.valor1, this.valor2);
    }
}
