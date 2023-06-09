package ch07_StringManipulations;

import java.util.Scanner;

public class C03_charAt {
    public static void main(String[] args) {

/*
       charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
       index değeri 0'dan başlar
        */

        String city = "İstanbul";

        System.out.println("city.charAt(0) = " + city.charAt(0));

        System.out.println("city.charAt(1) = " + city.charAt(1));

        char cityBirinciIndexElemani = city.charAt(1);

        System.out.println("cityBirinciIndexElemani = " + cityBirinciIndexElemani);


        int sonharfindex = city.length()-1;

        System.out.println("sonharfindex = " + sonharfindex);

        System.out.println("city.charAt(sonharfindex) = " + city.charAt(sonharfindex));

       //uygun variablea atama

        char sonharf = city.charAt(sonharfindex);

        System.out.println("sonharf = " + sonharf);


        //GİRİLEN KELİMENİN ORTADAKİ HARFİ


        Scanner input = new Scanner(System.in);
        System.out.println("şehir ismi gir");

        String city2 = input.nextLine();

        if (city2.length() % 2 == 0) {
            System.out.println("orta kelime yoktur");

        }else {

            System.out.println("city2.charAt(city2.length()/2) = " + city2.charAt(city2.length() / 2));

            char ortaharf = city2.charAt(city2.length()/2);

            System.out.println("ortaharf = " + ortaharf);
        }

















    }
}
