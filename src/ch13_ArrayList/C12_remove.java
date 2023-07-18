package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        //remove --> listteki istenen elemanı siler

        ArrayList<String> country = new ArrayList<>(List.of("AMERİKA" ,"RUSYA" , "TÜRKİYE" , "MADAGASKAR"));

        Collections.sort(country);

        System.out.println("country.remove(\"NORVEÇ\") = " + country.remove("NORVEÇ")); //country.remove("NORVEÇ") = false
        System.out.println("country.remove(\"AMERİKA\") = " + country.remove("AMERİKA")); //country.remove("AMERİKA") = true
        System.out.println("country.remove(0) = " + country.remove(0)); //country.remove(0) = MADAGASKAR
        System.out.println("country = " + country); //country = [RUSYA, TÜRKİYE]

        country.add("Almanya");
        country.add("Hollanda");
        country.add("Ukrayna");
        country.add("Almanya");

        System.out.println("country = " + country); //country = [RUSYA, TÜRKİYE, Almanya, Hollanda, Ukrayna, Almanya]

        System.out.println("country.remove(\"Almanya\") = " + country.remove("Almanya")); //true

        System.out.println("country = " + country); //country = [RUSYA, TÜRKİYE, Hollanda, Ukrayna, Almanya]

        ArrayList<String> city = new ArrayList<>(Arrays.asList("balıkesir" , "izmir" , "aydın" , "kocaeli" , "ısparta"));

        country.addAll(city);

        System.out.println("country = " + country); //country = [RUSYA, TÜRKİYE, Hollanda, Ukrayna, Almanya, balıkesir, izmir, aydın, kocaeli, ısparta]

        System.out.println("country.removeAll(city) = " + country.removeAll(city)); //true

        System.out.println("city = " + city); //city = [balıkesir, izmir, aydın, kocaeli, ısparta]
        System.out.println("country = " + country);//country = [RUSYA, TÜRKİYE, Hollanda, Ukrayna, Almanya]


    }
}
