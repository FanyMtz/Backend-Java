//DEFINICION DEL OBJETO
package Semana1.Bici;

//Bloque que es todo un conjunto
public class Bicicleta {
 /*
    Overload: sobrecarga. metodo con el mismo nombre de la clase pero co diferente retorno
    Override: redefine. metodo que tiene la misma asignatura en diferentes clases
    Overwrite: sobreescribe
     */

    //Constructores
    //el que se muestra a continuacion esta pero no se ve a simple vista
    //public void Bicicleta(){}

    //constructor por omision, este no se puede redefinir ni se puede declarar porque si no seria una funcion
    Bicicleta(){

    }


    public Bicicleta(String color){
        this.color=color;
    }

    //Caracteristicas -  Campos - Propiedades del objeto
    // se deja en public porque se estara utilizando la clase en diferentes paquetes
    public int pins, rodada;
    public double velocidad;
    public String color;
    /* Tipos de clases
     * Public: se utiliza dentro de todo el proyecto
     * Private: se utiliza dentro del mismo paquete
     * Protected: se usa para todo el paquete */

    //Funciones creadas - Métodos
    //los getter y setters nos ayudan a inicializar los objetos
    public double getVelocidad(){ return velocidad; }
    public int getPins(){ return pins; }
    public int getRodada() { return rodada; }
    public String getColor() { return color;}
    //set trae cada uno de los renglones para traerlos a la funcion que los esta llamando
    /*public void es vacio. el void no es necesario que regrese datos
     * comparandolo con el public int en este si se solicita que regrese algun dato, porque ingresa un dato
     * */
    //public void setRodada(){}

    //boolean para saber si es si o no
    public boolean setPins(int pins){
        if(pins > 0 ){
            //this se usa para redefinir variables
            this.pins = pins;
            //el return sirve para que se pueda ejecutar porque al no agregarlo marcaria un error
            return true;
        } else
            /*Cuando es una condicion compuesta amerita agregar los corchetes
             * pero mientras tanto no sea asi, no es necesario */
            return false;
    }

    public boolean setRodada(int rodada) {
        if(rodada > 0 ){
            this.rodada = rodada;
            return true;
        } else
            return false;
    }

    public boolean setVelocidad (double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        //si el color no esta vacio ! = NO
        if(!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }


    //metodo de control para saber que sucedio
    public String printState(){
        return "pins: "+pins+"\n"+
                "rodada: "+rodada+"\n"+
                "velocidad: "+velocidad+"\n"+
                "color: "+color;
    }


}

