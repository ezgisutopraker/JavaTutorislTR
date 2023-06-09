package ch03_ScannerClass_TypeCasting;


import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {


     /*   Verilen 3 tane int vardır.
        Int'lerin toplamlarını yazdırın  */


        //Kodu aşağıya yazınız.


     // 1-  int a = 5;
     // 1-  int b = 6;
     // 1-  int c = 7;

     // 1-  System.out.println("a+b+c = " + (a + b + c));


        /*    Verilen 2 tane int (num1, num2),
        Int'lerin farkını yazdırın. */



        //Kodu aşağıya yazınız.

     // 2-  int a = 50;
     // 2-  int b = 30;

     // 2-  System.out.println("a-b = " + (a - b));


         /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

     // 3-  int num1 = 90;
     // 3-  int num2 = 40;
     // 3-  int num3 = 10;
     // 3-  int num4 = 10;

     // 3-  System.out.println(  ((num1 - num2) - num3)  - num4   );


        /* Verilen iki int hakkında (num1,  num2),
        İlk int'i ikinci int'e bölün.
        Sonucu yazdırın. */

     // 4-  int num1 = 45;
     // 4-  int num2 = 9;

     // 4-  System.out.println(num1/num2);


        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

     // 5-  int num1 = 30 ;
     // 5-  int num2 = 6;

     // 5-  int sonuc= num1 / num2;

     // 5-  System.out.println("sonuc = " + sonuc);


         /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */


     // 6-  double num1 = 2.5;
     // 6-  double num2 = 3.8;
     // 6-  double num3 = 16.7;

     // 6-  double sonuc = num1*num1*num3;

     // 6-  System.out.println("sonuc = " + sonuc);


         /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

     // 7-   int num1 = 67 ;
     // 7-   int num2 = 22 ;

     // 7-   System.out.println(num1%num2);



     /*   Bir integer oluşturun ve değeri 13 olsun.
                Başka bir integer daha oluşturun ve değeri 10 olsun.
                Print kodunun içine Ilk int ,ikinci int'ten büyüktür yazın. (>,< simgeleri ile)
                Console' da 'true' yazısını görmelisiniz.        */


     // 8-   int num1 = 13;
     // 8-   int num2 = 10;

     // 8-   System.out.println("num1 > num2 = " + (num1 > num2));



        /* İki integer oluştur.
           İkisinin de değeri 13 olsun.
           Print kodunun içine, ilk int ikinci inte küçük veya eşittir yazın ve yazdırın.
           Console'da true yazısını görmelisiniz.
           Örnek:   15>=15  */


     // 9-  int a =13;
     // 9-  int b =13;

     // 9-  System.out.println(a>=b);


 /*    2 tane String oluşturun.
          String 1 "Apple" String 2 "Apple"
          İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.  */

        // Kodu aşağıya yazdırınız.

      // String str1 = "Apple";
      // String str2 = "Apple";

      // System.out.println("str1 == str2 = " + (str1 == str2));


        /*    2 String oluşturunuz.
          İlk String'in değeri "Techno Study", ikinci String'in değeri de "Techno Study" olsun.
          İlk String'in ikinci String'e eşit olmadığını doğrulayın. örn: (  !=    işareti ile)
          Eğer eşit değilse cevap true, eğer eşitse cevap false olacaktır.
          Cevabı yazdırın.  */

        //Kodu aşağıya yazınız.

      // 11- String str1 = "A";
      // 11- String str2 = "A";

      // 11- System.out.println("str1 != str2 = " + (str1 != str2));


        /*
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */

        Scanner input = new Scanner(System.in);

     //  System.out.println("saniyeyi girin");

     //  int sure = input.nextInt();

     //  int saat = sure / 3600 ;
     //  int dakika =(sure % 3600)/60;
     //  int saniye =(sure % 3600)%60;

     //  System.out.println("saat = " + saat);
     //  System.out.println("dakika = " + dakika);
     //  System.out.println("saniye = " + saniye);


        /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    //  int inek = 15;
    //  int koyun = 20;
    //  int tavuk  = 18;

    //  int toplamayak = inek*4 + koyun*4 + tavuk*2;

    //  System.out.println("toplamayak = " + toplamayak);



        /* Soru 5:
         * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
         */


      //  System.out.println( ( (  (120/60)  *  10) + 20   )    - 40    );


        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */

     //  System.out.println("sayı giriniz");

     //  int sayi = input.nextInt();

     //  System.out.println("birler basamağı = " +(sayi%10));

     //  int a = sayi/10;

     //  System.out.println("onlar basamağı = " +  (a%10));

     //  int b = a/10;

     //  System.out.println("yüzler basamağı = " + (b%10));



        /*
         * /*
         * Girilen saati  saniyeye çeviren program yazınız
         * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */



















    }







    }




