package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {


        int a = 3;

        if (a>0) {

            System.out.println("pozitif");

        }else {
            System.out.println("negatif");

        }


        //ternary ile

        String sonuc = a > 0 ? "pozitif" : "negatif";

        System.out.println("sonuc = " + sonuc);

        System.out.println(a>0 ? "pozitif" : "negatif");


        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz

        int sayi1 = 23;
        int sayi2 = 53;

         int min = sayi1>sayi2 ? sayi2 : sayi1; //Math.min

        System.out.println("min = " + min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
//           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
//           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.


        int d = -1;

        int abs = d < 0 ? (-1*d) : (d);

        System.out.println("abs = " + abs);

        System.out.println(Math.abs(d));

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
// farkli isaretli ise "Islem yapamam" mesaji veriniz             //return type String


        int e = 12;
        int f = 23;

       Object obj=  (e>0 && f>0) || (e<0 && f<0) ? (e*f) : "işlem yapamam";

       //eğer şartlar iki farklı değer return ediyorsa atamayı parent classtan yapmak gerekir.

        System.out.println("obj = " + obj);


        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);

        System.out.println("sayı gir");

        int sayi = input.nextInt();

        //sayı % 2 = 0

      Object result =  sayi % 2 == 0 ? "çift sayı"  : "tek sayı";

        System.out.println("result = " + result);




    }
}
