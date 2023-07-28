package ch26_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
                /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.
   */

        Scanner input = new Scanner(System.in);
        System.out.println("hava sıcaklığı giriniz");
        int havaSicakligi = input.nextInt();

        try {
            sicaklikKontrol(havaSicakligi);
        } catch (IOException e) {
            System.out.println("e = " + e);
            System.out.println("e.getMessage() = " + e.getMessage());
        }


    }

    private static void sicaklikKontrol(int celcius) throws IOException{

            if(celcius < 10 ){
                throw new IOException("hava sıcaklığı 10 derecenin altında olamaz");
            }else System.out.println("girilen hava sıcaklığı doğru");




    }

}

