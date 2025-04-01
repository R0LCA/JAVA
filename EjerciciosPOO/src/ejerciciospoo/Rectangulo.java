
package ejerciciospoo;

public class Rectangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        this.area = (this.base * this.altura);
        return this.area;
    }
    
    public double calcularPerimetro(){
        this.perimetro = (2 * (this.base + this.altura));
        return this.perimetro;
    }
    
    @Override
    public String toString(){
        String mensaje = "";
        mensaje += "-----------------------------\n";
        mensaje += "Rectangulo con base " + this.base + " y altura " + this.altura + "\n";
        mensaje += "Area: " + calcularArea() + "\n";
        mensaje += "Perimetro: " + calcularPerimetro() + "\n";
        mensaje += "-----------------------------";
        
        return mensaje;
    }
}
