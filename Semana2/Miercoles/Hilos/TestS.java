package Semana2.Miercoles.Hilos;


//extiende de la clase Thread
public class TestS extends Thread{
    
    //se define el void run
    public void run(){
        //para cada cosa que se vaya a ejecutar en donde i es igual a 1 pero debera de ser menor de 10
        for (int i=1; i<=10; i++)
        {
            //intenta
            try{
                //entonces se intentara esperarse 1/2 segundo
                Thread.sleep(500);
                //va a estar imprimiendo el valor del i
                System.out.println(i);
                //mientras en caso de que se interrumpa 
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        //inicializa el hilo
        TestS h1 = new TestS();
        //se empieza a correr
        h1.start();

        //define el comportamiento
        HilosS h2 = new HilosS();
        //se convierte en un hilo
        Thread hr2 = new Thread(h2);
        hr2.start();
    }
}


//se crea clase en donde se corra directamente con el runnable 
class HilosS implements Runnable{
    //se define el void run
    public void run(){
        //para cada cosa que se vaya a ejecutar en donde i es igual a 1 pero debera de ser menor de 10
        for (int i=1; i<=10; i++)
        {
            //intenta
            try{
                //entonces se intentara esperarse 1/2 segundo
                Thread.sleep(500);
                //va a estar imprimiendo el valor del i
                System.out.println(i);
                //mientras en caso de que se interrumpa 
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}