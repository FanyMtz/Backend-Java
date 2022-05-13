package Semana2.Miercoles.Hilos;
/*
//se extiende de thread
public class MultiTask extends Thread{
    
    //metodo run
    public void run(){
        System.out.println("Tarea uno");
    }

    public static void main(String[] args) {
        //se incilizan los hilos
        MultiTask t1 =  new MultiTask(),
                  t2 = new MultiTask(),
                  t3 = new MultiTask();

        //aqui los hilos hacen lo mismo
        t1.start();
        t2.start();
        t3.start();
    }
}
*/
//clase que se implementa directo con runnable
class MultiTasking implements Runnable{
    public void run(){
        System.out.println("Tarea uno Runnable");
    }

    public static void main(String[] args) {
        //se crean un hilo, atraves de la construccion de un objeto anonimo del tipo MultiTasking
        //Multitasking ejecuta el metodo run a su antojo
        Thread t1 = new Thread(new MultiTasking());
        Thread t2 = new Thread(new MultiTasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        //se ejecutan los hilos
        t1.start();
        t2.start();

        task1.start();
        task2.start();

    }
}
//thred permite redefinir lo que ya se hizo
class Task1 extends Thread{
    public void run(){
        System.out.println("Tarea A Runnable");
    }
}

class Task2 extends Thread{
    public void run(){
        System.out.println("Tarea B Runnable");
    }
}