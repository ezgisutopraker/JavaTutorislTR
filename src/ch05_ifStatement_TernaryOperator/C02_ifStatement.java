package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

        //girilen yaşın 18den büyüklüğünü kontrol eden code
        // 18den küçükse ehliyet alamazsınız print ediniz.


        Scanner input = new Scanner(System.in);

        System.out.println("yaşını gir");
        int yas = input.nextInt();

        if (yas >= 18) {

        System.out.println("ehliyet alabilir");

    }else { //yukarıdan sonra else yas 18den küçükse çalışır

            System.out.println("ehliyet alamaz");
        }























    }
}
