package ch26_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputException02 {

    public static void main(String[] args) throws IOException {
        //copy path reference
        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaTutorial1\\src\\javadanEsintiler";

        FileInputStream fis = new FileInputStream(filePath);

        int c ;
        while ((c = fis.read()) != -1){ // bu kodu input olarak verilen dosyada son karaktere kadar çalış demek
            System.out.print((char)c);
        }

        System.out.println();
        System.out.println("fis = " + fis);



    }
}
