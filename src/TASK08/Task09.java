package TASK08;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */

        Scanner input =new Scanner(System.in);

        System.out.println("5 adet sayı giriniz");

        int toplam = 0;

        for (int n = 0; n < 5; n++) {
            int sayi=input.nextInt();

            if (sayi<10 || sayi>20){
                toplam = toplam + sayi;
            }

        }
        System.out.println("toplam = " + toplam);


    }
}
