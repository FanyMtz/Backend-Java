package Semana2.Viernes.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        try {
            //comando para crear el archivo en el C:
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            //se escribe toda una cadena de texto en el documento
            String s = "Magia!!!";
            //arreglo de bytes para mandarlo por el flujo. se trae todos los bytes de 1 x 1
            byte b[]=s.getBytes();
            //que se esciba la palabra, trayendo todos los bytes que trae esta palabra
            fos.write(b);
            //se cierra el flujo
            fos.close();
            System.out.println("Magia!!!");
            //El catch debe de ser un IOException porque se manejan datos de entrada y salida
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
