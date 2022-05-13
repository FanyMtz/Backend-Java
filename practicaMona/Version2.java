//POLIMORFISMO
package Semana3.practicaMona;

//clase en donde se encuentran las actividades
class Mona{
    void id() {System.out.println(" ");}
    void nombre() { System.out.println(" ");}
    void vest(){    System.out.println(""); }
    void act(){  System.out.println("" );
                    System.out.println(" "); }
}

class Boxeador extends Mona{
    //redefine
    void id() {System.out.println("139");}
    void nombre(){  System.out.println("Boxercat");}
    void act(){ System.out.println("boxea");
        System.out.println(" ");}
    void vest(){ System.out.println("Traje negro con cinta roja en la cabeza");}
}

class Hawaiano extends Mona{
    //redefine
    void id() {System.out.println("137");}
    void nombre(){
        System.out.println("Hulatocat");
    }
    void act(){
        System.out.println("toca el ukulele");
        System.out.println(" ");
    }
    void vest(){    System.out.println("Falda hawaiana con ukulele");}
}

class Dino extends Mona{
    //redefine
    void id() {System.out.println("128");}
    void nombre(){
        System.out.println("Dinotocat");
    }
    void act(){
        System.out.println("Aplasta un carrito");
        System.out.println(" ");
    }
    void vest(){    System.out.println("Disfraz de dinosaurio"); }
}

class Stello extends Mona{
    //redefine
    void id() {System.out.println("126");}
    void nombre(){
        System.out.println("Catstello");
    }
    void act(){
        System.out.println("realiza mezclas de musica en el mezclador");
        System.out.println(" ");}
    void vest(){     System.out.println("Playera con estampado, con material de dj ");  }
}

class Infla extends Mona{
    //redefine
    void id() {System.out.println("122");}
    void nombre(){
        System.out.println("Inflatocat");
    }
    void act(){
        System.out.println("Nada");
        System.out.println(" ");
    }
    void vest(){    System.out.println("Gorro de baño con flotante"); }
}
    public class Version2 extends Mona {
        //redefine
        void id() {System.out.println("138");}

        void nombre() {System.out.println("Surftocat"); }

        void act() { System.out.println("surfea");
            System.out.println(" ");}

        void vest() {System.out.println("Traje surfista con aletas de pulpo");}


    public static void main(String[] args) {
        //el polimorfismo es cuando nos permite usar ambas clases de forma indistinta
        //como lo es con la clase Cara y la clase Version2.
        //en donde mon1, estara trayendo los datos de la clase Version2
        Mona ve1 = new Version2();
        ve1.id();    ve1.nombre();   ve1.vest();     ve1.act();

        Mona ve2 = new Boxeador();
        ve2.id();   ve2.nombre();   ve2.vest(); ve2.act();

        Mona ve3 = new Hawaiano();
        ve3.id();    ve3.nombre();  ve3.vest(); ve3.act();

        Mona ve4 = new Dino();
        ve4.id();   ve4.nombre();    ve4.vest();    ve4.act();

        Mona ve5 = new Stello();
        ve5.id();   ve5.nombre();   ve5.vest(); ve5.act();

        Mona ve6 = new Infla();
        ve6.id();   ve6.nombre();   ve6.vest();  ve6.act();
    }
}
