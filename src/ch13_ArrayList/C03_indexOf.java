package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf(); -> list içinde istenen elemanın index değerin return eder

        ArrayList <String> city = new ArrayList<>(Arrays.asList("balıkesir" , "izmir" , "aydın" , "kocaeli" , "ısparta"));
        System.out.println("city = " + city);

        ArrayList<String> country = new ArrayList<>(List.of("AMERİKA" ,"RUSYA" , "TÜRKİYE" , "MADAGASKAR"));
        System.out.println("country = " + country);

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun")); //city.indexOf("samsun") = -1

        System.out.println("city.indexOf(\"balıkesir\") = " + city.indexOf("balıkesir")); //city.indexOf("balıkesir") = 0

        country.add("İNGİLTERE");
        System.out.println("country.indexOf(\"İNGİLTERE\") = " + country.indexOf("İNGİLTERE"));
        System.out.println("country.lastIndexOf(\"İNGİLTERE\") = " + country.lastIndexOf("İNGİLTERE")); //

        country.add("RUSYA");
        System.out.println("country.indexOf(\"RUSYA\") = " + country.indexOf("RUSYA")); //1
        System.out.println("country.lastIndexOf(\"RUSYA\") = " + country.lastIndexOf("RUSYA")); //5

        System.out.println("country = " + country);


    }
}
