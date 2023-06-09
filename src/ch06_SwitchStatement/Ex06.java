package ch06_SwitchStatement;

import java.util.Scanner;

public class Ex06 {


    public static void main(String[] args) {

        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */

        Scanner input = new Scanner(System.in);

        System.out.println("cinsiyetinizi giriniz");
        String cinsiyet = input.nextLine().toLowerCase();

        switch (cinsiyet) {

            case "kadın":
                System.out.println("yaşınızı giriniz");
                int cevap = input.nextInt();
                System.out.println("prim gününüz kaçtır ");
                int cevap2 = input.nextInt();

                if (cevap > 60 && cevap2 > 6000) {
                    System.out.println("emeklilik hakedilmiştir.");

                } else if (cevap < 60 && cevap2 < 6000) {
                    System.out.println("emekli olmanıza" + (60 - cevap) + " yıl" + "prim gününüzün dolmasına" + (6000 - cevap2) + " gün kalmıştır.");
                }else if (cevap > 60 && cevap2 < 6000) {
                    System.out.println("emekli olmanıza " + (6000 - cevap2) + " gün kalmıştır.");
                } else if (cevap < 60 && cevap2 > 6000) {
                    System.out.println("emekli olmanıza " + (60- cevap)+ " yıl kalmıştır.");

                }else System.out.println("yanlış veri girişi");

                break;

            case "erkek":
                System.out.println("yaşınızı giriniz");
                int cevap3 = input.nextInt();
                System.out.println("prim gününüz kaçtır ");
                int cevap4 = input.nextInt();

                if (cevap3 > 65 && cevap4 > 7000) {
                    System.out.println("emeklilik hakedilmiştir.");

                } else if (cevap3 < 65 && cevap4 < 7000) {
                    System.out.println("emekli olmanıza " + (65 - cevap3) + " yıl " + " prim gününüzün dolmasına " + (7000 - cevap4) + " gün kalmıştır.");

                }else if (cevap3 > 65 && cevap4 < 7000) {
                      System.out.println("emekli olmanıza " + (7000 - cevap4) + " gün kalmıştır.");
                } else if (cevap3 < 65 && cevap4 > 7000) {
                    System.out.println("emekli olmanıza " + (65 - cevap3) + " yıl kalmıştır.");

                }else System.out.println("yanlış veri girişi");

                break;

        }
    }
}