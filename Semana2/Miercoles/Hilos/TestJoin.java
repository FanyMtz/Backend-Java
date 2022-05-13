package Semana2.Miercoles.Hilos;

//extiende de la clase Thread
public class TestJoin extends Thread{
    
    //se define el void run
    public void run(){
        //cuente del 1  al 5
        for(int i = 1; i<=5; i++){
            try {
                //manda los numeros con espacios de un intervalo de .5 seg
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            //cuado ya se haya contado se muestra
            System.out.println(i);
        }
        
    }
    
    public static void main(String[] args) {
        //se incializa
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
        //se mandan los hilos al metodo showDetails
        showDetails(t1,t2,t3);
        //inicia los hilos
        t1.start();
        try {
            t1.join(1500);
            //nombre del hilo
            t1.setName("LaunchX");
            //tiene la prioridad maxima
            t1.setPriority(MAX_PRIORITY);

        } catch (InterruptedException ie) {
            //ruta en donde fallo
           ie.printStackTrace();
        }
        t2.start();
        t3.start();

    }

    //conoce los detalles dle hilo como nombre,id,estado,prioridad
    public static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo 1 "+ t1.getName()+ " id: "+
        t1.getId()+" estado: "+t1.getState()+ " prioridad: "+t1.getPriority());
    
        System.out.println("Hilo 2 "+ t2.getName()+ " id: "+
        t2.getId()+" estado: "+t2.getState()+ " prioridad: "+t2.getPriority());

        System.out.println("Hilo 3 "+ t3.getName()+ " id: "+
        t3.getId()+" estado: "+t3.getState()+ " prioridad: "+t3.getPriority());
    }
}
