package ch08_Loops;

import java.util.Scanner;

public class C04_foorLoop {
    public static void main(String[] args) {
        /*
       Interview Question
               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
           1  - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
           2  - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
           3  - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" print eden code create ediniz
*/
        Scanner input =new Scanner(System.in);

        System.out.println("100den küçük bir tam sayı giriniz");

        int sayi = input.nextInt();

        if (sayi >=100){
            System.out.println("yüzden küçük sayı gir");

        }else {

            for (int i = 0; i <sayi; i++) {
                if (i % 5 == 0 && i % 3 == 0){
                    System.out.println("JavaCAN");
                } else if (i % 5 == 0) {
                    System.out.println("CAN'dır");

                } else if ( i % 3 == 0) {
                    System.out.println("Java");

                }else System.out.println("bu sayı ne 3ün ne de 5in katıdır" + i);

            }
        }






    }
}
