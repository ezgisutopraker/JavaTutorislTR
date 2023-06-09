package TASK06;

import java.util.Scanner;

public class NestedIfSoru03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */


		Scanner input = new Scanner(System.in);

		System.out.println("password gir");

		int sayi = input.nextInt();

		if (sayi % 5 == 0) {

			if (sayi % 10 == 0) {
				System.out.println("5e bölünen çift sayi");

			} else System.out.println("5e bölünen tek sayı");


		} else System.out.println("tekrar deneyin");

	}
}
