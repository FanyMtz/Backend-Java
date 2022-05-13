package Semana1.Bici;
/*
    Overload: sobrecarga. metodo con el mismo nombre de la clase pero co diferente retorno
    Override: redefine. metodo que tiene la misma asignatura en diferentes clases
    Overwrite: sobreescribe
     */
public class Bike {
    //se declaran las variables
    private int velocidad;
    private String color, marca;

    //constructor por omision (basico)
    public Bike(String color, int velocidad){
        this.color = color;
        this.velocidad = velocidad;
    }

    public Bike(String color){
        this.color = color;
    }

    //se sobrecarga el constructor
    public Bike(int velocidad, String color, String marca) {
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }

    public int getVelocidad(){ return velocidad; }
    public String getColor(){ return color; }
    public String getMarca(){ return marca;}
}

