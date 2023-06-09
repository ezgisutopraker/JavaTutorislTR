package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {

    public static void main(String[] args) {

        boolean basariliMi = true ;
        // String basari = basariliMi ;

        String basari = String.valueOf(basariliMi);
        System.out.println("basari = " + basari);

        double d = 17 ;

        System.out.println("d = " + d);

        int sayi1 = 33;
        int sayi2 = 4;

        System.out.println("sayi1/sayi2 = " + sayi1 / sayi2); //8

        byte by = 127;
        int number = by ; //küçük kutuyu büyük kutuya ekleme

        int num = 123 ;
        double d1 = 14 ;
        double d2 = d1/num;
        System.out.println("d1/num = " + d1 / num); //ondalıklı sayı değeri

        double db1 = 14.66 ;
        int i = (int) db1; // büyük olan kutuyu küçüğe ekleme

        int num3 =150;
        byte by1 = (byte) num3;
        System.out.println("by1 = " + by1); //by1=-106

        //input : a output : girdiğiniz 'a' değeri ascii değeri : 97

        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter gir");
        char ch = input.nextLine().charAt(0);
        System.out.println("ch = " + (ch+0));

        System.out.println("ch = " + ch);
        System.out.println("ch = " + (int) ch);

        String str = "a";
        System.out.println("str.hashCode() = " + str.hashCode());




    }



}
