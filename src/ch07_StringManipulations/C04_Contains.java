package ch07_StringManipulations;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class C04_Contains {

    public static void main(String[] args) {
        /*
String icersinde istenen stringin varlığını kontrol eder boolean return eder..

 */
        String str = "Java ile günler";

        System.out.println("str = " + str);

        System.out.println("str.contains(\"Java\") = " + str.contains("Java")); //true

        System.out.println("str.contains(\"java\") = " + str.contains("java")); //false

        System.out.println("str.contains(\" \") = " + str.contains(" ")); //true

        System.out.println("str.contains(\"\") = " + str.contains("")); //true (her iki karakter arası hiçlik)

        System.out.println("\"\".length() = " + "".length());

        // girilen ürünün var olup olmadığını kontrol eden code ternary ile

        String buzdolap = "elma peynir yumurta zeytin bal kaymak";

        Scanner input = new Scanner(System.in);

        System.out.println("bir ürün gir");

        String urun = input.nextLine();

        String result = buzdolap.contains(urun) ? "evet ürün dolapta var" : "bu ürün dolapta yok";

        System.out.println("result = " + result);











    }
}
