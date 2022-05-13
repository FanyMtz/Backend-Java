package Semana2.Viernes.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    //main
    public static void main(String[] args) {
        //para utilizar los hilos se utiliza el runnable para hacerlo mas directo
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try {
                    //comando para crear el archivo en el C:
                    FileOutputStream fos = new FileOutputStream("C:\\magiarun.txt");
                    //se escribe toda una cadena de texto en el documento
                    String s = "Magia con Runnable!!!";
                    //arreglo de bytes para mandarlo por el flujo. se trae todos los bytes de 1 x 1
                    byte b[]=s.getBytes();
                    //que se esciba la palabra, trayendo todos los bytes que trae esta palabra
                    fos.write(b);
                    //se cierra el flujo
                    fos.close();
                    System.out.println("Magia Runnable!!!");
                    //El catch debe de ser un IOException porque se manejan datos de entrada y salida
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        //se manda a hbalr el hilo
        Thread magic = new Thread(rm);
        magic.start();
    }
}
