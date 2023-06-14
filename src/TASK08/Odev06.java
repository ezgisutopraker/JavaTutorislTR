package TASK08;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner input =new Scanner(System.in);

        System.out.println("1den büyük bir tam sayı giriniz");

        int j = input.nextInt();

        // double i = Math.pow(sayi,2);



        int toplam = 0;


        for (int i = 1; i <= j ; i++) {
            int kare = i * i;
            toplam += kare;

        }

        System.out.println("toplam = " + toplam);




    }


    }

