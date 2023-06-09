package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

/*
  TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

 */

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı gir");

        int sayi1 = input.nextInt();

        System.out.println("ikinci sayıyı gir");

        int sayi2 = input.nextInt();

        // 4 işlem sonucunu buraya yazalım kodları

        int toplam = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpma = sayi1 * sayi2;
        int bolme = sayi1 / sayi2;

        System.out.println("hangi işlem sonucunu görmek istersin" + "\n" + "toplam için 1 e" + "\n" + "çıkarma için 2 e" + "\n" +
                "çarpma için 3 e" + "\n" + "bölme için 4 e");

        int secim = input.nextInt();

        if (secim==1) {

            System.out.println("toplam = " + toplam);

        } else if (secim == 2) {

            System.out.println("cikarma = " + cikarma);

        } else if (secim == 3 ) {

            System.out.println("carpma = " + carpma);

        }else if (secim == 4) {

            System.out.println("bolme = " + bolme);



    }

        }












    }

