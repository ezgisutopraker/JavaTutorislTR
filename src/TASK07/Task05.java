package TASK07;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..

         */


        Scanner input = new Scanner(System.in);
        System.out.println("ad giriniz");

        String ad = input.nextLine();

        System.out.println("soyad giriniz");

        String soyad = input.nextLine();

        int ad1 = ad.length();
        int soyad1 = soyad.length();

        System.out.print(ad.substring(0, 1).toUpperCase() + ad.substring(1,ad1) +" "
                + soyad.substring(0, 1).toUpperCase() + soyad.substring(1,soyad1));




    }
}
