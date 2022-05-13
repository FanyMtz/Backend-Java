//HACE REFERENCIA A imonsh.jar

public class HolaMundo {

    public static void main(String[] args) {

        //objeto tipo screen
        Screen screen = new Screen();
        //objeto tipo Dialog
        Dialog d = new Dialog();
        String str;

        //salida en pantalla
        screen.out("Bienvenidos a la mision Backend Java", "Helvetica",28,Colors.Desire);
        //que sea visible
        screen.setVisible(true);
        //la cadena mostrar el mensaje y dependiendo del usuario escriba se estara capturando en la variable str
        str = d.readString("¿Quieres aprender a hacer esto? s/n");
        //si lo que escriba va a ser un si o no
        if(str.charAt(0) == 'S' || str.charAt(0) == 's'){
            screen.showImage("mundo.jpg");
            screen.out("Hola Explorers");
        }
        else
        {
            //mensaje con un arreglo en el texto
            screen.out("Tal vez en otro momento, Adiós", "Century Schoolbook L",28, Colors.Desire);
        }
    }
}
