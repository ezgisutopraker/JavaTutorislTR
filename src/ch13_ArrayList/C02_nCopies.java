package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        //nCopies methodu kopyalamak isteidğiniz değeri verdiğniz sayi kadar copy eder.

        ArrayList<String> country = new ArrayList<>(List.of("AMERİKA" ,"RUSYA" , "TÜRKİYE" , "MADAGASKAR"));

        System.out.println("country = " + country);

        ArrayList <String> city = new ArrayList<>(Arrays.asList("balıkesir" , "izmir" , "aydın" , "kocaeli" , "ısparta"));

        System.out.println("city = " + city);

        ArrayList <String> yeniList = new ArrayList<> (Collections.nCopies(7,"NEW ZEALAND"));

        System.out.println("yeniList = " + yeniList);

        //addAll methodu

      //  city.addAll(country);
      //  System.out.println("city = " + city); //city = [balıkesir, izmir, aydın, kocaeli, ısparta, AMERİKA, RUSYA, TÜRKİYE, MADAGASKAR]

        // belirlenen indexe ekleme

        city.addAll(1,country);

        System.out.println("city = " + city);
        System.out.println("country = " + country);

        //city = [balıkesir, AMERİKA, RUSYA, TÜRKİYE, MADAGASKAR, izmir, aydın, kocaeli, ısparta]
        //country = [AMERİKA, RUSYA, TÜRKİYE, MADAGASKAR]


    }
}
