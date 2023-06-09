package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise //nester burada devereye giriyor
10 dan kucuk olup olmadigini kontrol ediniz.

10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.

Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */



        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");

        int sayi = input.nextInt();

       String result = sayi >= 0 ? // en dıştaki şart

                (sayi < 10 ? "rakam" : "pozitif tam sayı") // içteki şart

        : //dıştaki şartın false olma ihtimali
        "negatif sayi";

        System.out.println("result = " + result);




    }
}
