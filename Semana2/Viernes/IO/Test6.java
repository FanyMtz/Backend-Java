package Semana2.Viernes.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {

                                        // el throws IOE se pone en caso de que muestre algun error (en vez de poner el try catch)
    public static void main(String[] args) throws IOException{

            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            //para que cree el buffer del tamaño del string
            BufferedInputStream bin = new BufferedInputStream(fis);
            //para leerlo necesita hacer un while
            int i;
            //siempre debe de ser diferente de menos 1 para saber que se leyo todo el texto correctamente
            while(( i=bin.read())!=-1){
                //se convierte el caracter en un entero
                System.out.print((char)i);
            }
            bin.close();
            fis.close();

    }
}
