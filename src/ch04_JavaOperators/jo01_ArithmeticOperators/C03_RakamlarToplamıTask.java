package ch04_JavaOperators.jo01_ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamıTask {

    public static void main(String[] args) {

        //kullanıcıdan alınan 3 basamaklı bir sayıyı rakamları toplamını print eden kod
        // input 123 output 6


        Scanner input = new Scanner(System.in);

        System.out.println("3 basamaklı bir sayı giriniz");

        int sayi = input.nextInt();

        System.out.println();

        int birlerbasamagi = sayi % 10 ;

        sayi /= 10; //sayi birler basamağından kurtuldu

        System.out.println("sayi = " + sayi);

        int onlarbasamagi = sayi % 10 ;

        sayi /= 10; //onlar basamağından kurtuldu

        int yuzlerbasamagi = sayi % 10;

        int toplam =  birlerbasamagi + onlarbasamagi + yuzlerbasamagi;

        System.out.println("toplam = " + toplam);





    }
}
