package Semana2.Viernes.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test5 {
    public static void main(String[] args) {
        try{
            //se crea el archivo
            FileOutputStream fos = new FileOutputStream("C:\\magic.txt");
            //
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            //se declara el mensaje
            String s = "Hola viajeros de \n Innovaccion Virtual";
            //arreglo bytes
            byte[]b = s.getBytes();
            //escriba el mensaje en el archivo
            bout.write(b);
            //
            bout.flush();
            bout.close();
            fos.close();
            System.out.println("Ready");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
