package ch08_Loops.L02_WhileLoop.TASK08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        Scanner input = new Scanner(System.in);

        int girilen = 0;

        int toplam = 0;

        while (toplam<333){
            System.out.println("sayı giriniz");
            int sayi= input.nextInt();
            toplam += sayi;
            girilen++;

        }
        System.out.println("toplam = " + toplam);
        System.out.println("girilen = " + girilen);


    }


}
