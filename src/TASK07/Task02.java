package TASK07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner input = new Scanner(System.in);

        System.out.println("password giriniz");

        String sifre = input.nextLine();

        char ilkKarakter = sifre.charAt(0);
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (sifre.length() >= 6 && Character.isUpperCase(ilkKarakter) && Character.isDigit(sonKarakter)){
            System.out.println("şifre doğru");
        }else System.out.println("şifre yanlış");







    }
}
