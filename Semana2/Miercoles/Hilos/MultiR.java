package Semana2.Miercoles.Hilos;

public class MultiR {
    public static void main(String[] args) {
        //genera un objeto de runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run(){
                System.out.println("Task one");
            }
        };

        //objeto runnable
        Runnable r2 = new Runnable() {
            public void run(){
                System.out.println("Task two");
            }
        };

        //se crea el hilo
        Thread t1 = new Thread(r1),
               t2 = new Thread(r2);

        
        //se ejecuta el thread
        t1.start();
        t2.start();
    }
}
