package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        // method listte istenen elemanın varlığını kontrol eder true/false return eder

        ArrayList<String> country = new ArrayList<>(List.of("AMERİKA" ,"RUSYA" , "TÜRKİYE" , "MADAGASKAR"));

        System.out.println("country.contains(\"amerika\") = " + country.contains("amerika")); //false
    }
}
