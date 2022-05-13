//GETTERS AND SETTERS
package Semana3.practicaHarry;

public class Personajes {

    //creación de variables
    //caracteristicas
    public String nombre,genero,casa,boggart,patronus;

    //funciones
    //get cuando nos va a regresar los datos
    public String getNombre(){ return nombre;}
    public String getGenero(){ return genero;}
    public String getCasa(){ return casa;}
    public String getBoggart(){ return boggart;}
    public String getPatronus(){ return patronus;}

    //set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setCasa(String casa){
        this.casa = casa;
    }
    public void setBoggart(String boggart){
        this.boggart = boggart;
    }
    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public String printState(){
        return "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Casa: "+casa+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus;
    }
}
