package Semana2.Lunes;

//clase abstracta
abstract class Hola{
    //metodo vacio
    void saludar(){
        //como lo hace
        System.out.println("¿Cómo estás?, Te ves bien");
    }

    //metodo abstracto
    abstract void saludo();
}

//interface
//en la interface no permite que ninguno de los metodos se puedan implementar en la clase, porque si no se tiene que declarar
//y en las interfaces da por hecho que los metodos ya son abstractos
interface Mostrar{
    //que hace
    //el metodo show ya lo toma como abstracto al momento de estar en la interface
    void show();
    //metodo abstracto
    abstract void despide();
}

//se implementa la interface mostrar
public class SaludosCordiales implements Mostrar{
    //implementar el metodo show de la interface
    public void show(){
        System.out.println("Hola, '¿Cómo estás?, espero no del todo mal");
    }
    
    public static void main(String[] args) {
        //objeto
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
        
    }

    //implementa el metodo despide de la interface
    //no importa si el metodo esta vacio, pero necesita declararse
    public void despide(){
        System.out.println("Gracias, no");
    }
    
}
