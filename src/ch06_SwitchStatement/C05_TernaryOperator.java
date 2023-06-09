package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");

        int sayi = input.nextInt();

        int yarisi = sayi /2 ;


        String sonuc = (sayi % 2 == 0) ? String.valueOf(yarisi) : "Girilen sayı tek olduğu için yarısı tam sayı değildir";

        System.out.println("sonuc = " + sonuc);




    }
}
