package Semana2.Miercoles.Hilos;




//Hilos Thread
//se extiende de la clase Thread
public class HilosT extends Thread{
    
    //se redefine el area del comportamiento
    //Runnable - se define la accion que debe de hacer el hilo
    public void run(){
        //
        System.out.println("El hilo se esta ejecutando");
    }

    /*
    //metodos call back
    public void start(){
        inicializa la ejecucion de un hilo
        la JVM(Java Virtual Machine) llama al metodo run() del hilo
    }

    public void sleep(){
        detiene de manera temporal el numero especificado
    }
    public void join(){
        espera que el hilo se muera para entrar
    }
    public void getPriority(){
        regresa la prioridad del hilo
    }
    public void setPriority(){
        Establece la prioridad del hilo
    }
    public void getName(){
        Da el nombre del hilo
    }
    public void currentThread(){
        referencia del hilo que se etsa ejecutando
    }
    public void getId(){
        Regresa el ID del hilo 
    }
    public void Thread.State getState(){
        regresar el estado actual del hilo
    }
    public void isAlive(){
        SI esta vivo
    }
    */

    public static void main(String[] args) {
        //se crea un hilo
        //CICLO DE VIDA ENTRA A (NEW) - INICIA EL PROCESO
        HilosT hilo = new HilosT();
        //inicializa el hilo (Runnable)
        //entre new y runnable esta start, porque no se puede ejecutar si no se inicializa
        //como acaba de comenzar se va directo al metodo run (start -> metodo run)
        hilo.start();
        

    }
}

/*
//otra forma de mandar llamar hilos o reutilizarlos
//se crea una clase implementando directamente la interfaz runnable
class HilosR implements Runnable{

    //se redefine el metodo de la accion del hilo
    public void run(){
        System.out.println("El hilo de runnable esta "+"corriendo");
    }
    public static void main(String[] args) {
        //se inicializa el hilo
        HilosR h = new HilosR();
        //se inicializa el thread
        //se pasan todas las propiedades de la clase thread al hilo (h) -- este metodo haria el start
        //se crea un nuevo hilo apartir del comportamiento que se defina, para iniciarlo
        Thread t = new Thread(h);
        //
        t.start();
    }
}
*/