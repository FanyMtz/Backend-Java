//HERENCIA

package Semana3.practicaMona;

//clase en donde se encuentran todas las caracteristicas de la mona
//CLASE PADRE --> SUPER CLASE (CLASE MAESTRA)
//modelado del objeto principal
class Caracteristicas {
    int id;
    String nombre,vestimenta,actividad;
    Caracteristicas(int id, String nombre, String vestimenta, String actividad){
       //estas variables seran el mismo en donde le den de otra variable
        this.id = id;
        this.nombre = nombre;
        this.vestimenta = vestimenta;
        this.actividad = actividad;
    }
}

//la clase version se extiende de la clase caracteristicas, la cual trae toda la información de esta
public class Version extends Caracteristicas{
    //constructor
    Version(int id, String nombre, String vestimenta, String actividad){
        super(id,nombre,vestimenta,actividad);
    }
    //metodo que es informativo
    void display(){
        System.out.println(id+" "+nombre+" "+vestimenta+" "+actividad);
    }
}

//clase para probar las versiones
class TestVersion{
    public static void main(String[] args) {
        //se le asignan los valores
        Version ve = new Version(138,". Surftocat: ","Traje surfista con aletas de pulpo ->","surfea");
        ve.display();

        Version ve1 = new Version(139,". Boxercat: ","Traje negro con cinta roja en la cabeza ->","boxea");
        ve1.display();

        Version ve2 = new Version(137,". Hulatocat: ","Falda hawaiana con ukulele ->","toca el ukulele");
        ve2.display();

        Version ve3 = new Version(128,". Dinotocat: ","Disfraz de dinosaurio ->","Aplasta un carrito");
        ve3.display();

        Version ve4 = new Version(126,". Catstello: ","Playera con estampado, con material de dj ->","realiza mezclas de musica en el mezclador");
        ve4.display();

        Version ve5 = new Version(122,". Inflatocat: ","Gorro de baño con flotante ->","Nada");
        ve5.display();
    }
}