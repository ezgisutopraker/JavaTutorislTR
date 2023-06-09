package ch08_Loops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {

        //girilen pozitif sayıdan 100e kadar 4ün katı

        Scanner input =new Scanner(System.in);

        System.out.println("sayı giriniz");

        int sayi = input.nextInt();


            if (sayi<0) {
                System.out.println("pozitif sayi girmelisin");
            }else {
                for (int i = sayi ; i <=100 ; i++) {
                    if (i % 4 == 0){
                        System.out.print(i + " ");

                }
            }

        }




    }
}
