package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {
        //isEmpty(); -> listin boş olmup olmamasını kontrol eder true/false return eder
        //clear();-> listin tüm elemanlarını siler

        ArrayList<String> country = new ArrayList<>(List.of("AMERİKA" ,"RUSYA" , "TÜRKİYE" , "MADAGASKAR"));
        System.out.println("country = " + country);

        System.out.println("country.isEmpty() = " + country.isEmpty()); //country.isEmpty() = false

        country.clear();
        System.out.println("country = " + country);
        System.out.println("country.isEmpty() = " + country.isEmpty());
    }
}
