package Semana2.Lunes;

//clase en donde nos enfocamos unicamente en lo que hacen
//clase abstracta
abstract class Sombra{
    //funcionamiento de las clases abstractas empiezan con el abstract.
   
    //metodo abstracto
    abstract void dibujarSombra();

    /*los metodos abstractos son squellos que se van a implementar despues
        abstract void dibujarSombra();

    los metodos vacios
        void dibujarSombra(){}

    */
}

//definir los metodos abstractos
//los abstractos extends de
class Arma extends Sombra{
    //se implementan los metodos que se tienen en Sombra, tienendo asi un metodo vacio
   @Override
    void dibujarSombra(){
        //implementa. da a entender que va a ejecutar otra cosa
        System.out.println("Dibujando sombras en el arma color azul");
    }
}

public class Personaje extends Arma {
    public static void main(String[] args) {
        //se genera un objeto sombra de tipo sombra1
        //abstraccion va a ser la que le diga como dibujarSombra()
        
        //la flecha se va a dibujar dependiendo del personaje
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        //que dibuje la flecha por medio del metodo
        flecha.dibujarSombra();
        arco.dibujarSombra();
    }
    //se cambia
    @Override
    void dibujarSombra(){
        System.out.println("Dibuja una sombra blanca");
        
    }
}
