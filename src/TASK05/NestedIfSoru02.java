package TASK06;

import java.util.Scanner;

public class NestedIfSoru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.



		 */


		Scanner input = new Scanner(System.in);

		System.out.println("harf gir");

		char harf = input.next().charAt(0);

		if (Character.isLowerCase(harf)) {

			if (harf == 'a') {

				System.out.println("ilk küçük harf");
			} else System.out.println("ilk küçük harf değil");

		} else if (Character.isUpperCase(harf)) {

			if (harf == 'Z') {

				System.out.println("son büyük harf");
			} else System.out.println("son büyük harf değil");


		}

	}}
