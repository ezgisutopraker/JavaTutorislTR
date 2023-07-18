package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {

        //get(); -> listte istenen index elemanı return eder (arr[3] -> arr'in 3. index elemanı ver)

        ArrayList<String> city = new ArrayList<>(Arrays.asList("balıkesir" , "izmir" , "aydın" , "kocaeli" , "ısparta"));
        System.out.println("city = " + city);

        System.out.println("city.get(1) = " + city.get(1));






    }
}
