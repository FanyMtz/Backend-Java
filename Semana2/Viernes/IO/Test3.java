package Semana2.Viernes.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {

        try {
            //lee el archivo asignado
            FileInputStream fis = new FileInputStream("C:\\hola.txt");
            //declara entero
            //el entero sirve para leer las posiciones
            int i = fis.read();
            //que se lea caracter por caracter
            System.out.println((char)i);
            fis.close();
        }catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
