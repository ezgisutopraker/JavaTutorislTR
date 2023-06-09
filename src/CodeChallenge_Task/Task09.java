package CodeChallenge_Task;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı sayı gir");

        int sayi = input.nextInt();

        if (sayi < 1000 && sayi>=100 ){

            int yuzler = sayi/100 ;
            int onlar = sayi/10 % 10;
            int birler= sayi % 10;



            switch (yuzler) {
                case 1 :
                    System.out.print("Yüz"); break;
                case 2 :
                    System.out.print("İki Yüz"); break;
                case 3 :
                    System.out.print("Üç Yüz"); break;
                case 4 :
                    System.out.print("Dört Yüz"); break;
                case 5 :
                    System.out.print("Beş Yüz"); break;
                case 6 :
                    System.out.print("Altı Yüz"); break;
                case 7 :
                    System.out.print("Yedi Yüz"); break;
                case 8 :
                    System.out.print("Sekiz Yüz"); break;
                case 9 :
                    System.out.print("Dokuz Yüz");
                    break;
                default:
                    System.out.println("yanlış sayı girdiniz");




            }

            switch (onlar){
                case 0 :
                    System.out.print(""); break;
                case 1 :
                    System.out.print(" On"); break;
                case 2 :
                    System.out.print(" Yirmi"); break;
                case 3 :
                    System.out.print(" Otuz"); break;
                case 4 :
                    System.out.print(" Kırk"); break;
                case 5 :
                    System.out.print(" Elli"); break;
                case 6 :
                    System.out.print(" Altmış"); break;
                case 7 :
                    System.out.print(" Yetmiş"); break;
                case 8 :
                    System.out.print(" Seksen"); break;
                case 9 :
                    System.out.print(" Doksan"); break;
                default:
                    System.out.println("yanlış sayı girdiniz");




            }

            switch (birler){
                case 0 :
                    System.out.print(""); break;
                case 1 :
                    System.out.print(" Bir"); break;
                case 2 :
                    System.out.print(" İki"); break;
                case 3 :
                    System.out.print(" Üç"); break;
                case 4 :
                    System.out.print(" Dört"); break;
                case 5 :
                    System.out.print(" Beş"); break;
                case 6 :
                    System.out.print(" Altı"); break;
                case 7 :
                    System.out.print(" Yedi"); break;
                case 8 :
                    System.out.print(" Sekiz"); break;
                case 9 :
                    System.out.print(" Dokuz"); break;



                default:
                    System.out.println("yanlış sayı girdiniz");
    }
}}}
