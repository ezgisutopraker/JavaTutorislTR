package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen  pozitof bir tamsayının 2 veya daha fazla
        // basamaklı olmasını
        // kontrol eden code create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");

        int sayi = input.nextInt();

        String result = sayi <100 && sayi >=10 ? "Sayı iki basamaklıdır" : "Sayı iki basamaklı değildir";

        System.out.println("result = " + result);


    }
}
