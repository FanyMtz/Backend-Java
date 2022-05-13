package Semana2.Viernes.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {

    public static void main(String[] args) {
        try {
            //leer una cadena de caracteres
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            //se declara entero
            int i = 0;
            //mientras que esto suceda y tenga algo que leer esto seguira realizandose
            //cuando en un archivo se esta leyendo caracter por caracter el ultimo que seria el -1 ya seria el final de todo
            while((i=fis.read())!=-1){
                //muestre el contador a manera de caracter
                System.out.print((char)i);
            }
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
