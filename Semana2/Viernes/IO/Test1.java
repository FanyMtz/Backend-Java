package Semana2.Viernes.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        //runnable que escriba un archivo
       Runnable t1 = new Runnable() {
           @Override
           public void run() {
               //actividad que se va a hacer
               //hilo que escribe
               try {
                   //escribe un archivo de texto que se llama hola.txt que se escribe en el disco local C
                   FileOutputStream fos = new FileOutputStream("C:\\holaHilo.txt");
                   fos.write(65);
                   //se tiene que cerrar
                   fos.close();
               } catch (IOException ioe) {
                   System.out.println(ioe);
               }
           }
       };

       //hilo que se encarga a escribir un archivo
        Thread writeFile =  new Thread(t1);
        //se manda llamar el hilo
        writeFile.start();
    }
}
