package Semana2.Lunes;

//clase abstracta para bicicletas de montaña
abstract class Mountain{
    //clase de montaña
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montaña");

    }
    //metodo abstracto
    abstract void cambiarVelocidad();
    //metodo vacio
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}

//clase que dependiendo del modelo cambie de velocidad
class Magistroni extends Mountain{
    //se utiliza el metodo abstracto (IMPLEMENTARLO)
    void cambiarVelocidad(){
        //se utiliza
        System.out.println("Se deben desbloquear las perillas del maniubro primero");

    }
}


public class Bicicleta {
    //metodo de manera general
    void cambiarVelocidad(){
        System.out.println("Gira la perrilla");

    }
    
    public static void main(String[] args) {
        //se construye con la marca Magistroli
        Mountain bici1 = new Magistroni();
        Bicicleta bici = new Bicicleta();
        //se realizan las modificaciones
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
        bici.cambiarVelocidad();

        
    } 
}

/*interfaces son solamenente para crear mecanismos de abstracción
completamente abstractos a un 100%
ademas se puede simular la herencia multiple atraves de extends(herencia padre) e implements(interfaces)
se usan porque simulan la herencia multiple y se logra un bajo acoplamiento


*/