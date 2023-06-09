package ch07_StringManipulations;

import java.util.Scanner;
import java.util.SortedMap;

public class C09_replace_replaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

        String str = "ezberlemek beyne ihanettir 12356 ^#^%$ () :";

        System.out.println("str.replace('a','$') = " + str.replace('a', '$'));

        System.out.println("str.replace(\"tir\",\"*\") = " + str.replace("tir", "*"));

        System.out.println("str.replaceFirst(\"e\", \"*\") = " + str.replaceFirst("e", "*"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)


//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

//   "\\w" tum harf ve rakamlar [A-Z a-z 0-9]

        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));

        System.out.println("str.replaceAll(\"\\\\W\", \"*\") = " + str.replaceAll("\\W", "*"));

        System.out.println("str.replaceAll(\"\\\\D\", \"*\") = " + str.replaceAll("\\D", "*"));

        System.out.println("str.replaceAll(\"[A-Z a-z]\",\"*\") = " + str.replaceAll("[A-Z a-z]", "*"));

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
// formatta print eden code create ediniz.

// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234



        String isim = "Ezgisu";
        String soyisim = "Topraker";
        String kartNo = "1234567891234567";

        String yeniIsimCiktisi= isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");

        System.out.println("yeniIsimCıktisi = " + yeniIsimCiktisi);

        String yeniSoyIsimCiktisi= soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println("yeniSoyIsimCiktisi = " + yeniSoyIsimCiktisi);

        String yenikartNo = "**** **** **** " + kartNo.substring(12);

        System.out.println("yenikartNo = " + yenikartNo);

        String yeniKartNoRegex = kartNo.substring(0,12).replaceAll("[0-9]", "*") + kartNo.substring(12);

        System.out.println("yeniKartNoRegex = " + yeniKartNoRegex);

        String isimsoyisimyanyana= yeniIsimCiktisi.concat(yeniSoyIsimCiktisi);
        System.out.println("isimsoyisimyanyana = " + isimsoyisimyanyana);


    }
}
